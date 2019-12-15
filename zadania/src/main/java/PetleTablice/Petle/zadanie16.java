package PetleTablice.Petle;

import java.util.Scanner;

/*
16. Napisać program, który sumuje cyfry w tekście podanym przez użytkownika.
Przykład:
"Ala ma 1 psa i 2 koty. Jola ma 10 rybek i 2 papugi."
Wynik:
6
 */
public class zadanie16 {
    public static void main(String[] args) {
        System.out.println("Ilosc cyfr w podanym tekscie wynosi:" + czyZnakJestCyfra(podzielNapis(wczytajNapis())));
    }

    public static String wczytajNapis() {
        System.out.println("Podaj zdanie, w ktorym wystepuja cyfry. Program je zsumuje");
        Scanner scan = new Scanner(System.in);
        String wczytanyNapis = scan.nextLine();
        return wczytanyNapis;
    }

    public static char[] podzielNapis(String wczytanyNapis) {
        char[] znakZTekstu = new char[100];
        for (int i = 0; i < wczytanyNapis.length(); i++) {
            znakZTekstu[i] = wczytanyNapis.charAt(i);
        }
        return znakZTekstu;
    }

    public static int czyZnakJestCyfra(char[] znakiZTekstu) {
        char tenKonkretnyZnak = znakiZTekstu[0];
        int iloscCyfrWTekscie = 0;

        for (int i = 0; i < znakiZTekstu.length; i++) {
            tenKonkretnyZnak = znakiZTekstu[i];
            if ((Character.toString(tenKonkretnyZnak).matches("[0-9]"))) {
                iloscCyfrWTekscie++;
            }
        }
        return iloscCyfrWTekscie;
    }
}
