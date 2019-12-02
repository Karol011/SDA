package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Tablice;

import java.util.Random;

/*
2. Napisać program, który utworzy tablicę 20 liczb całkowitych z przedziału 1 . . . 10
a następnie wypisze na ekranie ile razy każda z liczb z tego przedziału powtarza się w tablicy.

 */
public class zadanie2 {
    public static void main(String[] args) {

        int[] table = new int[20];
        Random randomNumbers = new Random();
        System.out.print("Wylosowane liczby: \n");
        for (int i = 0; i < table.length; i++) {
            table[i] = randomNumbers.nextInt(10) + 1;
            System.out.print(table[i] + " ");
        }
        System.out.println();
        int ilosc = 0;
        int liczba = 1;
        for (int i = 0; i < 10; i++) {
            ilosc = 0;
            for (int j = 0; j < table.length; j++) {
                if (liczba == table[j]) {
                    ilosc++;
                }
            }
            System.out.println(liczba + "-" + ilosc);
            liczba++;
        }
    }
}
