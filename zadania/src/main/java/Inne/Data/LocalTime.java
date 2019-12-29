package Inne.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class LocalTime {
    public static void main(String[] args) {
        startMenu();

    }

    private static void startMenu() {
        System.out.println("choose the action: \n" +
                "date- current date\n" +
                "time-current time\n" +
                "datetime-current datetime\n" +
                "quit");
        Scanner scanner = new Scanner(System.in);

        String choiceToQuitOrContinue = scanner.nextLine();
        // String choiceInMenu=scanner.nextLine();

        while (!choiceToQuitOrContinue.equalsIgnoreCase("quit")) {
            switch (choiceToQuitOrContinue) {
                case "date":
                    date();
                    break;
                case "time":
                    time();
                    break;
                case "datetime":
                    dateTime();
                    break;

            }
            System.out.println("\nchoose the action: \n" +
                    "date- current date\n" +
                    "time-current time\n" +
                    "datetime-current datetime\n" +
                    "quit\n");
            choiceToQuitOrContinue = scanner.nextLine();
        }
    }

    private static void time() {
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(" HH:mm:ss");
        System.out.println("current time: " + time.format(formatter));
    }


    private static void date() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        System.out.println("current date: " + date.format(formatter));
    }

    private static void dateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY HH:mm:ss");
        System.out.println("date and time: " + localDateTime.format(formatter));
    }

}
