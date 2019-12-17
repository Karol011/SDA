package Inne.Regex;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        reverseString();
    }

    private static void reverseString() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter string to reverse:");
        String typedString = scanner.nextLine();
        StringBuilder sb = new StringBuilder(typedString);
        System.out.println(sb.reverse().toString());

    }
}


