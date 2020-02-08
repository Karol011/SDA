package LambdyIStrumienie.LambdyZadaniaSwiateczne;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Zaimplementuj poniższe metody z użyciem wyrażeń lambda i/lub klas Stream oraz Optional.
 */
public class Exercises0 {
    public static void main(String[] args) {
        String str = "striiiing";
        IntStream intStream = str.codePoints();
        System.out.println("number of positive numbers: " + numPositive(Arrays.asList(4, -1, 11, -12, 0, -1, 5, -3)));


    }

    /**
     * Funkcja zwraca pierwszy indeks pod którym
     * określony znak znajduje się w podanym Stringu.
     */
    public OptionalInt indexOf(Integer integer, char c) {


        OptionalInt optionalInt = OptionalInt.of(c);

        optionalInt.ifPresent(p -> System.out.println(p));
        throw new UnsupportedOperationException("Not implemented yet");
    }

    /**
     * Funkcja zwraca ilość liczb dodatnich w podanej liście.
     */
    private static long numPositive(List<Integer> numbers) {
        long positiveNumbers = numbers.stream()
                .filter(i -> i > 0)
                .count();
        return positiveNumbers;
        //throw new UnsupportedOperationException("Not implemented yet");
    }
}

