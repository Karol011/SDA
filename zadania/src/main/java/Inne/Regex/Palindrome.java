package Inne.Regex;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        palindrom();
    }
    private static void palindrom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("word?");
        String word = scanner.nextLine();
        StringBuilder stringBuilder = new StringBuilder(word);

        if (word.equalsIgnoreCase(stringBuilder.reverse().toString())) {
            System.out.println("palindrom");
        } else {
            System.out.println("nie palindrom");
        }
    }
}
