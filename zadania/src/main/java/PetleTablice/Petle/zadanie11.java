package PetleTablice.Petle;

import java.util.Scanner;

/*11. Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki.
Przykładowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.

 */
public class zadanie11 {
    public static void main(String[] args) {
        int givenNumber;
        System.out.println("Podaj liczbe, dla ktorej zostana znalezione dzielniki: ");
        Scanner scan = new Scanner(System.in);
        givenNumber = scan.nextInt();
        for (int i = 1; i <= givenNumber; i++) {
            if (givenNumber % i == 0) {
                System.out.println("dzielnik to: "+i);
            }
        }

    }
}
