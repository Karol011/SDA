package PetleTablice.Petle;

import java.util.Scanner;

/*
7. Napisać program, który pobiera od użytkownika ilość liczb ​N​, a następnie wczytuje:
 - N liczb całkowitych od użytkownika
 - W następnej kolejności program powinien wyświetlić sumę największej oraz najmniejszej z podanych liczb
 oraz ich średnią arytmetyczną.
 */
public class zadanie7 {
    public static void main(String[] args) {
        int iloscLiczbN, liczbaCalkowita = 0;
        int najmniejszaLiczba=100000, najwiekszaLiczba = -555555;
        System.out.println("podaj ilosc liczb N:");
        Scanner scannerIloscLiczbN = new Scanner(System.in);
        iloscLiczbN = scannerIloscLiczbN.nextInt();
        for (int i = 1; i <= iloscLiczbN; i++) {
            System.out.println("Podaj liczbe calkowita nr" + i);
            Scanner scannerLiczbaCalkowita = new Scanner(System.in);
            liczbaCalkowita = scannerLiczbaCalkowita.nextInt();
            if (liczbaCalkowita < najmniejszaLiczba) {
                najmniejszaLiczba = liczbaCalkowita;
            } else if (liczbaCalkowita > najwiekszaLiczba) {
                najwiekszaLiczba = liczbaCalkowita;
            }
        }


        System.out.println("suma najmniejszej i najwiekszej to " + najmniejszaLiczba + "+" + najwiekszaLiczba + "=");
    }

}
