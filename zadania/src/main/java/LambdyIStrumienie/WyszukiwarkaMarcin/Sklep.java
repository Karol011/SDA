package LambdyIStrumienie.WyszukiwarkaMarcin;

import lombok.Setter;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Setter
public class Sklep {
    private String filtrMarki;
    private String filtrKoloru;
    private String filtrModelu;
    private double filtrCeny;
    private int filtrWieku;

    protected List<Samochod> posiadaneSamochody;
    private List<Samochod> przefiltrowanaListaSamochodow;

    public Sklep(List<Samochod> samochodySklepu) {
        this.posiadaneSamochody = samochodySklepu;
        this.przefiltrowanaListaSamochodow = samochodySklepu;
    }

    public void zapytajOFiltry() {
        System.out.println("Podaj po przecinku numery opcji, po ktorych chcesz filtrowac auta:");
        System.out.println("1. marka");
        System.out.println("2. kolor");
        System.out.println("3. model");
        System.out.println("4. cena");
        System.out.println("5. wiek");

        Scanner scanner = new Scanner(System.in);
        String filtry = scanner.nextLine();
        ustawFiltry(filtry);

    }

    private void ustawFiltry(String filtry) {
        Scanner scanner = new Scanner(System.in);
        int[] indeksyFiltrow = zamienNaTabliceIntow(filtry);
        for (int a : indeksyFiltrow) {
            switch (a) {
                case 1:
                    System.out.println("Podaj szukana marke:");
                    setFiltrMarki(scanner.nextLine().trim());
                    break;
                case 2:
                    System.out.println("Podaj szukany kolor:");
                    setFiltrKoloru(scanner.nextLine().trim());
                    break;
                case 3:
                    System.out.println("Podaj szukany model:");
                    setFiltrModelu(scanner.nextLine().trim());
                    break;
                case 4:
                    System.out.println("Podaj max cene:");
                    setFiltrCeny(scanner.nextDouble());
                    break;
                case 5:
                    System.out.println("Podaj max wiek:");
                    setFiltrWieku(scanner.nextInt());
                    break;
                default:
                    System.out.println("Nie ma filtru o takim numerze");
            }
        }
    }

    private int[] zamienNaTabliceIntow(String filtry) {
        String[] tablica = filtry.trim().split(",");

        int[] tablicaFiltrowInt = new int[tablica.length];

        for (int i = 0; i < tablica.length; i++) {
            tablicaFiltrowInt[i] = Integer.parseInt(tablica[i]);
        }

        return tablicaFiltrowInt;
    }


    public void pracuj() {
        zapytajOFiltry();
        znajdz();
        wypisz();
    }

    private void wypisz() {
        for (Samochod s: przefiltrowanaListaSamochodow) {
            System.out.println(s);
        }
    }

    private void znajdz() {
        if (filtrMarki != null) {
            przefiltrowanaListaSamochodow = przefiltrowanaListaSamochodow.stream()
                    .filter(auto -> auto.getMarka().equalsIgnoreCase(filtrMarki))
                    .collect(Collectors.toList());
        }
        if (filtrKoloru != null) {
            przefiltrowanaListaSamochodow = przefiltrowanaListaSamochodow.stream()
                    .filter(auto -> auto.getKolor().equalsIgnoreCase(filtrKoloru))
                    .collect(Collectors.toList());
        }
        if (filtrModelu != null) {
            przefiltrowanaListaSamochodow = przefiltrowanaListaSamochodow.stream()
                    .filter(auto -> auto.getModel().equalsIgnoreCase(filtrModelu))
                    .collect(Collectors.toList());
        }

        if (filtrCeny != 0) {
            przefiltrowanaListaSamochodow = przefiltrowanaListaSamochodow.stream()
                    .filter(auto -> auto.getCena() < filtrCeny)
                    .collect(Collectors.toList());
        }

        if (filtrWieku != 0) {
            przefiltrowanaListaSamochodow = przefiltrowanaListaSamochodow.stream()
                    .filter(auto -> auto.getWiek() < filtrWieku)
                    .collect(Collectors.toList());
        }
    }
}