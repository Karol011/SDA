package sda.pl.javagda34.pazdziernik13.zadaniaNaLekcji;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int liczba;

        System.out.println("Wprowadz liczbe: ");

        Scanner zmiennaTypuScanner = new Scanner(System.in);
        liczba = zmiennaTypuScanner.nextInt();


        if (liczba < 10) {
            switch (liczba) {
                case 3:
                    System.out.println("wpisales 3");
                    break;
                case 5:
                    System.out.println("wpisales 5");
                    break;
                case 8:
                    System.out.println("wpisales 8");
                    break;
                default:
                    System.out.println("liczba jest mniejsza niz 10 ");
            }

            ;
        } else if (liczba > 11 && liczba < 20) {
            System.out.println("wpisales liczbe od 10 do 20");
        } else if (liczba > 20 && liczba < 30) {
            System.out.println("wpisales liczbe od 20 do 30");
        }

    }
}
