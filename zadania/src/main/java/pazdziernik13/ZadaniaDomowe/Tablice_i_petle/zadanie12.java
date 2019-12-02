package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Tablice_i_petle;

import java.util.Scanner;

/*
12. Napisz program, który przyjmuje od użytkownika liczbę w zakresie od 1 do 20.
 A następnie rysuje trójkąt z liczb :
1
12
123
1234
…
 */
public class zadanie12 {
    public static void main(String[] args) {
        drawTriangle(askForNumber());
    }

    public static int askForNumber() {
        System.out.println("podaj liczbe od 1 do 20 ");
        int number = 1;
        do {
            Scanner scan = new Scanner(System.in);
            number = scan.nextInt();
        } while (number > 20 || number < 1);
        return number;
    }

    public static void drawTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
