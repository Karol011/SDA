package Grudzien7.Kolekcje5;

import java.util.HashMap;
import java.util.Map;

public class WystapieniaWTekscie {
    public static void main(String[] args) {
        Map<String, Integer> slowa = new HashMap<>();
        String jakisDlugiTekst = "Ala ma kota a kot tez ma Ale. Ale Ala nie ma juz kota";
        System.out.println(zliczWystapieniaSlow(jakisDlugiTekst));

    }

    static Map<String, Integer> zliczWystapieniaSlow(String podanyTekst) {
        Map<String, Integer> slowo = new HashMap<>();
        String[] tablicaSlow = podanyTekst.toLowerCase().split(" ");

        for (int i = 0; i < tablicaSlow.length; i++) {
            if (!slowo.containsKey(tablicaSlow[i])) {
                slowo.put(tablicaSlow[i], 1);
            } else {
                slowo.put(tablicaSlow[i], slowo.get(tablicaSlow[i]) + 1);
            }
        }
        return slowo;
    }


}
