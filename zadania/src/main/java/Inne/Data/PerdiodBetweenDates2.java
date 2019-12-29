package Inne.Data;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/*
•	Napisz aplikację, która wyświetli "różnicę" dwóch dat w formacie: "years: , months: , days: "
Wskazówka: skorzystaj z klasy Period:
Period period = Period.between(data_start, data_stop);

•	 Pobierz od użytkownika dwie daty. Jedna w formacie:
yyyy::MM::dd

oraz druga w formacie:
MM::yyyy::dd

Wypisz wynik różnicy dat w formacie:
Minęło: X lat, Y miesięcy, Z dni.

Do wypisania dni/lat/miesięcy z Period, wykorzystaj jego gettery.

 */
public class PerdiodBetweenDates2 {
    public static void main(String[] args) {
perdiodBetweenDays();
    }

    private static void perdiodBetweenDays() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy::MM::dd");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM::yyyy::dd");
        System.out.println("Type first date: ");
        String firstDate = scanner.nextLine();
        if (!firstDate.matches("\\d{4}::\\d{2}::\\d{2}")) {
            System.out.println("wrong format, try again: yyyy::MM::dd");
            firstDate = scanner.nextLine();
        }
        System.out.println("Type second date: ");
        String secondDate = scanner.nextLine();
        if (!secondDate.matches("\\d{2}::\\d{4}::\\d{2}")) {
            System.out.println("wrong format, try again: MM::yyyy::dd");
            secondDate = scanner.nextLine();
        }
        LocalDate localDate1 = LocalDate.parse(firstDate,formatter);
        LocalDate localDate2 = LocalDate.parse(secondDate,formatter2);
        System.out.println(localDate1.format(formatter));
        System.out.println(localDate2.format(formatter2));

        Period period = Period.between(localDate2,localDate1);
        System.out.println("years: "+period.getYears()+
                " ,months: "+period.getMonths()+
                " , days: "+period.getDays()+
                " have passed"
        );

    }
}
