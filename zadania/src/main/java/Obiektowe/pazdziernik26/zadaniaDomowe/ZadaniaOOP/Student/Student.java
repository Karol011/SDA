package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.ZadaniaOOP.Student;

import java.util.Scanner;

/*
Zadanie 1
Stwórz klasę Student która posiada pola:
nr indeksu
imie
nazwisko
płeć (literka, K lub M)

Stworz dla tej klasy odpowiedni konstrutkor.

Stwórz 3 instancje obiektu student (zrob to w osobnej klasie, osobnej metodzie) i wypisz ich pola na ekran.

*/ //zad 1
/*
Zadanie 2
Modyfikacja do zadania 1:

Stwórz oddzielną klasę (np. Main) w której użytkownik korzystający z aplikacji 'kreuje' obiekt studenta.
Czyli: uruchamiam aplikację i ona pyta mnie o imie, nazwisko, numer indeksu (6 cyfrowa liczba) i płeć (1 char).
Jeśli podałem złe dane, to poproś użytkownika o powtórzenie. Kiedy wszystkie dane są poprawne stwórz
obiekt Studenta.

Następnie wypisz wszystkie informacje o studencie.

*///zad 2
/*
Zadanie 3
Modyfikacja do zadania 2:
Napisz w klasie student metodę "przedstawSię():void" która wypisuje wszystkie parametry w postaci ślicznego string'a. Np.:

Cześć! Jestem Janek Kowalski, jestem mężczyzną i mój numer indeksu to: 666666.

Na końcu maina (modyfikacja #1) użyj tej metody i wypisz powitanie.
 *///zad 3
public class Student {
    int indexNumber;
    String name;
    String surname;
    char sex;

    public Student(int indexNumber, String name, String surname, char sex) {
        this.indexNumber = indexNumber;
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public static String askAboutName() {
        System.out.println("Type the name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while
        (!(name.matches("[a-zA-Z]+"))) { //wykonuj dopoki 'name' nie sklada sie z samych liter
            System.out.println("incorrect name, try again");
            name = scanner.nextLine();
        }
        System.out.println("Name seems good");
        return name;
    }

    public static String askAboutSurname() {
        System.out.println("Type the surname");
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.nextLine();
        while (!(surname.matches("[a-zA-Z]+"))) {
            //wykonuj dopoki 'surname' nie sklada sie z samych liter
            System.out.println("incorrect surname, try again");
            surname = scanner.nextLine();
        }
        System.out.println("surname seems good");
        return surname;
    }

    public static int askAboutIndexNumber() {
        System.out.println("Type the index number (6 digits!)");
        Scanner scanner = new Scanner(System.in);
        int indexNumber = scanner.nextInt();
        while (indexNumber < 100000 || indexNumber > 999999) {
            System.out.println("incorrect index number, try again");
            indexNumber = scanner.nextInt();
        }
        System.out.println("index seems good");
        return indexNumber;
    }

    public static char askAboutSex() {
        System.out.println("Are you a man (m) or a woman (k)?");
        Scanner scanner = new Scanner(System.in);
        char sex = scanner.next().charAt(0);
        while (sex != 'm' && sex != 'k') {
            System.out.println("error, try again");
            sex = scanner.next().charAt(0);
        }
        System.out.println("All right");
        return sex;
    }

    public static void introduceYourself(String name, String surname,int indexNumber, char sex) {
        System.out.println("Czesc, nazywam sie " + name + " " + surname+
                "nr indeksu: " + indexNumber + " plec: " +sex);
    }


}
