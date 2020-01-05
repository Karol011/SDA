package Inne.Wyjatki.Future;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

public class Future {


    public static void main(String[] args) {
        start();
    }

    private static void start() {
        askAboutDate();
        //  askAboutTime();

    }

    private static void askAboutTime() {
        Scanner scanner = new Scanner(System.in);
        String timeGivenByUserString;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Type the time HH:mm"); //todo fix parsing time
        try {

            do {
                timeGivenByUserString = scanner.nextLine();
            } while (!timeGivenByUserString.matches("\\d{2}:\\d{2}"));
            LocalTime timeGivenByUser = LocalTime.parse(timeGivenByUserString, timeFormatter);
            System.out.println(timeGivenByUser.format(timeFormatter));

        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void askAboutDate() {
        Scanner scanner = new Scanner(System.in);
        String dateGivenByUserString = "";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dateGivenByUser = LocalDate.of(0000, 01, 1);


        System.out.println("Type the date in the future dd.MM.yyyy");
        try {

            while (!dateGivenByUserString.matches("\\d{2}.\\d{2}.\\d{4}") && dateGivenByUser.compareTo(LocalDate.now()) < 0) {
                dateGivenByUserString = scanner.nextLine();
                dateGivenByUser = LocalDate.parse(dateGivenByUserString, dateFormatter);
            }
            System.out.println(dateGivenByUser.format(dateFormatter));


        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
4.	Stwórz aplikację i w niej załaduj od użytkownika datę i czas w przyszłości.
Jeśli użytkowonik wpisze datę/czas w złym formacie lub w przeszłości każ mu powtórzyć czynność (użyj pętli).
 Po poprawnym wpisaniu daty oblicz ile czasu(w minutach) zostało do tamtej daty i wypisz na ekran.
 */
