package sda.pl.javagda34.pazdziernik13.zadaniaNaLekcji;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        int liczba1;
        System.out.println("Podaj pierwsza liczbe");
        Scanner zmiennaTypuScanner1 = new Scanner(System.in);
        liczba1 = zmiennaTypuScanner1.nextInt();
        System.out.println(liczba1);


        int liczba2;
        System.out.println("Podaj druga liczbe");
        Scanner zmiennaTypuScanner2 = new Scanner(System.in);
        liczba2 = zmiennaTypuScanner2.nextInt();
        System.out.println(liczba2);
        if (liczba2 != 0) {
            System.out.println("Wynik dzielenia tych dwoch liczb to :");
            System.out.println(liczba1 / liczba2);
        } else {
            System.out.println("nie dziel przez 0");
        }




    }
}
