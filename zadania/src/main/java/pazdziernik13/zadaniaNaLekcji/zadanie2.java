package sda.pl.javagda34.pazdziernik13.zadaniaNaLekcji;

import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {

        String tekst1;
        System.out.println("podaj imie");
        Scanner tekstTypuScanner1 = new Scanner(System.in);
        tekst1 = tekstTypuScanner1.nextLine();
        System.out.println("imie: ");
        System.out.println(tekst1);

        int liczba1;
        System.out.println("Podaj pierwsza liczbe");
        Scanner zmiennaTypuScanner2 = new Scanner(System.in);
        liczba1 = zmiennaTypuScanner2.nextInt();
        System.out.println(liczba1);


        String tekst2;
        System.out.println("podaj imie");
        Scanner tekstTypuScanner3 = new Scanner(System.in);
        tekst2 = tekstTypuScanner3.nextLine();
        System.out.println("imie: ");
        System.out.println(tekst2);

        int liczba2;
        System.out.println("Podaj druga liczbe");
        Scanner zmiennaTypuScanner4 = new Scanner(System.in);
        liczba2 = zmiennaTypuScanner4.nextInt();
        System.out.println(liczba2);

    }
}
