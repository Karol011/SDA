package PetleTablice.Zadania_domowe_dotyczace_tablic_i_petli;

import java.util.Scanner;

/*

4. Używając metod dostępnych dla Stringów, których się nauczyłeś napisz program,
który:
• Pyta użytkownika o imię
• Sprawdza czy to prawdopodobie kobiece imię (kończące się na 'a')
• Wypisuje ile znaków ma imię i sprawdza czy imię zostało napisane
wielką literą
• Zaimplementuj własną metodę sprawdzającą zakończenie
imienia na dowolną literę bez użycia metody endsWith
• Uwaga! Można stosować method chaining tzn wywoływać metodę na
wyniku innej metody:
" js ".trim().toUpperCase().charAt(0); // zwróci "J"
 */
public class zadanie4 {
    public static void main(String[] args) {
        String name = askForName();
        checkIfFemale(name);
        showHowManyCharsAndIfUpperCase(name);
    }

    public static String askForName() {
        System.out.println("Jak masz na imie?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        return name;
    }

    public static void checkIfFemale(String name) {
        if (name.charAt(name.length()-1) == 'a') {
            System.out.println(name+" to prawdopodobnie kobiece imie, bo konczy sie na 'a'\n");
        }
    }//tablica ma sprawdzany kazdy znak (.charAt())  | name.lenght()-1 to ostatni znak w Stringu

    public static void showHowManyCharsAndIfUpperCase(String name) {
        char[] character = name.toCharArray();
        boolean isUpperCase = false;
        System.out.print("Imie ma " + name.length() + " liter");
        if (Character.isUpperCase(character[0])) {
            isUpperCase = true;
        }
        if (isUpperCase) {
            System.out.print(" i jest napisane z wielkiej litery\n");
        }
    }

}
