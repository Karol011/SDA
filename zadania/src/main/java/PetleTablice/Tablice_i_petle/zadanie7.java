package PetleTablice.Tablice_i_petle;

import java.util.Scanner;

/*
7. Napisz program zliczający wystąpienia liter, spacji, liczb i innych znaków z zmiennej typu String wprowadzonej przez użytkownika. Wynik wyświetl w następującej postaci:
a. Podany tekst : „{Tekst}” zawiera: X liter Y spacji Z liczb P innych znaków
b. Gdzie X,Y,Z,P to liczby całkowite reprezentujące wystąpienia znaków w tekście
 */
public class zadanie7 {
    public static void main(String[] args) {
        divideTextAndDisplayResults(loadText());
    }

    private static String loadText() {
        System.out.println("Type the text");
        Scanner scan = new Scanner(System.in);
        String givenText = scan.nextLine();
        return givenText;
    }

    public static void divideTextAndDisplayResults(String text) {
        String splittedText[] = text.split("", 0); //dzieli danego stringa na tablice pojedynczych stringow
        char character;
        int letterCounter = 0;
        int spaceCounter = 0;
        int numberCount = 0;
        int otherSymbols = 0;

        for (int i = splittedText.length - 1; i >= 0; i--) {        //iteruj po tablicy pojedynczych stringow
            if (Character.isLetter(splittedText[i].charAt(0))) {    //Character.isLetter sprawdza czy char jest litera a
                // .charAt(0) zamienia pojedynczewgo stringa na chara
                letterCounter++;
            }
            if (splittedText[i].charAt(0) == ' ') {
                spaceCounter++;
            }
            if (splittedText[i].matches("[0-9]")) {
                numberCount++;
            }
        }
        otherSymbols = splittedText.length - letterCounter - spaceCounter - numberCount;
        System.out.println("litery: " + letterCounter + " \nspacje " + spaceCounter + " \ncyfry: " + numberCount + " \ndfdfinne symbole: "+otherSymbols);
    }


}
