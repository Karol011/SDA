package Kolekcje.ListyKolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
4.Stwórz oddzielnego maina, a w nim kolejną listę String'ów. Wykonaj zadania:    - dodaj do listy losowe 100 elementów z zakresu 0-100.
(​konwersja int na string toString.valueOf())
   - oblicz średnią liczb    - usuń wszystkie liczby powyżej średniej    - wypisz wszystkie liczby    - wykonaj kopię listy do tablicy
 */
public class zadanie4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Random random = new Random();
        int randomInt;
        for (int i = 0; i < 100; i++) {
            randomInt = random.nextInt(100) + 1;
            list.add(String.valueOf(randomInt));
        }
        System.out.println(list);
        avgValue(changeListType(list));

    }

    private static List<Integer> changeListType(List<String> listToConvert) {
        List<Integer> convertedList = new ArrayList<>();
        String temp;
        for (int i = 0; i < listToConvert.size(); i++) {
            temp = listToConvert.get(i);
            convertedList.add(Integer.parseInt(temp));
        }
        return convertedList;
    }

    private static Integer[] avgValue(List<Integer> list) {
        int sum = 0;
        int avgValue;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        avgValue = sum / list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > avgValue) {
                list.remove(i);
            }

        }
        System.out.println("chopped down list: " + list);
        Integer[] arrayOfChoppedDownList = new Integer[list.size()];
        arrayOfChoppedDownList = list.toArray(arrayOfChoppedDownList);
        return arrayOfChoppedDownList;
    }


}
