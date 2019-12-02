package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Petle;

import java.util.Scanner;

/*
12. Napisać program, który sprawdza, czy podana liczba całkowita N jest większa od
zera, a następnie sprawdzająca czy liczba jest liczbą pierwszą.
 */
public class zadanie12 {
    public static void main(String[] args) {
        int wczytanaLiczba = wczytanieLiczby();
        if (sprawdzCzyWiekszaOd0(wczytanaLiczba)) {
            wypisanieCzyPrimeCzyNie(checkIfPrime(wczytanaLiczba));
        } else {
            System.out.println("Liczba jest mniejsza od zera");
        }
    }
    public static boolean sprawdzCzyWiekszaOd0(int wczytanaLiczba) {
        if (wczytanaLiczba > 0) {
            return true;
        }
        return false;
    }

    public static int wczytanieLiczby() {
        System.out.println("Podaj liczbe");
        Scanner scan = new Scanner(System.in);
        int wczytanaLiczba = scan.nextInt();
        return wczytanaLiczba;
    }

    public static boolean checkIfPrime(int wczytanaLiczba) {
        boolean isPrime = false;
        for (int i = 2; i < wczytanaLiczba; i++) {
            if (wczytanaLiczba % i == 0) {
                isPrime = false;
                break;
            } else {
                isPrime = true;
            }
        }
        return isPrime;
    }

    public static void wypisanieCzyPrimeCzyNie(boolean isPrime) {
        if (isPrime) {
            System.out.println("liczba pierwsza");
        } else {
            System.out.println("niestety :(");
        }
    }
}

