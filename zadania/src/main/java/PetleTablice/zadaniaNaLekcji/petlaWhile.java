package sda.pl.javagda34.pazdziernik13.zadaniaNaLekcji;

import java.util.Scanner;

public class petlaWhile {
    public static void main(String[] args) {
//while (imie.equals("Marcin"));
        Scanner zmiennaScanner = new Scanner(System.in);
        System.out.println("podaj liczbe ");
        int liczba = zmiennaScanner.nextInt();

        while (liczba != 666) {
            System.out.println("podaj liczbe ");
            liczba = zmiennaScanner.nextInt();

        }




    }
}
