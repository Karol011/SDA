package Inne.Data;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*

•	Napisz aplikację, która wyświetli "różnicę" dwóch dat w formacie: "years: , months: , days: "
Wskazówka: skorzystaj z klasy Period:
Period period = Period.between(data_start, data_stop);

 */
public class PerdiodBetweenDates {
    public static void main(String[] args) {
displayPeriodBetweenDates();
    }

    private static void displayPeriodBetweenDates() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy , MM , dd");

        System.out.println("Type first date: ");
        String firstDate = scanner.nextLine();
        if (!firstDate.matches("\\d{4} , \\d{2} , \\d{2}")) {
            System.out.println("wrong format, try again: yyyy , MM , dd");
            firstDate = scanner.nextLine();
        }
        System.out.println("Type second date: ");
        String secondDate = scanner.nextLine();
        if (!secondDate.matches("\\d{4} , \\d{2} , \\d{2}")) {
            System.out.println("wrong format, try again: yyyy , MM , dd");
            secondDate = scanner.nextLine();
        }
        LocalDate localDate1 = LocalDate.parse(firstDate,dateTimeFormatter);
        LocalDate localDate2 = LocalDate.parse(secondDate,dateTimeFormatter);
        Period period = Period.between(localDate2,localDate1);
        System.out.println("years: "+period.getYears()+
                " ,months: "+period.getMonths()+
                " , days: "+period.getDays()
                );



    }
}

