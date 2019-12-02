package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Tablice_i_petle;

import java.util.Scanner;

/*
17. Napisz program, który weryfikuje czy podany PESEL jest prawdziwy – skorzystaj z definicji na stronie http://pl.spoj.com/problems/JPESEL/
 */
public class zadanie17 {
    public static void main(String[] args) {
       displayIfPeselIsLegit(returnSumOfPeselDigits(loadPesel()));
    }

    private static String loadPesel() {
        String pesel;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your PESEL number");
        pesel = scan.nextLine();
        return pesel;
    }

    public static int returnSumOfPeselDigits(String pesel) {
        String[] digits = pesel.split("", 0);//podzielenie peselu na cyfry i zapisanie ich do tablicy
        int[] array = new int[11];//pomocnicza tablica, do wymnozenia wartosci

        for (int i = 0; i < 11; i++) {
            array[i] = Integer.parseInt(digits[i]);//kolejnym el. z array przypisz el. z tablicy digits zamienione na inty
        }
        int sumOfPesel = (array[0] * 1) + (array[1] * 3) + array[2] * 7 + array[3] * 9 +
                array[4] * 1 + array[5] * 3 + array[6] * 7 + array[7] * 9 +
                array[8] * 1 + array[9] * 3 + array[10] * 1;
        System.out.println("suma cyfr w peselu wg. wzoru wynosi: " + sumOfPesel);

        return sumOfPesel;
    }

    public static void displayIfPeselIsLegit(int sumOfPesel) {
        if (Integer.toString(sumOfPesel).endsWith("0")) {//zamieniam inta 'sumOfPesel' na stringa i
            // sprawdzam za pomoca .endsWith czy ma na koncu 0
            System.out.println("poprawny pesel");
        } else {
            System.out.println("niepoprawny pesel");
        }
    }
}




