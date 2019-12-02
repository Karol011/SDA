package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Petle;

import java.util.Scanner;

/*
10.Napisać program rysujący w konsoli „choinkę” złożoną ze znaków gwiazdki (*).
  Użytkownik programu powinien podać liczbę całkowitą n, n > 0, określającą  wysokość choinki (liczbę wierszy).
   Przykład: dla n = 5 wynik powinien wyglądać            następująco:
                 *
                ***
               *****
              *******
             *********
 */
public class zadanie10 {
    public static void main(String[] args) {
        System.out.println("Podaj wysokosc choinki");
        Scanner zmiennaScaner = new Scanner(System.in);
        int wysokoscChoinki = zmiennaScaner.nextInt();

        for (int i = 0; i < wysokoscChoinki; i++) {//ilosc wierszy
            System.out.println();
            for (int j = wysokoscChoinki - 1; j > i; j--) {//ilosc spacji
                System.out.print(" ");
            }
            for (int k = -1; k < 2*i; k++) {//ilosc gwiazdek
                System.out.print("*");
            }
        }

    }
}
