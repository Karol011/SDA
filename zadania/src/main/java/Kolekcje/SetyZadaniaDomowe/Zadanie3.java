package Kolekcje.SetyZadaniaDomowe;

import javax.print.attribute.standard.Finishings;
import java.util.*;

/*
Zadanie 1:Stwórz aplikację która przyjmuje od użytkownika ciąg znaków (dowolny).
Podziel ciąg(split) na pojedyncze litery. Twoim zadaniem jest stworzenie aplikacji która wypisze tylkounikalne litery frazy wpisanej przez użytkownika.
Pomyśl o wykorzystaniu cechy zbioru -pamiętaj, że zbiór sam usuwa duplikaty.Zadanie 1b:Stwórz aplikację która dzieli zdanie na słowa,
 a następnie wypisuje tylko unikalne
 */
public class Zadanie3 {
    public static void main(String[] args) {
        printUniqueWords();
        printUniqueLetters();
    }

    private static void printUniqueLetters() {
        System.out.println("type some text");
        Scanner scanner = new Scanner(System.in);
        List<String> splittedLetters = new LinkedList<>(Arrays.asList(scanner.nextLine().split("")));
        Set<String> uniqueLetters = new LinkedHashSet<>(splittedLetters);
        System.out.println(uniqueLetters);
    }

    private static void printUniqueWords() {
        System.out.println("type some text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> splittedWords = new LinkedList<>(Arrays.asList(text.split(" ")));
        Set<String> uniqeWords = new LinkedHashSet<>(splittedWords);
        System.out.println(uniqeWords);
    }
}
