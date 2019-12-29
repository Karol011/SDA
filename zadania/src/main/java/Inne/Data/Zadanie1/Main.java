package Inne.Data.Zadanie1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;

/*
Zadanie 3
Utwórz własny typ daty np. MojaData, który przyjmuje 3 argumenty typu int dla określenia dni, miesięcy i lat.
 Dodaj metodę wyświetl datę, który wyświetli datę w następujący sposób:
a. 1.11.2011 (pierwszy listopada 2011)
b. 01.11.2011
c. * 1 lis 2011
 */
public class Main {
    public static void main(String[] args) {
       // printDate1();
        printDate2();
        //printDate3();//todo


    }

    private static void printDate2() {
        Scanner scanner = new Scanner(System.in);
        String date;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            System.out.println("Type date dd.MM.yyyy");
            do {
                date = scanner.nextLine();
            } while (!date.matches("\\d{2}.\\d{2}.\\d{4}"));
            LocalDate localDate = LocalDate.parse(date, formatter);
            System.out.println(localDate.format(formatter));

        } catch (DateTimeParseException e) {
            System.out.println(e.getMessage());
            System.out.println("Type date dd.MM.yyyy");
            do {
                date = scanner.nextLine();
            } while (!date.matches("\\d{2}.\\d{2}.\\d{4}"));
            LocalDate localDate = LocalDate.parse(date, formatter);
            System.out.println(localDate.format(formatter));
        }

    }


    private static void printDate1() {

        Scanner scanner = new Scanner(System.in);
        String[] str = {"day", "month", "year"};
        String date = "";

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter " + str[i] + ": ");
            date = date + scanner.next() + ".";
        }
        date = date.substring(0, date.length() - 1);

        System.out.println("date: " + date);
    }
}
