package PetleTablice.Tablice_i_petle;

import java.util.*;

/*
10. Utwórz program, który przyjmuje tablicę od użytkownika w postaci liczb całkowitych odseparowanych przecinkiem,
 a następnie na tej tablicy usuwa wszystkie zduplikowane elementy i wyświetla tablicę bez duplikacji.
 */
public class zadanie10 {
    public static void main(String[] args) {
        Integer[] tablica = new Integer[]{5, 3, 5, 2, 5, 2, 2, 4, 1, 1};
        Set<Integer> set = new HashSet<>(Arrays.asList(tablica));
        tablica = set.toArray(new Integer[set.size()]);
        Arrays.stream(tablica)
                .forEach(integer -> System.out.println(integer));

    }

}
