package Inne.Wyjatki;
import java.util.Scanner;

public class Odczyt{
    public static void main(String[] args){
        int[] tab = {1,2,3,4,5};
        Scanner odczyt = new Scanner(System.in);
        int index;

        System.out.println("Podaj indeks tablicy, który chcesz zobaczyć: ");
        index = odczyt.nextInt();

        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
        }

    }
}
