package sda.pl.javagda34;

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
    }

    public static void testyNaStringValueOf() {
        String liczba = "7";
        int piec = 5;
        System.out.println(String.valueOf(liczba)); //7
        System.out.println(String.valueOf(liczba)+5); //75   (7 i 5)
        System.out.println(Integer.parseInt(liczba)+5);//12  (7+5)
    }

    public static void formatNumber() {
        double doublleVar1 = 3.37637466;
        System.out.printf("%4.2f", doublleVar1); //4- szerokosc 4 miejsc jest rezerwowana, 2 - 2 miejsca poprzecinku beda wyswietlane
    }                   //formatowanie liczb
    public static int loadNumber() {
        System.out.println("Type the number");
        Scanner scan = new Scanner(System.in);
        int givenNumber = scan.nextInt();
        return givenNumber;
    }                       //wczytaj liczbe (Scanner)

    public static int[] loadNumbers() {
        Scanner scannerVar = new Scanner(System.in);
        int[] typedNumbers = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Podaj liczbe nr:" + (i + 1));
            int givenNumber = scannerVar.nextInt();
            for (int j : typedNumbers) {
                if (j == givenNumber) {
                    System.out.println("powtarza sie, wpisz ponownie inna liczbe");
                    i--;
                }
            }
            typedNumbers[i] = givenNumber;
        }
        return typedNumbers;
    }                       //wczytaj liczby i sprawdz czy sie nie powtarzaja
    public static int generatePassword() {
        // define the range
        int max = 9999;
        int min = 1000;
        int range = max - min + 1;
        int randomPassword;
        // generate random numbers within 1 to 10
        randomPassword = (int) (Math.random() * range) + min;
        return randomPassword;
    }                   //stworzenie randomowej liczby uzywajac math.random


    public static int findMinValue(int[] array) {
        int minNumber = array[0];
        for (int i = 1; i < array.length; i++)
            minNumber = Math.min(minNumber, array[i]);
        return minNumber;
    }           //wyszukiwanie min liczby w tablicy

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

    public static void displayPrimeNumbers(int[] array) {
        System.out.println("Prime numbers: ");
        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;                         //po kazdym przebiegu petli resetuj zmienna isPrime
            if (array[i] == 0 || array[i] == 1) {
                isPrime = false;                            //wykluczanie szczegolnego przypadku
            } else {
                for (int j = 2; j < array[i]; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    } //sprawdzanie czy dany element jest podzielny przez cos od 2 do tego elementu,
                    // jesli jest to isPrime = false i przerywa zagniezdzona petle, wracajac do petli z "i"
                }
                if (isPrime) {
                    System.out.print(array[i] + ",");
                }       //po wykluczniu szczegolnego przypadku i zagniezdzonej petli sprawdz czy dana liczba ma status isPrime = true
                //jesli tak, to ja wypisz
            }
        }
    }       //pokaz liczby pierwsze

    public static char[] podzielNapis(String wczytanyNapis) {
        char[] znakZTekstu = new char[10];

        for (int i = 0; i < wczytanyNapis.length(); i++) {
            znakZTekstu[i] = wczytanyNapis.charAt(i);
        }
        return znakZTekstu;
    }       //dzielenie Stringa

    public static Double[] sortowanie(Double[] array) {
        // Our arr contains 8 elements
        System.out.println();
        Arrays.sort(array);

        System.out.printf("Posorotowane: " +
                Arrays.toString(array));
        return array;
    }           //sortowanie el. tablicy

    static String usunSamogloski(String wyraz) {
        String  wyrazBezSamoglosek = wyraz.replaceAll("[aeiouy]", "");
        return wyrazBezSamoglosek;
    }                                                   //usuwanie samoglosek za pomoca regexu


    public static void divideText(String text) {
        String splittedText[] = text.split("", 0);
        for (int i = splittedText.length-1; i >= 0; i--) {
            System.out.print(splittedText[i]);
        }
    }                   //dzielenie stringa na pojedyncze znaki

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
    }   //sumowanie liter,cyfr,spacji i znakow specjalnych w stringu


}
