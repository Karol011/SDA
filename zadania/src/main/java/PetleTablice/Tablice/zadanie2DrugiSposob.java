package PetleTablice.Tablice;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
public class zadanie2DrugiSposob {
    public static void main(String[] args) {
        //create array and Random instance
        int[] array = new int[20];
        Random rd = new Random(System.currentTimeMillis());

        //create Map to count numbers occurrences
        Map<Integer, Integer> counts = new TreeMap<>();

        //fill array with random numbers and count the
        //occurrences in one go...
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(10);

            //count inserted number
            counts.put(
                    array[i],
                    counts.containsKey(array[i]) ? counts.get(array[i]) + 1 : 1
            );
        }

        //print count result:
        System.out.println("\n");
        for (int i : counts.keySet())
            System.out.println("The number " + i +
                    " was inserted " + counts.get(i) + " times.");
    }

}


