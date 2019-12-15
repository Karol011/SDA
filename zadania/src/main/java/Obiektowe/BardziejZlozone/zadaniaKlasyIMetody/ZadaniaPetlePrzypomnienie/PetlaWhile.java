package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.zadaniaKlasyIMetody.ZadaniaPetlePrzypomnienie;

import java.util.Scanner;

/*
Pętla while–zadanie do wykonania
1.Napisz program, który oblicza sumę wszystkich liczb poprzedzających zadaną przez użytkownika liczbę
–dla liczby 100 będzie to suma liczb od 0 do 100 czyli 5050
2.*Napisz program, który oblicza silnię dla zadanej liczby przez użytkownika (do n=12) korzystając z pętli while
https://pl.wikipedia.org/wiki/Silnia
 */
public class PetlaWhile {
    public static void main(String[] args) {
//obliczSume(podajLiczbe());
        obliczSilnie(podajLiczbe());
    }

    static int podajLiczbe() {
        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    static void obliczSume(int liczba) {
        int suma = 0;
        int i = 0;
        while (i < 101) {
            suma += i;
            i++;
        }
        System.out.println(suma);
    }

    static void obliczSilnie(int liczba) {
        int silnia = 1;
        int i = 1;
        if (liczba < 13) {
            while (i <= liczba) {
                silnia *= i;
                i++;
            }
        } else {
            System.out.println("Za duza liczba!");
        }
        System.out.println(silnia);
    }

}
