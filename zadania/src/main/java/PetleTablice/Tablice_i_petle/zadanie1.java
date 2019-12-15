package PetleTablice.Tablice_i_petle;

import java.util.Random;
import java.util.Scanner;

/*
1. Napisz program symulujący grę w Lotto:
a. Użytkownik typuje 6 cyfr
b. Program losuje 6 cyfr z liczb od 1 do 49
c. Program wypisuje na ekranie wytypowane przez użytkownika cyfry
d. Program wypisuje na ekranie wylosowane cyfry
e. Program wyświetla wynik użytkownika w poniższej formie:
i. Trafiono n z 6 cyfr
f. *Upewnij się że użytkownik podaje 6 różnych liczb
g. *Upewnij się, że maszyna losująca generuje 6 różnych liczb
h. ! Skorzystaj z klasy java.util.Random
 */
public class zadanie1 {
    public static void main(String[] args) {
        int[] numbersTypedByuser = loadNumbers();
        showChosenNumbers(numbersTypedByuser);
        showHowManyHits(numbersTypedByuser, randomizeLottoNumbers());


    }

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
    }

    public static void showChosenNumbers(int[] typedNumbers) {
        System.out.println("wybrane liczby:");
        for (int i = 0; i < typedNumbers.length; i++) {
            System.out.print(typedNumbers[i] + ",");
        }
    }

    public static int[] randomizeLottoNumbers() {
        Random randomVar = new Random();                            //losowanie numerow lotto
        int[] lottoNumbers = new int[6];
        System.out.println("\nNumery duzego lotka to: ");

        for (int i = 0; i < 6; i++) {
            lottoNumbers[i] = randomVar.nextInt(49+1);
            System.out.print(lottoNumbers[i] + ",");
        }
        return lottoNumbers;
    }

    public static void showHowManyHits(int[] typedNumbers, int[] lottoNumbers) {
        int howManyGuessed = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < lottoNumbers.length; j++) {
                if (typedNumbers[i] == lottoNumbers[j]) {
                    howManyGuessed++;
                    System.out.println("\ntrafiony numer to: " + typedNumbers[i]);
                }
            }
        }                           //porownanie wytypowanych liczb z wylosowanymi w lotto
        System.out.println("\ntrafiono " + howManyGuessed + " z 6");
    }

}

