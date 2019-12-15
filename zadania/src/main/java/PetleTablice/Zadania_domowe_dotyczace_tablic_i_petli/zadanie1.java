package PetleTablice.Zadania_domowe_dotyczace_tablic_i_petli;

import java.util.Random;
import java.util.Scanner;

/*
Zadanie 1
	 * stworz nowa tablice ze 100 intami, uzupelnij ja losowymi liczbami i wypisz:
	 a) co drugi element
	 b) parzyste elementy
	 c) liczby podzielne jednoczsnie przez 2 i 3
	 d) liczby pierwsze
	 e) sume liczb nieparzystych
	 f) iloczyn wszystkich liczb podzielnych przez 5
 */
public class zadanie1 {
    public static void main(String[] args) {
        int[] randomArray = createRandomArray();
        chooseAction();

    }

    public static void chooseAction() {
        System.out.println("Choose action: \n" +
                "1.display 100 random numbers\n" +
                "2.display every second number\n" +
                "3.display even numbers\n" +
                "4.display numbers divided by 2 and 3 \n" +
                "5.display prime numbers\n" +
                "6.display sum of uneven numbers \n" +
                "7.display numbers dividiable by 5\n");
        Scanner scan = new Scanner(System.in);
        int action = scan.nextInt();

        switch (action) {
            case 1:
                displayRandomArray(createRandomArray());
                break;
            case 2:
                displayEverySecondIndex(createRandomArray());
                break;
            case 3:
                displayEvenNumbers(createRandomArray());
                break;
            case 4:
                displayNumbersDividedBy2And3(createRandomArray());
                break;
            case 5:
                displayPrimeNumbers(createRandomArray());
                break;
            case 6:
                displaySumOfUnevenNumbers(createRandomArray());
                break;
            case 7:
                displayProductOfDividableBy5(createRandomArray());
                break;
        }
    }

    public static int[] createRandomArray() {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        return array;
    }

    public static void displayEverySecondIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.println(array[i]);
            }
        }

    }

    public static void displayRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void displayEvenNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }

        }
    }

    public static void displayNumbersDividedBy2And3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] % 3 == 0) {
                System.out.println(array[i]);
            }

        }
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
    }

    public static void displaySumOfUnevenNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
            }
        }
        System.out.println("suma nieparzystych: " + sum);
    }

    public static void displayProductOfDividableBy5(int[] array) {
        long product = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 == 0) {
                product *= array[i];
            }
        }
        System.out.println("iloczyn podzielnych przez 5 to:\n" + product);
    }
}



