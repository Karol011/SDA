package PetleTablice.Zadania_domowe_dotyczace_tablic_i_petli;

import java.util.Random;
import java.util.Scanner;

/*

Zadanie 3
	 stworz nowa tablice z 100 intami, uzupelnij ja losowymi liczbami, a nastepnie sprawdz zawartosc kazdego elementu tabeli i wypisz:
	 a) jezeli liczba jest liczba pierwsza -> "liczba pierwsza"
	 b) jezeli ma 3 dzielniki -> "3 dzielniki"
	 c) jezeli ma 4 lub wiecej -> "4 lub wiecej dzielnikow"
	 (skorzystac z switch/case)


 */
public class zadanie3 {
    public static void main(String[] args) {
        int[] array = createRandomArray();
        chooseAction(array);
        showPrimeNumbers(createRandomArray());

    }

    public static void chooseAction(int[] array) {

        Scanner scan = new Scanner(System.in);
        String actionChosenByUser;// = scan.nextLine();
        do {
            System.out.println("Choose action:\n" +
                    "a: display random nummbers\n" +
                    "b: display prime numbers\n" +
                    "c: display numbers that have 3 dividers\n" +
                    "d: display numbers that have 4 dividers\n" +
                    "e: generate another 100 random numbers\n" +
                    "q: quit\n");
            actionChosenByUser = scan.nextLine();

            switch (actionChosenByUser.charAt(0)) {
                case 'a': {
                    showNumbers(array);
                    System.out.println();
                }
                break;
                case 'b':
                    showPrimeNumbers(array);
                    System.out.println();
                    break;
                case 'c':
                    checkIfAnyHas3Dividers(array);
                    System.out.println();
                    break;
                case 'd':
                    checkIfAnyHas4Dividers(array);
                    System.out.println();
                    break;
                case 'e':
                    showNumbers(createRandomArray());
                    System.out.println();
                    break;
            }
        } while (actionChosenByUser.charAt(0) != 'q');


        System.out.println("You have quit the program.");

    }

    public static int[] createRandomArray() {
        int[] randomNumbers = new int[100];
        Random random = new Random();
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100) + 1;
        }
        return randomNumbers;
    }

    public static void showNumbers(int[] randomNumbers) {
        System.out.println("Generated numbers: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            if (i % 50 == 0) {
                System.out.println();
            }
            System.out.print(randomNumbers[i] + ",");
        }
    }

    public static void showPrimeNumbers(int[] randomNumbers) {
        boolean isPrime;
        System.out.println("prime numbers:\n");
        for (int i = 0; i < randomNumbers.length; i++) {
            isPrime = true;
            if (randomNumbers[i] == 0 || randomNumbers[i] == 1) {
                isPrime = false;
            } else {
                for (int j = 2; j < randomNumbers[i]; j++) {
                    if (randomNumbers[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(randomNumbers[i] + ",");
                }
            }

        }
    }
    public static void checkIfAnyHas3Dividers(int[] randomNumbers) {
        int numberOfDividers;
        for (int i = 0; i < randomNumbers.length; i++) {
            numberOfDividers = 0;
            for (int j = 2; j < randomNumbers[i]; j++) {
                if (randomNumbers[i] % j == 0) {
                    numberOfDividers++;
                }
            }
            if (numberOfDividers == 3) {
                System.out.println(randomNumbers[i] + " ma 3 dzielniki\n");
            }
        }
    }
    public static void checkIfAnyHas4Dividers(int[] randomNumbers) {
        int numberOfDividers;
        for (int i = 0; i < randomNumbers.length; i++) {
            numberOfDividers = 0;
            for (int j = 2; j < randomNumbers[i]; j++) {
                if (randomNumbers[i] % j == 0) {
                    numberOfDividers++;
                }
            }
            if (numberOfDividers == 4) {
                System.out.println(randomNumbers[i] + " ma 4 dzielniki\n");
            }
        }
    }
}
