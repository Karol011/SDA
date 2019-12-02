package sda.pl.javagda34.listopad23.GuessPassword;

import java.util.Random;
import java.util.Scanner;

/*
1.Zgadnij hasło –utwórz program obiektowy, który pozwala użytkownikowi zagrać w grę na poniższych zasadach:
a.Program losuje numer w zakresie od 1 do 100
b.Program pyta się użytkownika o numer
c.Jeśli użytkownik zgadnie numer –wypisuje ‘Gratulacje, wygrałeś!’
d.Jeśli nie –wypisuje użytkownikowi czy numer jest większy lub mniejszy od podanej przez użytkownika liczby
e.* Użytkownik sam określa zakres
f.* Po 5 nieudanych próbach program wypisuje ‘Niestety, przegrałeś’
 */
public class Password {
    private int number;
    private int numberTypedByUser;
    private int numberOfLives = 5;
    private boolean isGameWon;

    public Password(int number, int numberTypedByUser, int numberOfLives, boolean isGameWon) {
        this.number = generateNumber();
        this.numberTypedByUser = typeTheNumber();
        this.numberOfLives = getNumberOfLives();
        this.isGameWon = getIsGameWon();

    }

    private int generateNumber() {
        Random random = new Random();
        int generatedNumber = random.nextInt(100) + 1;
        return generatedNumber;
    }

    private int typeTheNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number from 1 to 100");
        int guessedNumber = scanner.nextInt();
        return guessedNumber;
    }

    private void checkIfLowerHigherOREqual() {
        if (true) {
        }
    }

    private int getNumberOfLives() {
        return numberOfLives;
    }

    private void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }

    private boolean getIsGameWon() {
        return isGameWon;
    }

    private void setIsGameWon(boolean isGameWon) {
        this.isGameWon = isGameWon;
    }
}
