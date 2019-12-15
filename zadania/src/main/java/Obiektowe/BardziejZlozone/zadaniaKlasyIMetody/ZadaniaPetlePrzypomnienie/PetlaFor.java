package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.zadaniaKlasyIMetody.ZadaniaPetlePrzypomnienie;

import java.util.Scanner;

/*
Pętla for –zadanie do wykonania
1.Napisz program, który przyjmuje od użytkownika dzielnik oraz liczbę,
a następnie drukuje na ekranie wszystkie liczby mniejsze od zadanej liczby podzielne przez zadany dzielnik
2.* Napisz program wyznaczający potęgę liczby n i m –obie zadane przez użytkownika i drukujący w czytelny sposób wynik na ekranie konsoli
 */
public class PetlaFor {
    public static void main(String[] args) {
//drukujMniejszeIPodzielne(podajLiczbe(),podajDzielnik());
        wypiszPotege(podajLiczbe(), podajMnoznik());
    }

    static int podajLiczbe() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    static int podajDzielnik() {
        System.out.println("podaj dzielnik");
        Scanner scanner = new Scanner(System.in);
        int dzielnik = scanner.nextInt();
        return dzielnik;
    }

    static int podajMnoznik() {
        System.out.println("podaj mnoznik");
        Scanner scanner = new Scanner(System.in);
        int mnoznik = scanner.nextInt();
        return mnoznik;
    }

    static void drukujMniejszeIPodzielne(int liczba, int dzielnik) {
        for (int i = 1; i < liczba; i++) {
            if (i % dzielnik == 0) {
                System.out.print(i + ",");
            }
        }
    }

    static void wypiszPotege(int liczba, int mnoznik) {
        int wynikMnozenia = 1;
        for (int i = 0; i < mnoznik; i++) {
            wynikMnozenia = wynikMnozenia * liczba;
        }
        System.out.println(wynikMnozenia);
    }

}
