package Kolekcje.MapyZadaniaDomowe;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise8 {
    public static void main(String[] args) {
        GenericList values = new GenericList<>();
        values.add(5);
        values.add(88);
        values.add(5);
        values.add(6);
        values.add(5);
        values.add("asdfasf");
        values.add("asdfasf");
        values.add("bekaaaa");
        values.add("siemanko");
        values.add("siemanko");
        values.add(456D);
        GenericList values2 = new GenericList<>();
        values2.add(new Random().nextInt(10));
        values2.add(new Random().nextInt(10));
        values2.add(new Random().nextInt(10));
        values2.add(new Random().nextInt(10));
        values2.add(new Random().nextInt(10));
        values2.add(new Random().nextInt(10));

        System.out.println(values.toString());
        System.out.println("duplicates: " + findDuplicates(values));
        System.out.println("map of occurrences: " + countOccurrences(values));

        System.out.println(values2.toString());
        System.out.println("all values values");
        findCommonValues(values, values2).forEach(o -> System.out.println(o));


        List<String> headers = new LinkedList<>(Arrays.asList("aaa:123"));
    }
    /*   *
     * Funkcja zwraca zbiór wartości, które występują więcej niż raz w liście "values".
     *
     * Uwaga: rozwiązanie musi działać w czasie O(n).*/

    private static <T> Set<T> findDuplicates(GenericList<T> values) {
        final Set<T> setToReturn = new HashSet<>();     //set that will be returned (values that occur more than once)
        final Set<T> temporarySet = new HashSet<>();    //temporary set, bridge between list and new set
        for (int i = 0; i < values.list.size(); i++) {
            if (!temporarySet.add(values.get(i))) {     //method set.add returns boolean, so if we try to add value that it already contains it returns false
                setToReturn.add(values.get(i));         //when failed to add value to temporarySet add that value to setToReturn (because its a duplicate)
            }
        }
        return setToReturn;
        //throw new UnsupportedOperationException("Not implemented yet");
    }

    /*
     * Funkcja zwraca mapę przypisującą każdej wartości jej ilość wystąpień w liście "values".
     */
    private static <T> Map<T, Integer> countOccurrences(GenericList<T> values) {
        Map<T, Integer> mapOfOccurences = new HashMap<>();
        for (int i = 0; i < values.list.size(); i++) {
            //checking if map has that specific key
            if (mapOfOccurences.keySet().contains(values.get(i))) {
                //if yes increment its occurrence (Integer)
                mapOfOccurences.put(values.get(i), mapOfOccurences.get(values.get(i)) + 1);
            } else {
                //if not add it as a new key with occurrence 1
                mapOfOccurences.put(values.get(i), 1);
            }
        }
        return mapOfOccurences;


        // throw new UnsupportedOperationException("Not implemented yet");
    }

    /*
     * Funkcja zwraca zbiór wszystkich wartości występujących w obu podanych listach.
     */
    private static <T> Set<T> findCommonValues(GenericList<T> list1, GenericList<T> list2) {
        Stream<T> stream = Stream.concat(list1.list.stream(), list2.list.stream());
        return stream.collect(Collectors.toSet());
        //  throw new UnsupportedOperationException("Not implemented yet");

    }

   /*
     * Funkcja łączy wartości nagłówków HTTP o tej samej nazwie.
     *
     * Argumentem funkcji jest lista nagłówków HTTP w postaci "nazwa:wartość".
     * Każdy nagłówek znajduje się w osobnej linijce.
     * Nazwa nagłówka nie może zawierać znaku ":".
     *
     * Jeśli nagłówek o tej samej nazwie występuje wielokrotnie, w wartości wynikowej powinien
     * pojawić się tylko raz, a jego wartości powinny zostać złączone znakiem ",".
     *
     * Np. dla:
     *
     * aaa:123
     * bbb:897
     * aaa:432
     *
     * funkcja zwraca:
     *
     * aaa:123,432
     * bbb:897
     *
     * Jeśli ta sama wartość pojawia się wielokrotnie, powinna zostać zamieszczona tylko raz.
     *
     * Np. dla:
     *
     * aaa:123
     * bbb:897
     * aaa:123
     *
     * funkcja zwraca:
     *
     * aaa:123
     * bbb:897
     *
     * Względna kolejność nagłówków musi zostać zachowana.
     * Względna kolejność wartości danego nagłówka musi zostać zachowana.
     *
     * @throws IllegalArgumentException jeśli linijka zawiera niepoprawny nagłówek, puste linie są dopuszczalne

    public String mergeHeaders(String headers) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    *
     * Funkcja działa tak samo jak mergeHeaders, z tym że:
     * - nagłówki zwracane są w kolejności alfabetycznej
     * - wartości danego nagłówka ustawione są w kolejności alfabetycznej

    public String normalizeHeaders(String headers) {
        throw new UnsupportedOperationException("Not implemented yet");
    }*/
}