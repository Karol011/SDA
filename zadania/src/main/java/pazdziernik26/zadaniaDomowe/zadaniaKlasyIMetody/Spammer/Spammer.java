package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.zadaniaKlasyIMetody.Spammer;

import java.util.Scanner;

/*
7. Spammer – program pyta użytkownika o słowo oraz ilość powtórzeń wg której ma wyświetlić zadane słowa
a. Metoda void
b. 2 argumentowa – Słowo, ilośc powtórzeń
c. Do…while (wprowadzone słowo !equals(„”);
 */
public class Spammer {
    public static void main(String[] args) {
spam(askForWord(),askForQuantity());
    }

    public static String askForWord() {
        System.out.println("What word would you like me to spam?");
        Scanner scanner = new Scanner(System.in);
        String spammedWord = scanner.nextLine();
        return spammedWord;
    }

    public static int askForQuantity() {
        System.out.println("How many times?");
        Scanner scanner = new Scanner(System.in);
        int howManySpams = scanner.nextInt();
        return howManySpams;
    }

    public static void spam(String word, int quantity) {
        int counter = 0;
        do {
            System.out.println(word);
            counter++;
        } while (counter < quantity);
    }
}
