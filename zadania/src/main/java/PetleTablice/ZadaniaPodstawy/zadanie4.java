package PetleTablice.ZadaniaPodstawy;

import java.util.Scanner;

/*
Zadanie 4. Stwórz aplikację która prosi użytkownika o imie komunikatem:
"Wpisz swoje imie:"
następnie prosi użytkownika o nazwisko podobnym komunikatem.
 Wartości wpisane przez użytkownika przypisz do zmiennych a następnie wypisz komunikat z przywitaniem:
"Witaj {Imie} {Nazwisko}"
Zamiast klamerek i słowa imie/nazwisko wpisz wartości wpisane przez użytkownika.

 */
public class zadanie4 {
    public static void main(String[] args) {
        String imie, nazwisko;
        System.out.println("podaj swoje imie");
        Scanner zmiennaScaner1 = new Scanner(System.in);
        imie = zmiennaScaner1.nextLine();

        System.out.println("podaj swoje nazwisko");
        Scanner zmiennaScaner2 = new Scanner(System.in);
        nazwisko = zmiennaScaner2.nextLine();

        System.out.println("Witaj " + imie + " " + nazwisko);


    }
}
