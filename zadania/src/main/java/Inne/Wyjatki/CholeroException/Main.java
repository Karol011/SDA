package Inne.Wyjatki.CholeroException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe");
        double liczba = scanner.nextDouble();
        System.out.println("podaj druga liczbe");
        double liczba2 = scanner.nextDouble();
        if (liczba2 == 0) {
            throw new CholeroException("Pamietaj cholero, nie dziel przez zero!");
        } else {
            System.out.printf("wynik: %.3f ",liczba/liczba2);
        }
    }
}

/*
2.	Napisz program który pyta użytkownika o dwie liczby a następnie sprawdza czy druga liczba nie jest ==0.
Jeśli jest, to wyrzuca wyjątek ‘CholeroException’ z komunikatem “Pamiętaj cholero, by nie dzielić przez zero!”.
 */
