package Zgapa;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class tescik {
   static Map<Integer, List<String>> map = new LinkedHashMap<>(10);
    static Multimap<Integer, String> myMultimap = ArrayListMultimap.create(3,2);




    public void addNewString(int key, String value) {
        List<String> temporaryList = map.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());


        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            if (entry.getKey() == key && entry.getValue().equals(null)) {
                temporaryList.add(value);
                map.put(key, temporaryList);
            } else {
                temporaryList = map.values().stream()
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList());
                temporaryList.add(value);
            }

        }
    }

    public static void main(String[] args) {

        myMultimap.put(1, "dupa");
        myMultimap.put(2, "koniec");
        myMultimap.put(2, "poczatek");
        myMultimap.put(3, "siemano");
        myMultimap.put(2, "kalafiorek");
        myMultimap.put(4, "pomidorek");
        myMultimap.put(7, "pomidorek");
        myMultimap.put(7, "sadasd");
        myMultimap.put(7, "sadasss");
        myMultimap.put(7, "sadassss");
        myMultimap.put(10, null);

        myMultimap.remove(2,"koniec");
        myMultimap.removeAll(3);
        myMultimap.forEach((key, value) ->
                System.out.println(key + "" + value));


        map.put(1, new ArrayList<>());
        map.put(2, new ArrayList<>());
        map.put(3, new ArrayList<>());
        map.put(4, new ArrayList<>());
        map.put(5, new ArrayList<>());

        map.put(3, Collections.emptyList());

        map.forEach((key, value) ->
                System.out.println(key + "" + value));



    }
}
