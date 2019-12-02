package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Tablice;

import java.util.Arrays;

/*
1. Napisz aplikację w której zadeklaruj tablicę 10 elementów a następnie:
 a. wypełnij je losowymi wartościami z przedziału -10 - 10
 b. wypisz na ekranie zawartość tablicy
 c. wyznacz najmniejszy oraz największy element tablicy (wypisz je)
  d. wypisz średnią arytmetyczną tablicy (*spróbuj zrobić to samo z tablicą liczb zmiennoprzecinkowych)
   e. wypisz ilość elementów większych/mniejszych od średniej
   f. wypisz tablicę w odwrotnej kolejności
   g. **wyznacz medianę  - > posortuj tablicę używając Arrays.sort() a następnie określ medianę

 */
public class zadanie1 {
    public static void main(String[] args) {
        Double[] array;
        array = new Double[]{-3.1, 9.0, 2.2, -10.3, -3.2, -4.1, -1.5, -5.2, -10.3, 8.3};
        double maxValue = array[2], minValue = array[2];
        System.out.println("Wylosowane liczby: ");
        for (int i = 0; i < array.length; i++) {//wypisywanie liczb w tablicy
            System.out.print(array[i] + ",");
            if (array[i] > maxValue) {
                maxValue = array[i];
            }//wyznaczanie max
            if (array[i] < minValue) {//wyznaczanie najmniejszej
                minValue = array[i];
            }//wyznaczanie min
        }
        double averageValue = 0;
        for (int i = 0; i < array.length; i++) {
            averageValue = averageValue + array[i];
        }//wyliczanie sredniej wartosci

        System.out.println();
        System.out.println("Najwiekszy element w tablicy to: ");
        System.out.println(maxValue);
        System.out.println("Najmniejszy element w tablicy to: ");
        System.out.println(minValue);
        System.out.println("Srednia wartosc tablicy to: " + averageValue / array.length);
        System.out.println("Liczby wieksze od sredniej to: ");
        int biggerThanAverage = 0;
        int smallerThanAverage = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > averageValue / array.length) {
                biggerThanAverage++;
            }

        }//sprawdzanie ktore sa wieksze niz srednia
        System.out.print(biggerThanAverage);//wypisanie ile jest wiekszych od sredniej
        System.out.println("\nLiczby mniejsze od sredniej to: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < averageValue / array.length) {
                smallerThanAverage++;
            }
        }//sprawdzenie ktore sa mniejsze niz srednia
        System.out.print(smallerThanAverage);//wypisanie ile jest mniejszych od sredniej
        System.out.println("\nTablica w odwrotnej kolejnosci: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ",");
        }
        sortowanie(array);
        wyznaczMediane(array);
    }

    public static Double[] sortowanie(Double[] array) {
        // Our arr contains 8 elements
        System.out.println();
        Arrays.sort(array);

        System.out.printf("Posorotowane: " +
                Arrays.toString(array));
        return array;
    }

    public static void wyznaczMediane(Double[] array) {
        double mediana;
        if (array.length % 2 == 0) {
            mediana = (array[array.length / 2] + array[(array.length / 2) + 1]) / 2;
        } else {
            mediana = array[(array.length/2)+1];
        }            System.out.println("\nMediana: " + mediana);

    }
}

