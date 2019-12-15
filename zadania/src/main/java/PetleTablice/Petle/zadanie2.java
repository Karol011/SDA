package PetleTablice.Petle;
/*
 Napisz aplikację która przyjmuje parametr (ilość powtórzeń) ze scannera, a
  następnie zadaną ilość razy wypisuje na ekran “Hello World” - pętlą for i while
 */
import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        int wybor;
        System.out.println("Program pobiera liczbe powtorzen od uzytkownika i wypisuje 'Hello World!' adekwatna ilosc razy");
        System.out.println("Wybierz metode: \n1 - Petla for\n2 - Petla while");
        Scanner wyborScanner = new Scanner(System.in);
        wybor = wyborScanner.nextInt();
        switch (wybor) {
            case 1:
                System.out.println("Wybrales petle for");
                System.out.println("Podaj liczbe powtorzen: ");
                Scanner iloscWypisan = new Scanner(System.in);
                int ilosc;
                ilosc = iloscWypisan.nextInt();
                System.out.println("teraz wypisze Hello World! " + ilosc + " razy");
                for (int i = 1; i <= ilosc; i++) {
                    System.out.println(i + ". Hello World!");
                }
                break;
            case 2:
                System.out.println("Wybrales petle while");
                System.out.println("Podaj liczbe powtorzen");
                Scanner iloscWypisan1 = new Scanner(System.in);
                int ilosc1 = iloscWypisan1.nextInt();
                System.out.println("Teraz wypiszę Hello World " + ilosc1 + " razy");

                int i = 1;
                while (i <= ilosc1) {
                    System.out.println(i + ".Hello World!");
                    i++;
                }
                break;
        }
    }
}
