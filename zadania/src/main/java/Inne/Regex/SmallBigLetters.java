package Inne.Regex;

import java.util.Scanner;

public class SmallBigLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type you word");
        String word = scanner.nextLine();
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
    }


}
