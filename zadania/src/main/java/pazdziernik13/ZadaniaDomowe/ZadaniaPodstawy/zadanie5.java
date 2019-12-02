package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.ZadaniaPodstawy;

import java.util.Scanner;

/*Zadanie 5. Stwórz aplikację która prosi użytkownika o imie. Wypisz komunikat z prośbą o imie.
 Po wpisaniu sprawdź czy imie *równa się Ania* - jeśli tak, wypisz komunikat "Siema szefowa!"
  jeśli nie, wypisz komunikat "Witaj {Imie}!" zastąp imie wartością zmiennej (wczytanej ze scannera od użytkownika).

 */
public class zadanie5 {
    public static void main(String[] args) {
        String imie;
        System.out.println("podaj swoje imie");
        Scanner zmiennaScaner1 = new Scanner(System.in);
        imie = zmiennaScaner1.nextLine();

        if (imie.equals("Ania")){
            System.out.println("siema szefowa!");
        }else{
            System.out.println("witaj " + imie);
        }

    }
}
