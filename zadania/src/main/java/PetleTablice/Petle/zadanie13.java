package PetleTablice.Petle;
/*
13. Stwórz program który na wejściu przyjmuje liczbę N a następnie na wyjściu wypisuje
tabliczkę mnożenia do tej liczny (tj. do NxN).
 */

import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) {
        int[][] array = new int[11][7];

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int wczytanieLiczby() {
        System.out.println("Podaj liczbe");
        Scanner scan = new Scanner(System.in);
        int wczytanaLiczba = scan.nextInt();
        return wczytanaLiczba;
    }
}
