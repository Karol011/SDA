package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Petle;

import java.util.Scanner;

/*
8. *Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie
danych kończone jest podaniem wartości 0 (nie wliczana do danych). W następnej
kolejności program powinien wyświetlić sumę największej oraz najmniejszej z
podanych liczb oraz ich średnią arytmetyczną.
a. Spróbuj zadanie zrealizować z tablicą oraz bez tablicy
b. Pamiętaj! Czytaj liczby tak długo aż wczytana liczba nie jest 0!.
 */
public class zadanie8 {
    public static void main(String[] args) {

        wyswietlSumeNajmniejszejINajwiekszej(wczytanieLiczbPrzyUzyciuTablicy());

    }

    public static int[] wczytanieLiczbPrzyUzyciuTablicy() {
        System.out.println("Podaj podaj liczby calkowite: \n0 - konczy wprowadzanie");
        Scanner scan = new Scanner(System.in);
        int wprowadzonaLiczba = scan.nextInt();
        int licznik = 1;
        int[] wprowadzoneLiczby = new int[20];
        wprowadzoneLiczby[0] = wprowadzonaLiczba;
        while (wprowadzonaLiczba != 0) {
            wprowadzonaLiczba = scan.nextInt();
            wprowadzoneLiczby[licznik] = wprowadzonaLiczba;
            licznik++;
        }
        int[] nowaTablica = new int[licznik - 1];     //kopiowanie zawartosci starej tablicy do nowej, w ktorej usunieto ostatni indeks (zawierajacy 0)
        for (int i = 0; i < licznik - 1; i++) {
            nowaTablica[i] = wprowadzoneLiczby[i];
            System.out.println(nowaTablica[i]);
        }
        System.out.println();
        for (int i = 0; i < nowaTablica.length; i++) {
            System.out.print(nowaTablica[i] + ",");
        }
        return nowaTablica;
    }


    public static void wyswietlSumeNajmniejszejINajwiekszej(int[] wczytywaneLiczby) {
        int minValue = wczytywaneLiczby[0]; //od pierewszego elementu bo zerowym elementem tablicy jest '0', ktore ma nie byc wliczane do danych
        int maxValue = wczytywaneLiczby[0];
        for (int i = 0; i < wczytywaneLiczby.length; i++) {
            if (wczytywaneLiczby[i] < minValue) {
                minValue = wczytywaneLiczby[i];
            }
            if (wczytywaneLiczby[i] > maxValue) {
                maxValue = wczytywaneLiczby[i];
            }
        }
        double srednia = (double)(minValue + maxValue) /2;
        System.out.println("suma najwiekszej i najmniejszej: " + (minValue + maxValue));
        System.out.println("srednia najwiekszej i najmniejszej: ");
        System.out.printf("%.2f", srednia);
    }

    public static int sumaNajwiekszejINajmniejszej(int najmniejsza, int najwieksza) {
        return najmniejsza + najwieksza;
    }
}
