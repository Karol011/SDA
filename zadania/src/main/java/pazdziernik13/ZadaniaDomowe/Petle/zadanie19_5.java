package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Petle;

import java.util.Scanner;

/*
3. Wczytaj dwie liczby (`a` i `b`) i wypisz wynik działania `a` do potęgi `b` - używaj tylko
mnożenia, a nie wbudowanej w javę funkcji potęga. Przyjmijmy dla ułatwienia, że `b` jest
większe lub równe 0 (nie obsługujemy ujemnych potęg) (edited)
 */
public class zadanie19_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe: ");
        int liczbaA = scan.nextInt();
        System.out.println("podaj druga liczbe (dodatnia!)");
        int liczbaB = scan.nextInt();
        int wynikPotegowania = 1;
        if (liczbaB >= 0) {
            for (int i = liczbaB; i > 0; i--) {
                wynikPotegowania *= liczbaA;
            }
        } else {
            System.out.println("podales liczbe ujemna");
        }
        System.out.println("wynik = " + wynikPotegowania);
    }
}
