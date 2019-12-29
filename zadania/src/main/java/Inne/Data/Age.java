package Inne.Data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
•	Napisz aplikację, która obliczy twój wiek. Podaj wiek w formacie:
•	Masz X lat, Y miesięcy, Z dni. (użyj Period)
•	Masz XYZ sekund. (użyj Duration)

 */
public class Age {
    public static void main(String[] args) {
        printAge();
    }

    private static void printAge() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("type the date (day-month-year)");//input
        String date = scanner.nextLine();
        if (!date.matches("\\d{2}-\\d{2}-\\d{4}")) {//checking if dateformat is OK
            System.out.println("wrong format,try again (dd-MM-yyyy)");
            date = scanner.nextLine();
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");//creating pattern
        LocalDate dateOfBirth = LocalDate.parse(date,formatter);//parsing date in string to LocalDate, so i can use it with period and duration
        LocalDate actualDate = LocalDate.now();

        Period period = Period.between(dateOfBirth,actualDate);
        Duration duration = Duration.between(dateOfBirth.atStartOfDay(),actualDate.atStartOfDay());

        System.out.printf("you have %d years, %d months, %d days\n",period.getYears(),period.getMonths(),period.getDays());
        System.out.printf("you have %,d seconds", duration.getSeconds());

    }
}
