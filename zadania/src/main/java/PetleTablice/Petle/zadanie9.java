package PetleTablice.Petle;

import java.util.Random;
import java.util.Scanner;

/*
9. Gra w ”Za dużo, za mało”.
 Komputer losuje liczbę z zakresu 1 . . . 100,
 a gracz  (użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych   wartości.
  Jeżeli podana wartość jest:
   a. większa – wyświetlany jest komunikat „Podałeś za dużą wartość”,
   b. mniejsza – wyświetlany jest komunikat „Podałeś za małą wartość”,
   c. identyczna z wylosowaną – wyświetlany jest komunikat „Gratulacje” i gra się   kończy
 */
public class zadanie9 {
    public static void main(String[] args) {
        Random randomowaZmienna = new Random();
        int randomowyInt = randomowaZmienna.nextInt(100);
        int podanaLiczba = -100;
        while (podanaLiczba != randomowyInt) {
            System.out.println("Podaj liczbe ");
            Scanner zmiennaScanerowa = new Scanner(System.in);
            podanaLiczba = zmiennaScanerowa.nextInt();
            if (podanaLiczba < randomowyInt) {
                System.out.println("Za malo!");
            }
            if (podanaLiczba > randomowyInt) {
                System.out.println("Za duzo!");
            }
            if (podanaLiczba == randomowyInt) {
                System.out.println("Brawo, zgadles!");
            }


        }


    }
}
