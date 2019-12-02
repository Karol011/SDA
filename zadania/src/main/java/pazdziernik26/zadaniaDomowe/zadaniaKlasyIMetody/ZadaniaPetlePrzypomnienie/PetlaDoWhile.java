package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.zadaniaKlasyIMetody.ZadaniaPetlePrzypomnienie;

import java.util.Scanner;

/*
Pętla do while–zadanie do wykonania
1.Napisz program, który wypisuje wszystkie liczby mniejsze od zadanej od użytkownika dopóki użytkownik wpisuje liczby większe od 0
2.*Napisz program, który oblicza wartość pierwiastka z wprowadzonej przez użytkownika liczby,
 dopóki ta przyjmuje wartości większe od 0 (dla uproszczenia przyjmij że użytkownik wprowadza liczby całkowite)
 */
public class PetlaDoWhile {
    public static void main(String[] args) {
//wypiszMniejszeOdZadanej();
wypiszPierwiastek();
    }

    static void wypiszMniejszeOdZadanej() {
        System.out.println("Podaj Liczbe");
        Scanner scanner = new Scanner(System.in);
        int pierwszaLiczba = scanner.nextInt();
        int nastepneLiczby;
        do {
            System.out.println("Podaj kolejna liczbe");
            nastepneLiczby = scanner.nextInt();
            System.out.println(nastepneLiczby);
        } while (pierwszaLiczba > nastepneLiczby && nastepneLiczby > 0);
    }
    static int podajLiczbe() {
        System.out.println("podaj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    static void wypiszPierwiastek() {
        int nastepneLiczby;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Podaj kolejna liczbe");
            nastepneLiczby = scanner.nextInt();
            System.out.println(Math.sqrt(nastepneLiczby));
        } while (nastepneLiczby > 0);

    }

}
