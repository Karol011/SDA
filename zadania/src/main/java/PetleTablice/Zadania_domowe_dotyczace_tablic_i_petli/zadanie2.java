package PetleTablice.Zadania_domowe_dotyczace_tablic_i_petli;

import java.util.Scanner;

/*
Zadanie 2

	  stworz metode rysujaca wiezowiec o zadanej liczbie pieter, liczba pieter nie
	  moze byc wyzsza niz 10 ani mniejsza niz 2 liczba pieter powinna zostac podana
	  przez uzytkownika (Scanner + System.in)

	  przykladowy rysunek dla 2 pieter
	   _____________
	 	|  _   _  |
	  	| |_| |_| |
	  	|  _   _  |
	  	| |_| |_| |
	    |         |
	   ^^^^^^^^^^^^^
 */
public class zadanie2 {
    public static void main(String[] args) {
        drawTower(loadNumberOfFloors());
    }

    private static int loadNumberOfFloors() {
        System.out.println("Type the number of floors (between 2 and 10)");
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();
        while (10 < givenNumber || givenNumber < 2) {
            System.out.println("Number of floors is out of bound, try again...");
            givenNumber = scan.nextInt();
        }
        return givenNumber;
    }

    public static void drawTower(int numberOfFloors) {
        for (int i = 0; i < 13; i++) {
            System.out.print("_");
        }//dach
        System.out.println();
        for (int i = 0; i < numberOfFloors; i++) {
            System.out.print(" |  _   _  |\n");
            System.out.print(" | |_| |_| |\n");
        }//pietra
        for (int i = 0; i < 13; i++) {
            System.out.print("^");
        }//podloga
    }
}
