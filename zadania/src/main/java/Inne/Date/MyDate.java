package Inne.Date;

import java.text.SimpleDateFormat;

/*
Zadanie 3
Utwórz własny typ daty np. MojaData, który przyjmuje 3 argumenty typu int dla określenia dni, miesięcy i lat. Dodaj metodę wyświetl datę,
 który wyświetli datę w następujący sposób:
a. 1.11.2011 (pierwszy listopada 2011)
b. 01.11.2011
c. * 1 lis 2011
 */
public class MyDate {
    int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
SimpleDateFormat dataFormat = new SimpleDateFormat("d.MM.yyyy");

    public void showDate(int day, int month, int year, MyDate date) {
        System.out.println("current data: "+dataFormat.format(date));
    }
}
