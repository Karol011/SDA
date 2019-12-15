package sda.pl.javagda34.pazdziernik13.zadaniaNaLekcji;

import java.util.Scanner;

public class zadanieOdPrzemka {
    public static void main(String[] args) {

        Scanner poczatekZakresu = new Scanner(System.in);
        System.out.println("Podaj poczatek zakresu");
        int poczatek = poczatekZakresu.nextInt();
        Scanner koniecZakresu = new Scanner(System.in);
        System.out.println("Podaj koniec zakresu");
        int koniec = koniecZakresu.nextInt();
        if (poczatek < koniec) {
            Scanner podajIlosc = new Scanner(System.in);
            System.out.println("Podaj ilosc dzielnikow");
            int ilosc = podajIlosc.nextInt();

            for (int j = 0; j < ilosc; j++) {
                Scanner podajDzielnik = new Scanner(System.in);
                System.out.println("Podaj dzielnik");
                int dzielnik = podajDzielnik.nextInt();
                for (int i = poczatek; i <= koniec; i++)
                    if (i % dzielnik == 0) {
                        System.out.println(i);

                    }
            }
        } else {
            System.out.println("Poczatek zakresu jest wiekszy niz koniec.");
        }
    }
}

