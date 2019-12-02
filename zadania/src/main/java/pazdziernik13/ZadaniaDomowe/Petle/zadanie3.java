package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Petle;

import java.util.Scanner;

/*
3. Napisz program, który wypisuje “Hello World” dopóki użytkownik podaje liczby
          większe od 0
 */
public class zadanie3 {
    public static void main(String[] args) {
        int var = 1;
        while (var > 0) {
            System.out.println("podaj liczbe wieksza od 0");
            Scanner scannerVar = new Scanner(System.in);
            var = scannerVar.nextInt();
            if (var == 0){
                System.out.println("Wpisales 0, koniec gry :(");
            }
            else
            System.out.println(var + " to liczba wieksza od zera: Hello World :)");
        }
    }
}
