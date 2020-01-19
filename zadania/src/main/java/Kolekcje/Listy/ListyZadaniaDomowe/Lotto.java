package Kolekcje.Listy.ListyZadaniaDomowe;

import java.util.*;
import java.util.stream.Collectors;

public class Lotto {
    public static void main(String[] args) {
        Set<Integer> wybraneLiczby = new LinkedHashSet<>(graj());
        Set<Integer> wylosowaneLiczby = new HashSet<>(przeprowadzLosowanie());

        System.out.println("Wybrane liczby: " + wybraneLiczby +
                " \nwylosowane liczby: " + wylosowaneLiczby +
                " \ntrafiono : " + zwrocWynik(wybraneLiczby, wylosowaneLiczby));
    }

    private static Set<Integer> graj() {
        Scanner scanner = new Scanner(System.in);
        int podanaLiczba;
        int iloscLiczb = 0;
        Set<Integer> liczby = new LinkedHashSet<>();

        System.out.println("Podaj 6 liczb: ");
        while (iloscLiczb < 6) {
            liczby.add(podanaLiczba = scanner.nextInt());
            while (podanaLiczba > 49 || podanaLiczba < 1) {
                System.out.println("podaj liczbe z przedzialu 1-49, ktora sie nie powtarza");
                liczby.remove(podanaLiczba);
                liczby.add(podanaLiczba = scanner.nextInt());
            }
            iloscLiczb++;
        }

        return liczby;
    }

    private static Set<Integer> przeprowadzLosowanie() {
        Random random = new Random();
        Set<Integer> wylosowaneLiczby = new HashSet<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            wylosowaneLiczby.add(random.nextInt(49) + 1);
        }
        return wylosowaneLiczby;
    }

    private static int zwrocWynik(Set<Integer> wybraneLiczby, Set<Integer> wylosowaneLiczby) {
        Set<Integer> common = wybraneLiczby.stream().filter(wylosowaneLiczby::contains).collect(Collectors.toSet());
        return common.size();
    }


}
