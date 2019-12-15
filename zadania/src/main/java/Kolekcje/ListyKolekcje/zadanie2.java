package Kolekcje.ListyKolekcje;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
2.
Stwórz oddzielnego maina, a w nim kolejną listę integerów. Wykonaj zadania:
- dodaj do listy 10 liczb losowych
- oblicz sumę elementów na liście (wypisz ją)
- oblicz średnią elementów na liście (wypisz ją)
- stwórz kopię listy i ją posortuj : (Collections.sort( listaDoPosortowania) - sortuje listę)
(przykład użycia Collections.sort(lista):
ArrayList<Integer> liczby = new ArrayList<>();
liczby.add(5);
liczby.add(10);
liczby.add(15);
Collections.sort(liczby);
- podaj medianę elementów na liście posortowanej (wypisz ją)
- znajdź największy i najmniejszy element na liście która nie była sortowana. Zrób to pętlą for
- po znalezieniu elementu znajdź index elementu maksymalnego używając kolejnej pętli for
- po znalezieniu elementów (największy i najmniejszy) znajdź index posługując się metodą indexof
Sprawdź działanie aplikacji.Stwórz oddzielnego maina, a w nim kolejną listę integerów.
 */
public class zadanie2 {
    public static void main(String[] args) {
        List<Integer> listaIntow = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listaIntow.add(random.nextInt(1000) + 1);
        }
        int suma = 0;
        for (int i = 0; i < listaIntow.size(); i++) {
            suma += listaIntow.get(i);
        }
        System.out.println("wylosowane liczby:" + listaIntow);
        System.out.println("suma:" + suma);
        System.out.println("Srednia:" + (double) (suma / listaIntow.size()));

        List<Integer> kopiaListy = listaIntow;
        Collections.sort(kopiaListy);
        System.out.println("posorotowana kopia:" + kopiaListy);
        System.out.println("mediana: " + obliczMediane(kopiaListy));
        System.out.println("Najmniejszy element: " + znajdzNajmniejszy(listaIntow));
        System.out.println("Najwiekszy element: " + znajdzNajwiekszy(listaIntow) + " a jego indeks to: " + znajdzIndeksNajwiekszegoElementu(listaIntow));
    }

    static double obliczMediane(List<Integer> lista) {
        int polowaListy = lista.size() / 2;

        if (lista.size() % 2 != 0) {
            return lista.get(polowaListy);
        }
        return ((lista.get(polowaListy) + lista.get(polowaListy - 1)) / 2);

    }

    static int znajdzNajmniejszy(List<Integer> lista) {
        int minVal = Integer.MAX_VALUE;
        for (int i = 0; i < lista.size(); i++) {
            minVal = minVal > lista.get(i) ? lista.get(i) : minVal;
        }
        return minVal;
    }

    static int znajdzNajwiekszy(List<Integer> lista) {
        int maxVal = Integer.MIN_VALUE;
        int indexMaxVal;
        for (int i = 0; i < lista.size(); i++) {
            maxVal = maxVal < lista.get(i) ? lista.get(i) : maxVal;
        }
        return maxVal;
    }

    static int znajdzIndeksNajwiekszegoElementu(List<Integer> lista) {
        int indexMaxVal = 0;
        for (int i = 0; i < lista.size(); i++) {
            indexMaxVal = lista.indexOf(znajdzNajwiekszy(lista));
        }
        return indexMaxVal;
    }
}
