package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.zadaniaKlasyIMetody.Wisielec;

import java.util.Scanner;

/*
5. Napisz program ‘wisielec’ – użytkownik ma 5 żyć, użytkownik może podać jedynie 1 literę – gdy poda więcej przegrywa grę.
Jeśli poda literę spoza hasła, traci jedno życie, gdy zostanie bez żyć <0 przegrywa grę.
a. Użytkownik sam wpisuje hasło dla przeciwnika
b. * Hasło jest losowane z słownika czyli tablicy haseł
c. ** Po zakończeniu gry – zapytanie do użytkownika czy chce kontynuować dalej grę (t/n)
 */
public class Wisielec {
    public static int numberOfLives = 5;

    public static void main(String[] args) {
    }

    public static String loadPassword() {
        System.out.println("Type the password");
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        return password;
    }

    public static void displayPassword(String password) {
        password.toCharArray();

    }

    public static String guessTheLetter() {
        System.out.println("Guess 1 letter");
        Scanner scan = new Scanner(System.in);
        String guessedLetter = scan.nextLine();
        if (guessedLetter.length() > 1) {
            theEndLosing();
        }
        return guessedLetter;
    }

    public static void checkIfLetterIsCorrect(String guessedLetter, String password) {
        char[] lettersOfPassword = password.toCharArray();
        for (int i = 0; i < password.length(); i++) {
            if (Character.toString(lettersOfPassword[i]).equals(guessedLetter)) {
                System.out.println("its a hit!");

            } else {
                System.out.println("miss");
                numberOfLives--;

            }
        }
    }

    public static void theEndLosing() {
        System.out.println("THE END. YOU HAVE LOST");
    }

}
