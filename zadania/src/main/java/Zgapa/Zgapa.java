package Zgapa;

import java.util.Arrays;
import java.util.Scanner;

/* skroty
CTR + ALT + L = wyrownywanie kodu
CTR + D = kopiowanie linii i wklejejnie jej nizej
sout =
zmienna +=5  to zmienna = zmienna +5
ctrl + shift + / zakomentowuje zaznaczony obszar
alt + insert w nmowej klasie dodaje constructor/settery/gettery

 */
public class Zgapa {

    public static void main(String[] args) {
String liczba = "7";
int piec = 5;
        System.out.println(String.valueOf(liczba));
        System.out.println(String.valueOf(liczba)+5);
        System.out.println(Integer.parseInt(liczba)+5);
        System.out.printf("%.2f", 12.45745); //formatowanie doubla
        System.out.printf("%,d", 123435346); //formatowanie duzego inta
    }



    public static void funkcjaSwitch() {
    int liczba = 5;
        switch (liczba) {
            case 3:
                System.out.println("wpisales 3");
                break;
            case 5:
                System.out.println("wpisales 5");
                break;
            case 8:
                System.out.println("wpisales 8");
                break;
            default:
                System.out.println("liczba jest mniejsza niz 10 ");
        }
    }
    //        char choice = scanner.next().charAt(0);           char jako opcja wyboru




    public static Double[] sortowanie(Double[] array) {
        // Our arr contains 8 elements
        System.out.println();
        Arrays.sort(array);

        System.out.printf("Posorotowane: " +
                Arrays.toString(array));
        return array;
    }           //sortowanie el. tablicy


}
