package pazdziernik13.ZadaniaDomowe.Tablice;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class zadanie2StackOverflow {
    public static void main(String[] args) {
        // define a data structure that holds the random numbers and their count
        Map<Integer, Integer> valueOccurrences = new TreeMap<>();
        // create a Random once to be used in all iteration steps
        Random random = new Random(10);

        for (int i = 0; i < 20; i++) {
            // create a new random number
            int ranNum = random.nextInt(10);
            // check if your data structure already contains that number as a key
            if (valueOccurrences.keySet().contains(ranNum)) {
                // if yes, then increment the currently stored count
                valueOccurrences.put(ranNum, valueOccurrences.get(ranNum) + 1);
            } else {
                // otherwise create a new entry with that number and an occurrence of 1 time
                valueOccurrences.put(ranNum, 1);
            }
        }

        // print the results
        valueOccurrences.forEach((key, value) -> {
            System.out.println(key + " occurred " + value + " times");
        });
    }
}
