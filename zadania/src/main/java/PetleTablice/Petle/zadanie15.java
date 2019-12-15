package PetleTablice.Petle;

import java.util.Scanner;

/*
15. Napisać program, który wczytuje od użytkownika ciąg znaków, a następnie
sprawdza, czy podany ciąg jest palindromem.

 */
public class zadanie15 {
    public static void main(String[] args) {

        String wyrazPodany = wczytajNapis();
        char[] podzielonyNapis = podzielNapis(wyrazPodany);
        String wyrazPodanyOdTylu = napisOdTylu(podzielonyNapis);
        System.out.println(porownajWyrazy(wyrazPodany, wyrazPodanyOdTylu));

    }

    public static String wczytajNapis() {
        System.out.println("Podaj wyraz");
        Scanner scan = new Scanner(System.in);
        String wczytanyNapis = scan.next();
        return wczytanyNapis;
    }

    public static char[] podzielNapis(String wczytanyNapis) {
        char[] znakZTekstu = new char[10];

        for (int i = 0; i < wczytanyNapis.length(); i++) {
            znakZTekstu[i] = wczytanyNapis.charAt(i);
        }
        return znakZTekstu;
    }

    public static String napisOdTylu(char[] znakZTekstu) {
        String napisOdTylu = "";
        for (int i = znakZTekstu.length - 1; i >= 0; i--) {       //znakZTekstu.length - 2 bo wczytuje spacje na poczatku, w linijce wyzej
            napisOdTylu = napisOdTylu + znakZTekstu[i];
        }
        return napisOdTylu;
    }

    public static boolean porownajWyrazy(String wyrazPodany, String wyrazPodanyOdTylu) {
        boolean isEqual = false;
        //wyrazPodanyOdTylu.replaceAll("\\s","");
        //wyrazPodanyOdTylu.trim();
        //dfdf
        if (wyrazPodany.equals(wyrazPodanyOdTylu.trim())) {
            isEqual = true;
            return true;
        }
        return false;
    }
}
