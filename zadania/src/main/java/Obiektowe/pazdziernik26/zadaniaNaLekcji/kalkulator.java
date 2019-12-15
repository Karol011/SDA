package sda.pl.javagda34.pazdziernik26.zadaniaNaLekcji;

import java.util.Scanner;

/*
1.Utwórz program ‚Kalkulator’
1.Nadpisz punkt wejścia, tak aby wyświetlał następującą instrukcję po uruchomieniu:„Podaj rodzaj działania :
 *,+,-,/
 ”„Podaj pierwszą liczbę”
 „Podaj druga liczbę”
 „Otrzymany wynik {działanie} wynosi: {wynik}”
2.Użyj switchado wybrania rodzaju metody
3.Użyj switchado wydrukowania końcowego wyniku (np. ‚+’ ’dodawania’) np. po wpisaniu przez użytkownika ‚+’, ‚2’, ‚3’
 wyświetlony zostanie tekst:Wynik dodawania liczb 2 i 3 wynosi: 5
 */
public class kalkulator {
    public static void main(String[] args) {
        System.out.println("Wybierz typ operacji:\n+ dodawanie\n- odejmowanie\n* mnozenie\n/ dzielenie");
        Scanner scan = new Scanner(System.in);
        char znakDzialania = scan.next().charAt(0);
        wybierzDzialanie(znakDzialania);

     /*   switch (znakDzialania) {
            case '+':
                int[] wczytaneLiczby = wczytajLiczby();
                System.out.println("Wynik dodawania to " + dodaj(wczytaneLiczby[0], wczytaneLiczby[1]));
                break;
            case '-':
                wczytaneLiczby = wczytajLiczby();
                System.out.println("Wynik odejmowania to " + odejmij(wczytaneLiczby[0], wczytaneLiczby[1]));
                break;
            case '*':
                wczytaneLiczby = wczytajLiczby();
                System.out.println("Wynik mnozenia to " + pomnoz(wczytaneLiczby[0], wczytaneLiczby[1]));
                break;
            case '/':
                wczytaneLiczby = wczytajLiczby();
                System.out.println("Wynik dzielenia to " + podziel(wczytaneLiczby[0], wczytaneLiczby[1]));
                break;
        }
*/

        //wczytaneLiczby = wczytajLiczby();             //przypisanie wartosci tablicy metody wczytaj liczby do zmienneh wcyztaneLiczby
    }

    public static void wybierzDzialanie(int znakDzialania) {
        switch (znakDzialania) {
            case '+':
                int[] wczytaneLiczby = wczytajLiczby();
                System.out.println("Wynik dodawania to " + dodaj(wczytaneLiczby[0], wczytaneLiczby[1]));
                break;
            case '-':
                wczytaneLiczby = wczytajLiczby();
                System.out.println("Wynik odejmowania to " + odejmij(wczytaneLiczby[0], wczytaneLiczby[1]));
                break;
            case '*':
                wczytaneLiczby = wczytajLiczby();
                System.out.println("Wynik mnozenia to " + pomnoz(wczytaneLiczby[0], wczytaneLiczby[1]));
                break;
            case '/':
                wczytaneLiczby = wczytajLiczby();
                System.out.println("Wynik dzielenia to " + podziel(wczytaneLiczby[0], wczytaneLiczby[1]));
                break;

        }

    }

    public static int dodaj(int a, int b) {
        return a + b;
    }

    public static int odejmij(int a, int b) {
        return a - b;
    }

    public static int pomnoz(int a, int b) {
        return a * b;
    }

    public static int podziel(int a, int b) {
        while (b != 0) {
            return a / b;
        }
        return a / b;
    }

    public static int[] wczytajLiczby() {
        {
            System.out.println("podaj pierwsza liczbe");
            Scanner scan1 = new Scanner(System.in);
            int a = scan1.nextInt();
            System.out.println("podaj druga liczbe");
            int b = scan1.nextInt();

            int[] tablicaDanych = new int[2];
            tablicaDanych[0] = a;
            tablicaDanych[1] = b;

            return tablicaDanych;
        }
/*
    public static int odejmij(int a, int b) {
        return a - b;
    }

    public static int pomnoz(int a, int b) {
        return a * b;
    }

    public static int podziel(int a, int b) {
        return a / b;
    }

 */
    }
}
