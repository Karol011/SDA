package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe;

import java.util.Scanner;

/*
2. *Napisz program, który oblicza silnię
dla zadanej liczby przez użytkownika (do n=12) korzystając z pętli while https://pl.wikipedia.org/wiki/Silnia
 */
public class PetlaWhileSilnia {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner scan = new Scanner(System.in);
        int silnia = scan.nextInt();
int i=1;
        while (i < silnia){

            System.out.println(i);
        }

    }
}
