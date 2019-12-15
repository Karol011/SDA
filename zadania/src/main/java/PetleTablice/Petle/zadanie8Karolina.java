package PetleTablice.Petle;


import java.util.Arrays;
import java.util.Scanner;

public class zadanie8Karolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int liczba = scanner.nextInt();
        String liczby = String.valueOf(liczba);
        String separator = ";";
        while (liczba != 0) {
            System.out.println("Podaj kolejną liczbę: ");
            liczba = scanner.nextInt();
            liczby = liczby + separator + liczba;
        }
        liczby = liczby.substring(0, liczby.length() - 2);
        String[] arraySplit = liczby.split(";");
        int[] arrayInt = new int[arraySplit.length];
        //przeksztalecnie stringów w liczby
        for (int i = 0; i < arraySplit.length; i++) {
            arrayInt[i] = Integer.parseInt(arraySplit[i]);
        }
        System.out.println(Arrays.toString(arrayInt));
        int min = arrayInt[0];
        int max = arrayInt[0];
        int suma = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            suma += arrayInt[i];
            if (arrayInt[i] > max) {
                max = arrayInt[i];
            }
            if (arrayInt[i] < min) {
                min = arrayInt[i];
            }
        }
        int sumaMinMax = min + max;
        double srednia = (double) suma / (double) arrayInt.length;
        System.out.println("Suma min i max : " + sumaMinMax);
        System.out.println("Srenia to: " + srednia);
    }
}

