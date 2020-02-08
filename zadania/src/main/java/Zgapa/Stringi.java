package Zgapa;

import java.util.Arrays;

public class Stringi {
    public static void main(String[] args) {







    }

    static String usunSamogloski(String wyraz) {
        String  wyrazBezSamoglosek = wyraz.replaceAll("[aeiouy]", "");
        return wyrazBezSamoglosek;
    }                                                   //usuwanie samoglosek za pomoca regexu


    static void zamianaWyrazuZDuzejLitery(String... args) {

        System.out.println(Arrays.toString(args));
        char firstLetter;
        for (int i = 0; i < args.length; i++) {
            args[i] =args[i].substring(0,1).toUpperCase()+args[i].substring(1);
            System.out.println(args[i]);
        }

    }//pierwsze litery upperCasem

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



    public static void testyNaStringValueOf() {
        String liczba = "7";
        int piec = 5;
        System.out.println(String.valueOf(liczba)); //7
        System.out.println(String.valueOf(liczba) + 5); //75   (7 i 5)
        System.out.println(Integer.parseInt(liczba) + 5);//12  (7+5)
    }


    public static char[] podzielNapis(String wczytanyNapis) {
        char[] znakZTekstu = new char[10];

        for (int i = 0; i < wczytanyNapis.length(); i++) {
            znakZTekstu[i] = wczytanyNapis.charAt(i);
        }
        return znakZTekstu;
    }       //dzielenie Stringa




}
