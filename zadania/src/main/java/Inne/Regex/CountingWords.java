package Inne.Regex;

import java.util.*;

public class CountingWords {
    public static void main(String[] args) {
        System.out.println(countWords());
    }


    static Map<String, Integer> countWords() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> words = new HashMap<>();

        System.out.println("type the sentence");
        String[] arrayOfWords = scanner.nextLine().toLowerCase().trim().split(" |,");
        System.out.println(Arrays.toString(arrayOfWords));
        for (int i = 0; i < arrayOfWords.length; i++) {
            if (!words.containsKey(arrayOfWords[i])) {//if doesnt containt word, add it and set value as 1
                words.put(arrayOfWords[i], 1);
            } else {
                words.put(arrayOfWords[i], words.get(arrayOfWords[i])+1 ); //if contains get value and increment
            }
        }
        return words;
    }


}
