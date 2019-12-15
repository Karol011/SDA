package PetleTablice.Petle;
/*
4. Napisać program w którym użytkownik podaje na początku dwie liczby: początekZakresu ​oraz ​koniecZakresu​.
Upewnij się że ​początekZakresu < koniecZakresu ​a następnie:
a. pobierz od użytkownika kolejną liczbę - ​dzielnik.
 Po pobraniu dzielnika  wypisz wszystkie liczby od ​początekZakresu ​do ​koniecZakresu które są podzielne przez ​dzielnik​

b. *pobierz od użytkownika ​iloscDzielnikow​, a następnie wczytaj wszystkie dzielniki.
 Po wczytaniu wszystkich dzielnikow wypisz wszystkie liczby od poczatekZakresu ​do ​koniecZakresu które są podzielne przez
  ​wszystkie dzielniki.
 */

import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        System.out.println("Podaj poczatek zakresu: ");//pobranie dolnego zakresu
        int poczatekZakresu;
        Scanner zmiennaScanner1 = new Scanner(System.in);
        poczatekZakresu = zmiennaScanner1.nextInt();

        System.out.println("podaj koniec zakresu");//pobranie konca zakresu
        int koniecZakresu;
        Scanner zmiennaScanner2 = new Scanner(System.in);
        koniecZakresu = zmiennaScanner2.nextInt();
        int j = 0;
        if (poczatekZakresu < koniecZakresu) {//sprawdzenie czy poczatek zakresu jest mniejszy niz jego koniec
            int iloscDzielnikow;
            System.out.println("Podaj ilosc dzielnikow");
            Scanner zmiennaScanner4 = new Scanner(System.in);
            iloscDzielnikow = zmiennaScanner4.nextInt();
            int[] array = new int[iloscDzielnikow];
            for (j = 0; j < iloscDzielnikow; j++) {


                System.out.println("podaj dzielnik: ");//wczytanie dzielnika
                int dzielnik;
                Scanner zmiennaScanner3 = new Scanner(System.in);
                dzielnik = zmiennaScanner3.nextInt();
                array[j] = dzielnik;
            }


            for (int i = poczatekZakresu; i <= koniecZakresu; i++) {//sprawdzanie czy dana liczba z zakresu jest podzielna przez nasz dzielnik
                if (i % array[j - 1] == 0) {
                    System.out.println("Liczby z zakresu " + poczatekZakresu + " - " + koniecZakresu + " podzielne przez "
                            + array[0] + "i" + array[1] + "i" + array[2] + " to " + i);

                }
            }
        } else {//jezeli koniec zakresu jest mniejszy niz jego poczatek
            System.out.println("zakres zaczyna sie od mniejszej liczby a konczy na wiekszej!");
        }

    }
}
