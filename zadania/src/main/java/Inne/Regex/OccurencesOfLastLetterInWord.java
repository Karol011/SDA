package Inne.Regex;

import java.util.Scanner;

/*
10.Napisać program,który wczytuje od użytkownika ciąg znaków,a następnie wyświetla informację o tym ile razy w tym ciągu powtarza się jego ostatni znak.
Przykład,dla ciągu „Abrakadabra” program powinien wyświetlić 4,ponieważ ostatnim znakiem jest literka „a”, która występuje w podanym ciągu łącznie 4 razy
 */
public class OccurencesOfLastLetterInWord {
    public static void main(String[] args) {
        occurencesOfLAstLetter();

    }

    private static void occurencesOfLAstLetter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("word?");
        String word = scanner.nextLine().trim();
        int occurenceCounter = 0;
        char lastLetter = word.charAt(word.length() - 1);
        for (int i = 0; i < word.toCharArray().length; i++) {
            if (lastLetter == word.charAt(i)) {
                occurenceCounter++;
            }
        }
        System.out.println("Last letter occured: " + occurenceCounter + " times");
    }
}