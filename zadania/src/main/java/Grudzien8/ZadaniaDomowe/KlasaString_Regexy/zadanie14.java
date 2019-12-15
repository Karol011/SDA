package Grudzien8.ZadaniaDomowe.KlasaString_Regexy;

import java.util.Scanner;

/*
14. Napisz program, który umożliwia szyfrowanie podanego ciągu znaków przy użyciu
szyfru Cezara, który jest szczególnym przypadkiem szyfru podstawieniowego
monoalfabetycznego. Użytkownik program podaje tekst do zaszyfrowania oraz liczbę
n, o którą przesunięty jest alfabet za pomocą którego szyfrujemy tekst. Dla
uproszczenia można przyjąć, że łańuch wejściowy składa się tylko z małych liter
alfabetu angielskiego, tj. ’a’ – ’z’ (26 znaków) oraz spacji.
 */
public class zadanie14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj wyraz");
        String wyraz = scanner.nextLine();
        System.out.println("podaj ilosc przesuniec");
        int iloscPrzesuniec = scanner.nextInt();
        char[] wyrazPoPrzesunieciu = new char[wyraz.length()];

        int wartoscAsciiDanegoZnaku = 0;
        for (int i = 0; i < wyraz.length(); i++) {
            wartoscAsciiDanegoZnaku = (int) wyraz.toLowerCase().charAt(i);
            wyrazPoPrzesunieciu[i] = (char) (wartoscAsciiDanegoZnaku + iloscPrzesuniec);
        }

        String string = new String(wyrazPoPrzesunieciu);
        System.out.println(string);


    }
}
