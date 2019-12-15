package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.StatystykiTablicy;

import java.util.Scanner;

/*
4. Utworzenie klasy, opisującej statystyki dla tablicy typu liczbowego
    a. Utworzenie 2 metod:
          i. Psvm
            1. Zadeklarowana na sztywno tablica z wartościami początkowymi np. int[] tablica = new int[]{2,5,1,-3,5,22,21,66,21,54}
            2. Przesłanie tablicy do metody drukujOpisTablicy
        ii. drukujOpisTablicy
            1. Metoda drukuje następujące parametry:
                a. Minimalna wartość w tablicy
                b. Maksymalna wartość w tablicy
                c. Średnia wartość tablicy
                d. Ilość Elementów
            2. Dla w/w przykładu oczekujemy poniższego tekstu:
                Min wartość: -3 Max wartość: 66 Średnia wartość: 19.4 Ilość elementów: 10
    b. Rozszerzenie o podawanie tablicy z palca przez użytkownika (pętla for) – np. iloelementową tablicę chcesz utworzyć?
        Pobrać wartość i zadeklarować tablicę, która następnie można uzupełnić w pętli for
    c. Po wypisaniu podsumowania tablicy zapytać użytkownika czy chce kontynuować (tak/nie) –
        jeśli tak ponownie wczytać i wyświetlić parametry tablicy
    d. Jeśli użytkownik poda wartość spoza zakresu zadać pytanie ponownie i wyświetlić tekst:
        „Podano nieprawidłową odpowiedź, proszę wpisać ‘tak’ lub ‘nie’.
 */
public class StatystykiTablicy {
    public static void main(String[] args) {
      //  int[] array = new int[]{2, 5, 1, -3, 5, 22, 21, 66, 21, 54};
        printTableInfo(defineArray());
    }

    static int[] defineArray() {
        System.out.println("How many numbers do you want in your array?");
        Scanner scanner = new Scanner(System.in);
        int numberOfIndexes = scanner.nextInt();
        int[] array = new int[numberOfIndexes];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Type the " + i + " number in array");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static void printTableInfo(int[] array) {
        System.out.println("Min value: " + findMinValue(array) +
                " \tmax value: " + findMaxValue(array) +
                " \tavg value: " + findAvgValue(array) +
                " \tnumber of elements: " + showHowManyElements(array));
        char choice = 's';
        do {
            System.out.println("Do you wish to continue? y/n");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.next().charAt(0);
            if (choice == 'y') {
                printTableInfo(defineArray());
            } else if (choice == 'n') {
                System.out.println("Thanks for your time :)");
            } else {
                System.out.println("Not a valid option, type y or n");
            }
        } while (choice != 'n');

    }

    public static int findMinValue(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++)
            minNumber = Math.min(minNumber, array[i]);
        return minNumber;
    }

    public static int findMaxValue(int[] array) {
        int maxNumber = array[0];
        for (int i = 1; i < array.length; i++)
            maxNumber = Math.max(maxNumber, array[i]);
        return maxNumber;
    }

    public static double findAvgValue(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return (sum / array.length);
    }

    static int showHowManyElements(int[] array) {
        return array.length;
    }
}
