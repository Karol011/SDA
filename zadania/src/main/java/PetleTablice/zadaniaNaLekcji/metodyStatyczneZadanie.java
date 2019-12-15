package sda.pl.javagda34.pazdziernik26.zadaniaNaLekcji;
/*
1.Napisz program, który będzie posiadał następujące metody statyczne:
    1.drukujParzystoscLiczby
    1.Przyjmuje pojedynczy parametr w postaci liczby całkowitej
    2.Zwraca nic
    3.Drukuje na ekranie wynik „liczba jest parzysta” gdy liczba jest parzysta i „liczba jest nieparzysta” dla nieparzystej liczby
2.czyLiczbaJestParzysta
    1.Przyjmuje pojedynczy parametr w postaci liczby całkowitej
    2.Zwraca typ logiczny w postaci wyniku obliczenia parzystości liczby
3.* Zastanów się w jaki sposób mógłbyś ułatwić sobieżycie i zminimalizować liczbę zduplikowanego kodu
 */
public class metodyStatyczneZadanie {
    public static void main(String[] args) {
       // drukujParzystoscLiczby(555);

        boolean result = sprawdzIDrukujCzyParzysta(66);             //przypisanie zmiennej result wartosci wyniku metody sprawdz...
        System.out.println(result);                                         //wydrukowanie wyniku dla uzytkownika
    }

    public static boolean sprawdzIDrukujCzyParzysta(int variable) {
        boolean jestParzysta = false;
        if (variable % 2 == 0) {
            System.out.println("liczba jest parzysta");
            jestParzysta = true;

        } else {
            System.out.println("liczba nieparzysta");
            jestParzysta = false;
        }
        return jestParzysta;                                                //zwracanie wartosci
    }
/*
    public static void drukujParzystoscLiczby(int variable) {
        if (variable % 2 == 0) {
            System.out.println("liczba jest parzysta");
        } else {
            System.out.println("liczba nieparzysta");
        }
    }

    public static boolean czyLiczbaJestParzysta(int variable) {
        boolean jestParzysta = false;
        if (variable % 2 == 0) {
            jestParzysta = true;
        }

        return jestParzysta;
    }
  */
}
