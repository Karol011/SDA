package Zgapa;

import java.util.Arrays;
import java.util.Scanner;

public class Liczby {
    public static void main(String[] args) {
        String string = "2861631";
        char[] array = string.toCharArray();
        Arrays.sort(array);
        System.out.println(array);
        // System.out.println(Arrays.toString(array));

        string.codePoints()
                .map(e -> (char) e)
                .sorted()
                .forEach(System.out::println);

    }

    public static void displayPrimeNumbers(int[] array) {
        System.out.println("Prime numbers: ");
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;                         //po kazdym przebiegu petli resetuj zmienna isPrime
            if (array[i] == 0 || array[i] == 1) {
                isPrime = false;                            //wykluczanie szczegolnego przypadku
            } else {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    } //sprawdzanie czy dany element jest podzielny przez cos od 2 do tego elementu,
                    // jesli jest to isPrime = false i przerywa zagniezdzona petle, wracajac do petli z "i"
                }
                if (isPrime) {
                    System.out.print(array[i] + ",");
                }       //po wykluczniu szczegolnego przypadku i zagniezdzonej petli sprawdz czy dana liczba ma status isPrime = true
                //jesli tak, to ja wypisz
            }
        }
    }       //pokaz liczby pierwsze



    public static void formatNumber() {
        double doublleVar1 = 3.37637466;
        System.out.printf("%4.2f", doublleVar1); //4- szerokosc 4 miejsc jest rezerwowana, 2 - 2 miejsca poprzecinku beda wyswietlane
    }                   //formatowanie liczb
    public static int loadNumber() {
        System.out.println("Type the number");
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();
        return givenNumber;
    }                       //wczytaj liczbe (Scanner)

    public static int[] loadNumbers() {
        Scanner scannerVar = new Scanner(System.in);
        int[] typedNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj liczbe nr:" + (i + 1));
            int givenNumber = scannerVar.nextInt();
            for (int j : typedNumbers) {
                if (j == givenNumber) {
                    System.out.println("powtarza sie, wpisz ponownie inna liczbe");
                    i--;
                }
            }
            typedNumbers[i] = givenNumber;
        }
        return typedNumbers;
    }                       //wczytaj liczby i sprawdz czy sie nie powtarzaja
    public static int generatePassword() {
        // define the range
        int max = 9999;
        int min = 1000;
        int range = max - min + 1;
        int randomPassword;
        // generate random numbers within 1 to 10
        randomPassword = (int) (Math.random() * range) + min;
        return randomPassword;
    }                   //stworzenie randomowej liczby uzywajac math.random


    public static int findMinValue(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++)
            minNumber = Math.min(minNumber, array[i]);
        return minNumber;
    }           //wyszukiwanie min liczby w tablicy






}
