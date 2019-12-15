package PetleTablice.Tablice;

import java.util.Scanner;

import static java.lang.Math.abs;

/*
3. Napisać program, który wczytuje od użytkownika liczbę całkowitą, a następnie
wyświetla jej reprezentację w kodzie binarnym (ZM). Podczas konwersji liczby należy
kolejne jej bity zapisywać w pomocniczej tablicy liczb całk. o rozmiarze 32. Konwersji
należy dokonać korzystając z operacji dzielenia całkowitego oraz operacji modulo.
Przykład:
Wejście:
-75 (liczba podana przez użytkownika)
Wynik:
Liczba -75 binarnie: 1.1001011
 */
public class zadanie3 {
    public static void main(String[] args) {
        konwertujNaBinarne(wczytajLiczbe());
    }

    public static int wczytajLiczbe() {
        System.out.println("Podaj liczbe calkowita");
        Scanner scan = new Scanner(System.in);
        int wczytanaLiczba = scan.nextInt();
        return wczytanaLiczba;
    }

    public static void konwertujNaBinarne(int wczytanaLiczba) {
        int[] tablicaBinarna = new int[32];
        boolean jestUjemna = false;
        //jezeli ujemna to zwroc wartosc bezwzgledna
        if (wczytanaLiczba < 0) {
            jestUjemna = true;
            wczytanaLiczba = abs(wczytanaLiczba);
        }
        int licznik = 0;

        while (wczytanaLiczba > 0) {//dopoki dodatnia...
            int resztaZModulo = wczytanaLiczba % 2; //przypisuj kolejnym elementom tablicy reszte z dzielenia
            tablicaBinarna[licznik++] = resztaZModulo;
            wczytanaLiczba /= 2;
        }
        if (jestUjemna) { //jezeli jest ujemna dodaj 1. z przodu wypisanej tablicy
            System.out.print("1.");
        }
        for (int i = licznik - 1; i >= 0; i--) { //wypisz tablice od tylu
            System.out.print(tablicaBinarna[i]);
        }
    }
}

