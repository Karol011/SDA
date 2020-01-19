package Kolekcje.MapyZadaniaDomowe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class MapaWystapienSlow {
    public static void main(String[] args) throws FileNotFoundException {
        // readLineAndSaveItToMap().forEach((k,v) -> System.out.println("key: "+k + "value :"+v));
        // printMap(readLineAndSaveItToMap());
        printMap(sortMap(readLineAndSaveItToMap()));
    }

    static Map<String, Integer> readLineAndSaveItToMap() throws FileNotFoundException {
        File plik = new File("C:\\Users\\rudaz\\Desktop\\plik.txt");
        Scanner scanner = new Scanner(plik);

        String[] singleWord;
        Map<String, Integer> occurenceMap = new HashMap<>();
        while (scanner.hasNextLine()) {
            singleWord = scanner.nextLine().trim().
                    toLowerCase().
                    replaceAll(",", "").
                    replaceAll("\"", "").
                    replaceAll("\\.", "").
                    split(" ");

            for (String element : singleWord) {
                occurenceMap.compute(element, (k, v) -> v == null ? 1 : v + 1);
            }

        }
        return occurenceMap;
    }

    static Map<String, Integer> sortMap(Map<String, Integer> mapToSort) {
        Map<String, Integer> sortedTreeMap = mapToSort.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        sortedTreeMap.putAll(mapToSort);
        return sortedTreeMap;
    }

    static void printMap(Map<String, Integer> map) {
        for (Map.Entry el : map.entrySet()) {
            System.out.println(el.getKey() + " : " + el.getValue());
        }
    }
}
