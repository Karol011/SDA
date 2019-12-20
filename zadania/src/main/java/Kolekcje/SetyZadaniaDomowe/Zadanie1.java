package Kolekcje.SetyZadaniaDomowe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zadanie1 {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));

        System.out.println("size:" + set.size());
        set.forEach(System.out::println);
        set.remove(10);
        set.remove(12);
        System.out.println("new size:" +set.size());
        set.forEach(integer -> System.out.println(integer));
    }
}
