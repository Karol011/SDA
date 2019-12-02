package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Tablice_i_petle;

import java.util.Scanner;

/*
15. Napisz program, który dla zadanych dwóch liczb zwraca największy wspólny dzielnik np.
a. 12 i 48 -> 12
b. 5 i 1 -> 1
c. 35 i 10 -> 5
 */
public class zadanie15 {
    public static void main(String[] args) {
         calculateBiggestDivider(loadNumber1(), loadNumber1());
    }

    private static int loadNumber1() {
        int number1 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the first number");
        number1 = scan.nextInt();
        return number1;
    }

    private static int loadNumber2() {
        int number2 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type the first number");
        number2 = scan.nextInt();
        return number2;
    }

    public static int whichIsBigger(int number1, int number2) {
        if (number2 > number1) {
            int number3 = number1;
            number1 = number2;
            number2 = number3;
        }
        System.out.println(number1);
        return number1;
    }

    public static void calculateBiggestDivider(int number1, int number2) {
        int biggestDividerOfNumber1 = 0;
        int biggestDividerOfNumber2 = 0;
        int biggerNumber = whichIsBigger(number1, number2);

        for (int i = 1; i <= biggerNumber; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                biggestDividerOfNumber1 = i;
            }
        }
        System.out.println("najwiekszy wspolny dzielnik to: " + biggestDividerOfNumber1);
    }
}

