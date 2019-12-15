package sda.pl.javagda34.pazdziernik26.zadaniaNaLekcji;

import java.util.Scanner;

/*
1.Napisz program, który sprawdza czy liczba podana przez użytkownika jest podzielna przez 3 lub 5.
2.* Napisz program który pozwala użytkownikowi samemu zdecydować podzielność przez jaką liczbę będzie badana
 */
public class zadanieMetody2 {
    public static void main(String[] args) {
        int toCoWpisalUzytkownik = readNumbers();
        System.out.println(toCoWpisalUzytkownik);
        int czyJestPodzielna = ifCanBeDivided(toCoWpisalUzytkownik);

    }

    public static int readNumbers() {
        int givenNumber;
        System.out.println("Podaj liczbe");
        Scanner scan = new Scanner(System.in);
        givenNumber = scan.nextInt();
        return givenNumber;
    }

    public static int ifCanBeDivided(int givenNumber) {
        System.out.println("Podaj dzielnik");
        Scanner scan = new Scanner(System.in);
        int divider = scan.nextInt();

        if (givenNumber % divider == 0) {
            System.out.println("Jest podzielna przez " + divider);
        } else {
            System.out.println("nie jest podzielna");
        }
        return givenNumber;
    }
}
