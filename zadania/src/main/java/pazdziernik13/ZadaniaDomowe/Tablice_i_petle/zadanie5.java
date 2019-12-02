package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Tablice_i_petle;

import java.util.Scanner;

/*
5. Napisz program, który oblicza sumę liczb cyfry tj. dla liczby 52 suma jej pojedynczych cyfr wynosi ‘5’ + ‘2’ -> ‘7’.
 Podpowiedź: Użyj metody split na obiekcie typu String
 */
public class zadanie5 {
    public static void main(String[] args) {
        System.out.println("Sum = " + sumNumbers(loadNumber()));
    }

    private static int loadNumber() {
        System.out.println("Type the number");
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();
        return givenNumber;
    }

    private static int sumNumbers(int number) {
        String stringNumber = Integer.toString(number);

        int result = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            result += Integer.parseInt(Character.toString(stringNumber.charAt(i)));
        }
        return result;
    }


}
