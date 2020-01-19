package Kolekcje.MapyZadaniaDomowe.Kolekcje6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SkorowidzLiter {
    public static void main(String[] args) {
        String tekst = "Ala ma kota";
        System.out.println(skorowidzLiterowy(tekst));
    }

    private static Map<String, Set<Integer>> skorowidzLiterowy(String tekst) {
        Map<String, Set<Integer>> litery = new HashMap<>();
        Set<Integer> iloscWystapien;
        String[] tablicaLiter = tekst.toLowerCase().trim().split("");

        for (int i = 0; i < tablicaLiter.length; i++) {
            if (!litery.containsKey(tablicaLiter[i])) {
                litery.put(tablicaLiter[i], new HashSet<>());
                litery.get(tablicaLiter[i]).add(i);
            } else {
                litery.get(tablicaLiter[i]).add(i);
            }
        }
return litery;
    }
}
