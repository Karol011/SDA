package Obiektowe.MniejZlozone.StatystykiSlow;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("wpisz jakis tekst");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] tablica = input.split(" ");
        Map<String, Long> mapaWystapien = Stream.of(tablica)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("ilosc slow: " + tablica.length);
        System.out.println("max wystapien " + mapaWystapien.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)
                ));
        System.out.println("min wystapien: " + mapaWystapien.entrySet().stream()
                .min(Comparator.comparing(Map.Entry::getValue)));
    }
}
/*
8. Statystyki użytych słów – program pobiera od użytkownika tekst. Następnie oblicza statystyki:
a. Ilość użytych słów
b. Średnia długość słowa
c. **Najczęstsze słowo
d. **Najrzadsze słowo
 */

