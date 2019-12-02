package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.zadaniaKlasyIMetody.DrukowanieLosowejLiczby;

import java.util.Random;
import java.util.Scanner;

/*
3. Utworzenie klasy drukującej losową liczbę w zadanym przez użytkownika zakresie
    a. Użytkownik deklaruje maksymalną liczbę (losowanie odbywa się od liczby zera do liczby maksymalnej zdefiniowanej przez użytkownika) np.
        i. Użytkownik wpisuje ‘10’ -> liczba losowa przyjmuje wartość od 0 do 10
    b. Użytkownik deklaruje minimalną liczbę oraz maksymalną :
        i. Dla liczby ‘1’ i ‘100’ -> liczba losowa przyjmuje wartość od 1 do 100
    c. Użytkownik może podawać liczby ujemne:
        i. Dla liczb: ‘-100’ i ‘5’ -> liczba losowa przyjmuje wartość od -100 do 5
 */
public class RandomNumberGenerator {

    public int generateRandomFrom0ToX() {
        System.out.println("Give the max number");
        Scanner scanner = new Scanner(System.in);
        int maxNumber = scanner.nextInt();
        int min = 0;
        Random random = new Random();
        int numberGenerated = random.nextInt((maxNumber - 0) + 1);
        return numberGenerated;
    }

    public int generateRandomFromMinToMax() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the min number");
        int minNumber = scanner.nextInt();
        System.out.println("Give the max number");
        int maxNumber = scanner.nextInt();
        Random random = new Random();
        int numberGenerated = random.nextInt((maxNumber - minNumber) + 1) + minNumber;
        return numberGenerated;
    }


}
