package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Tablice_i_petle;

import java.util.Random;
import java.util.Scanner;

/*
14. Napisz program symulujący pracę dystrybutora paliwa, gdzie użytkownik otrzymuje informację o ilości wlanego paliwa
 oraz o cenie jaką musi zapłacić. Aplikacja pyta użytkownika czy chce kontynuować napełnianie baku
    a. ‘t’ oznacza kontynuację
    b. ‘n’ oznacza zakończenie tankowania
Po zakończeniu procesu tankowania wyświetlone zostaje sprawozdanie zawierające ilość przelanego paliwa oraz cenę za paliwo liczoną w złotówkach.
Wykorzystaj double do przechowania ceny paliwa.
Dodatkowo użyj random, aby przy kolejnej iteracji dolać do zbiornika losową ilość paliwa, która wygeneruje odpowiedni dodatek do rachunku.
 */
public class zadanie14 {
    public static double currentFuel = 0.0;

    public static void main(String[] args) {
        double priceForFuel = 4.92;
        startRefueling(priceForFuel);
    }

    public static void startRefueling(double priceForFuel) {
        char chooseToContinueOrQuit;
        System.out.println("Refuel - 't\n" +
                "Stop - 'n");
        Scanner scanner = new Scanner(System.in);
        char choice = scanner.next().charAt(0);
        while (choice != 'n') {
            System.out.println("more fuel ");
            //addFuel();
            showFuelAndPrice(currentFuel + addFuel(), priceForFuel);
            System.out.println("What are you wish to do? ");
            System.out.println("Refuel - 't\n" +
                    "Stop - 'n");
            choice = scanner.next().charAt(0);

        }
        System.out.println("No more refuelling");
        showFuelAndPrice(currentFuel + addFuel(), priceForFuel);

    }

    public static double addFuel() {
        Random random = new Random();
        double addedFuel = random.nextDouble()+5;
        currentFuel += addedFuel;
        return currentFuel;
    }

    public static void showFuelAndPrice(double currentFuel, double priceForFuel) {
        double howMuchToPay = currentFuel * priceForFuel;
        // System.out.format("%.2d%",fuel);
        System.out.printf("You have " + "%8.2f", currentFuel);
        System.out.println("l of fuel\n" + " and price to pay is: ");
        System.out.printf("%4.2f", howMuchToPay);
        System.out.println(" zl\n");
    }
}

