package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe;

import java.util.Scanner;

/*Pętla while – zadanie do wykonania 1. Napisz program, który oblicza sumę wszystkich
        liczb poprzedzających zadaną przez użytkownika liczbę
        – dla liczby 100 będzie to suma liczb od 0 do 100 czyli 505*/
public class PetlaWhileSumowanieLiczb {
    public static void main(String[] args) {
        int liczba, suma = 0;
        System.out.println("Podaj liczbe ");
        Scanner zmiennaScanner = new Scanner(System.in);
        liczba = zmiennaScanner.nextInt();
        int i = 0;
        while (i < liczba)
        {
            for (int j = 0; j < liczba+1; j++) {
                i++;
                suma = suma + j;
            }
            System.out.println("suma to " + suma);
        }
    }
}
