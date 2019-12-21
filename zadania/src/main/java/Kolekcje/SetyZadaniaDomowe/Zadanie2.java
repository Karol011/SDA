package Kolekcje.SetyZadaniaDomowe;

/*
Napisz statyczną metodę sprawdzającą, czy w tekście nie powtarzają się
litery z wykorzystaniem zbioru. (boolean zawieraDuplikaty(String text))
 */

import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) {
        System.out.println("Type text to check if it contains duplicate letters: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Text has duplicates: "+containsDuplicates(scanner.nextLine()));
    }

    private static boolean containsDuplicates(String text) {
        int originalLength = text.trim().replaceAll(" ", "").length();
        Set<String> listOfLetters = new TreeSet<>(Arrays.asList(text.
                trim().
                replaceAll(" ", "").
                split("")));
        return originalLength != listOfLetters.size();
    }
}

