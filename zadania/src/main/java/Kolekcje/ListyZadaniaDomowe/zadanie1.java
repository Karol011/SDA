package Kolekcje.ListyZadaniaDomowe;


import java.util.*;

/*
1.
Stwórz listę Integerów. Wykonaj zadania:
- dodaj do listy 5 elementów ze scannera
- dodaj do listy 5 elementów losowych
- wypisz elementy
Sprawdź działanie aplikacji.
 */
public class zadanie1 {
    public static void main(String[] args) {
        List<Integer> listaIntow = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("podaj 5 liczb");
        for (int i = 0; i < 5; i++) {
            listaIntow.add(scanner.nextInt());
            listaIntow.add(random.nextInt(100));
        }
        System.out.println(listaIntow);
        Collections.sort(listaIntow);
        System.out.println(listaIntow);
    }

}
