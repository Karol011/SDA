package Inne.Data;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/*

•	 Napisz aplikację która po odpowiedzi użytkownika na pytania:
   1) Podaj datę urodzenia w formacie: yyyy-MM-dd":
   2) Kobieta, czy mężczyzna (k/m) - mężczyźni żyją średnio o 10 lat krócej
   3) Czy palisz papierosy? y/n   (palący żyją średnio 9 lat i 3 miesiące krócej)
   4) Czy żyjesz w stresie? (jeśli tak, istnieje 10% prawdopodobieństwo, że umrzesz na zawał serca w wieku 60 lat)

Wskazówka dot. ‘prawdopodobieństwa’:

Random generator = new Random();
int losowaLiczba = generator.nextInt(100);
if (losowaLiczba < 10) {
   // 10 %
}
         ...poda użytkownikowi przybliżoną datę śmierci. Załóż, że "startowa" długość życia to 100 lat. Aplikacja ma podawać datę z  
               dokładnością do miesiąca. Możesz dodać dodatkowe warunki. Możesz użyc klasy java.time.Period
* Wyświetl na końcu, ile użytkownik stracił czasu na bezsensownym sprawdzaniu daty śmierci
**(+300pkt) Dodaj nowe dodatkowe warunki i randomizuj niektóre wartości

 */
public class HowLongWillYouLive {
    public static void main(String[] args) {
        Date startCountingSeconds = new Date();
        askQuestions();
        Date endCountingSeconds = new Date();
        int numSeconds = (int)((endCountingSeconds.getTime() - startCountingSeconds.getTime()) / 1000);
        System.out.printf("\nBTW: You wasted %,d seconds counting your date of death...",numSeconds);

    }

    private static void askQuestions() {
        System.out.println("Answer those questions and you will know how long will you live \n" +
                "1. Your date of birth? (yyyy-MM-dd)");
        LocalDate expectedDateOFDeath = getDateOfBirth();       //get date of birth from user and calculate date of death
        LocalDate dateOFBirth = expectedDateOFDeath.plusYears(-100);
        LocalDate expectedDateOFDeathSex = checkSex(expectedDateOFDeath);    //updating dateOFDeath variable (man or woman)
        System.out.println(expectedDateOFDeathSex);                        //checking

        LocalDate expectedDateOFDeathSmoker = checkIfSmoker(expectedDateOFDeathSex); //updating dateOFDeath variable (smoker or not)
        System.out.println(expectedDateOFDeathSmoker);                          //checking

        LocalDate expectedDateOFDeathStress = checkIfStressFullEnvironment(expectedDateOFDeath, expectedDateOFDeathSmoker); //update check if stressfull
        System.out.println(expectedDateOFDeathStress);                          //checking

        showLifeExpectancy(dateOFBirth,expectedDateOFDeathStress);              //print life expectancy
    }

    private static boolean hearAttackStatus() {
        return true;
    }


    private static LocalDate getDateOfBirth() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String dateOFBirthString;
        try {
            do {
                dateOFBirthString = scanner.nextLine();
            } while (!dateOFBirthString.matches("\\d{4}-\\d{2}-\\d{2}"));
            LocalDate dateOfBirth = LocalDate.parse(dateOFBirthString, formatter);
            LocalDate expectedDateOfDeath = dateOfBirth.plusYears(100);
            return expectedDateOfDeath;
        } catch (DateTimeParseException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("1. Your date of birth? (yyyy-MM-dd)");
            do {
                dateOFBirthString = scanner.nextLine();
            } while (!dateOFBirthString.matches("\\d{4}-\\d{2}-\\d{2}"));
            LocalDate dateOfBirth = LocalDate.parse(dateOFBirthString, formatter);
            LocalDate expectedDateOfDeath = dateOfBirth.plusYears(100);
            return expectedDateOfDeath;
        }

    }

    private static LocalDate checkSex(LocalDate expectedDateOFDeath) {
        Scanner scanner = new Scanner(System.in);
        String sex;
        Random random = new Random();
       int randomNumber = random.nextInt(10)-5;
        do {
            System.out.println("2. Are you a man or a woman? (m/w) Men are more likely to live shorter");
            sex = scanner.nextLine().toLowerCase().trim();

        } while (!sex.matches("[w|m]"));
        if (sex.equals("m")) {
            expectedDateOFDeath = expectedDateOFDeath.plusYears(-10+randomNumber).plusMonths(-9+randomNumber).plusDays(randomNumber);
        }
        return expectedDateOFDeath;
    }

    private static LocalDate checkIfSmoker(LocalDate expectedDateOFDeath) {
        Scanner scanner = new Scanner(System.in);
        String smoker;
        Random random = new Random();
        int randomNumber = random.nextInt(10)-5;
        do {
            System.out.println("3. Do you smoke? y/n");
            smoker = scanner.nextLine().toLowerCase().trim();

        } while (!smoker.matches("[y|n]"));
        if (smoker.equals("y")) {
            expectedDateOFDeath = expectedDateOFDeath.plusYears(-9+randomNumber).plusMonths(randomNumber).plusDays(randomNumber);
        }

        return expectedDateOFDeath;
    }

    private static LocalDate checkIfStressFullEnvironment(LocalDate expectedDateOfDeath, LocalDate expectedDayOFDeathSmoker) {
        Scanner scanner = new Scanner(System.in);
        String environment;
        do {
            System.out.println("Do you live in a stressful environment? (y/n)");
            environment = scanner.nextLine().toLowerCase().trim();

        } while (!environment.matches("[y|n]"));
        if (environment.equals("y")) {
            Random random = new Random();
            int generatedNumber = random.nextInt(100) + 1;
            if (generatedNumber < 11) {
                System.out.println("You will die in the age of 60 due to heart attack");
                hearAttackStatus();
                return expectedDateOfDeath.plusYears(-40);
            }

        }
        return expectedDayOFDeathSmoker;

    }
    private static void showLifeExpectancy(LocalDate dateOfBirth, LocalDate dateOfDeath) {
        Random random = new Random();
        int randomNumber = random.nextInt(10)-5;
        if (hearAttackStatus()) {
            Period lifeExpectancy = Period.between(dateOfBirth, dateOfDeath);
            System.out.println("you will live for: " + lifeExpectancy.getYears() + " years, " +
                    lifeExpectancy.getMonths() + " months, " +
                    lifeExpectancy.getDays() + " days");
        }

    }
}
