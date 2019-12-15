package PetleTablice.Petle;

import java.util.Scanner;

/*
6. Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a
 następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana liczba.
 Przykładowo, dla liczby 71 program powinien wyświetlić:  1 2 4 8 16 32 64
 */
public class zadanie6 {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe calkowita,dodatnia");
        int liczba;
        Scanner zmiennaScanerowa = new Scanner(System.in);
        liczba = zmiennaScanerowa.nextInt();
        for (int i = 1; i <= liczba; i*=2) {
            System.out.println(i);

        }
    }
}
