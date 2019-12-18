package Kolekcje.ListyKolekcje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Stwórz oddzielnego maina, a w nim kolejną listę ​String'ów​. Wykonaj zadania:
- dodaj do listy elementy 10030, 3004, 4000, 12355, 12222, 67888, 111200, 225355,2222, 1111, 3546, 138751, 235912
 (jako stringi) (dodaj je posługując się metodąArrays.asList())
 Przykład użycia Arrays.asList():ArrayList<Integer> liczby = new ArrayList<>(Arrays.asList(23, 32, 44, 55, 677, 11, 33));
 Podany przykład to tylko demonstracja metody Arrays.asList, zadanie należy wykonaćna liście String’ów.    -
 określ indeks elementu 138751 posługując się metodą indexOf    - sprawdź czy istnieje na liście obiekt 67888 metodą contains (wynik wypisz na ekran)
  - sprawdź czy istnieje na liście obiekkt 67889 metodą contains (wynik wypisz na ekran)    - usuń z listy obiekt 67888 oraz 67889 (metoda remove)
     - wykonaj ponownie powyższe sprawdzenia.
 */
public class zadanie3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("10030", "3004", "4000", "12355", "12222", "67888", "111200", "225355", "2222", "1111", "3546", "138751", "235912"));

        System.out.println(list.indexOf("138751"));
        System.out.println("does list contain: 67888? " + list.contains("67888"));
        System.out.println("does list contain: 67889? " + list.contains("67889"));
        list.remove("67888");
        System.out.println("does list contain: 67888? " + list.contains("67888"));
        System.out.println("does list contain: 67889? " + list.contains("67889"));

        System.out.println("\n"+list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
