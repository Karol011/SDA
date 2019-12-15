package PetleTablice.Tablice_i_petle;

import java.util.Arrays;
import java.util.Random;

/*
2. Napisz program, który dla zadanej tablicy typu int zwraca:
a. Największą wartość
b. Najmniejszą wartość
c. Sumę wszystkich wartości
d. *Wartość średnią
e. *Medianę
 */
public class zadanie2 {
    public static void main(String[] args) {
        Integer[] array = new Integer[11];
        Random randomNumber = new Random();

       /* System.out.println("podaj ilosc liczb do wczytania");
        Scanner scan = new Scanner(System.in);
        int howManyNumbers = scan.nextInt();

        */

        System.out.println("wylosowane liczby: ");
        for (int i = 0; i < array.length; i++) {

            array[i] = randomNumber.nextInt(100);
            System.out.print(array[i] + ",");
        }
        int maxValue = array[0];
        int minValue = array[0];
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }//min max

        /*for (int i = 0; i < array.length; i++) {

            }
        }//mediana

         */
        System.out.println("\nnajwieksza wartosc: " + maxValue);
        System.out.println("najmniejsza wartosc: " + minValue);
        System.out.println("suma wartosci: " + sum);
        System.out.println("srednia wartosc: " + (float) sum / array.length);
        System.out.println("mediana: " + mediana(array));
    }

    public static float mediana(Integer[] array) {
        float mediana = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 == 0) {
                mediana = (float) (array[array.length / 2] + array[(array.length / 2) - 1]) / 2;
            } else {
                mediana = array[(array.length / 2)];
            }
        }
        return mediana;
    }
}
