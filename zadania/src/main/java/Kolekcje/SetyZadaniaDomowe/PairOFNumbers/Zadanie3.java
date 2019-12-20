package Kolekcje.SetyZadaniaDomowe.PairOFNumbers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
3.Utwórz klasę ParaLiczb (int a,int b) i dodaj kilka instancji do zbioru:{(1,2), (2,1), (1,1), (1,2)}.
Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie zoczekiwaniem?
 */
public class Zadanie3 {
    public static void main(String[] args) {
        Set <PairOfNumbers> set = new HashSet<>(Arrays.asList(
                new PairOfNumbers(1,2),
                new PairOfNumbers(2,1),
                new PairOfNumbers(1,1),
                new PairOfNumbers(1,2)));

        System.out.println(set);
}}
