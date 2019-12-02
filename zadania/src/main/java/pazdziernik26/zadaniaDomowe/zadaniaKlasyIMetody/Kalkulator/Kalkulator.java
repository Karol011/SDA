package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.zadaniaKlasyIMetody.Kalkulator;

import java.util.Scanner;

/*
1. Rozbudowa klasy Kalkulator z zajęć
a. Dodanie dodatkowej operacji modulo, w sytuacji gdy użytkownik wpisze ‘%’
b. Zmiana wyświetlania wyników, tak aby były drukowane na ekranie w następujący sposób: {liczba1} {działanie} {liczba2} = {wynik}, np. 5-3=2
 */
public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("Wybierz typ operacji:\n+ dodawanie\n- odejmowanie\n* mnozenie\n/ dzielenie\n% modulo");
        Scanner scan = new Scanner(System.in);
        char znakDzialania = scan.next().charAt(0);
        wybierzDzialanie(znakDzialania);
    }

    public static void wybierzDzialanie(int znakDzialania) {
        switch (znakDzialania) {
            case '+':
                int[] wczytaneLiczby = wczytajLiczby();
                System.out.println(wczytaneLiczby[0] + "+" + wczytaneLiczby[1] + "=" + dodaj(wczytaneLiczby[0], wczytaneLiczby[1]));                break;
            case '-':
                wczytaneLiczby = wczytajLiczby();
                System.out.println(wczytaneLiczby[0] + "-" + wczytaneLiczby[1] + "=" + odejmij(wczytaneLiczby[0], wczytaneLiczby[1]));
                break;
            case '*':
                wczytaneLiczby = wczytajLiczby();
                System.out.println(wczytaneLiczby[0] + "*" + wczytaneLiczby[1] + "=" + pomnoz(wczytaneLiczby[0], wczytaneLiczby[1]));                break;
            case '/':
                wczytaneLiczby = wczytajLiczby();
                System.out.println(wczytaneLiczby[0] + "/" + wczytaneLiczby[1] + "=" + podziel(wczytaneLiczby[0], wczytaneLiczby[1]));                break;
            case '%':
                wczytaneLiczby = wczytajLiczby();
                System.out.println(wczytaneLiczby[0] + "%" + wczytaneLiczby[1] + "=" + modulo(wczytaneLiczby[0], wczytaneLiczby[1]));
                break;

        }

    }

    public static int dodaj(int a, int b) {
        return a + b;
    }

    public static int odejmij(int a, int b) {
        return a - b;
    }

    public static int pomnoz(int a, int b) {
        return a * b;
    }

    public static int podziel(int a, int b) {
        while (b != 0) {
            return a / b;
        }
        return a / b;
    }

    public static int modulo(int a, int b) {
        return a % b;
    }


    public static int[] wczytajLiczby() {
        {
            System.out.println("podaj pierwsza liczbe");
            Scanner scan1 = new Scanner(System.in);
            int a = scan1.nextInt();
            System.out.println("podaj druga liczbe");
            int b = scan1.nextInt();

            int[] tablicaDanych = new int[2];
            tablicaDanych[0] = a;
            tablicaDanych[1] = b;

            return tablicaDanych;
        }
    }
}
