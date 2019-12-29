package Inne.Data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*

•	Napisz aplikację, która wyświetli datę (wpisaną ze scannera) sprzed 10 dni i datę za dziesięć dni.
 Wskazówka: skorzystaj z metody plusDays() na obiekcie LocalDate.

 */

public class LocalDatePlusMinus10Days {
    public static void main(String[] args) {
        plusMinus10Days();
    }

    private static void plusMinus10Days() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("type the date (year-month-day)");
        String date = scanner.nextLine();
        if (!date.matches("\\d{4}-\\d{2}-\\d{2}")) {
            System.out.println("wrong format,try again (yyyy-MM-dd)");
            date = scanner.nextLine();
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY");
        LocalDate localDate = LocalDate.parse(date);


        System.out.println("plus 10 days " + localDate.plusDays(10).format(formatter));
        System.out.println("minus 10 days " + localDate.plusDays(-10).format(formatter));



    }
}
