package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Tablice_i_petle;

import java.util.Scanner;

/*
6. Napisz program, który odwraca wprowadzony tekst (AntyEcho ) – podpowiedź analogiczna do punktu 5
 */
public class zadanie6 {
    public static void main(String[] args) {
        divideText(loadText());
    }

    private static String loadText() {
        System.out.println("Type the text");
        Scanner scan = new Scanner(System.in);
        String givenText = scan.nextLine();
        return givenText;
    }

    public static void divideText(String text) {
        String splittedText[] = text.split("", 0);
        for (int i = splittedText.length-1; i >= 0; i--) {
            System.out.print(splittedText[i]);
        }
    }
}
