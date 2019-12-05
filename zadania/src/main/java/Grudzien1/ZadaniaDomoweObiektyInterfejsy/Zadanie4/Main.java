package Grudzien1.ZadaniaDomoweObiektyInterfejsy.Zadanie4;

import listopad30.Telefon.Telefon;

import java.util.Scanner;

/*
Zadanie 4:
Stwórz interfejs Figura, zaimplementuj w nim metody:
- obliczPole():double
- obliczObwód():double
- wypiszOpis():void (metoda wypisuje jakie sa parametry (dlugosci bokow) itp)
Stwórz klasę:
Koło, Wielokąt, Trójkąt, Prostokąt
Implementuj interfejs Figura, napisz wszystkie metody. Stwórz w klasie Main parser który
 obsługuje komendy użytkownika. Użytkownik może wpisać kształt jaki chciałby "pomierzyć", a następnie aplikacja pyta o wartości niezbędnych pól. Przykład działania.:
Jaki kształt?
kwadrat
Podaj długość boku A:
5.0
Co chciałbyś obliczyć? [pole, obwód, wypis]
pole
Wynik: 25.0
Jaki kształt?
koło
Podaj promień R:
5.0
Co chciałbyś obliczyć? [pole, obwód, wypis]
obwód
Wynik: 31.415926536
Jaki kształt?
quit
Kończę pracę
 */

public class Main {


    public static void main(String[] args) {


        start();

    }

    public static void start() {

        String dzialanie;


        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Co chcialbys obliczyc?\n" +
                    "[pole, obwod, info]");
            dzialanie = scanner.nextLine();
            switch (dzialanie) {
                case "kolo":
                    wybierzDzialanieKolo();
                    break;
                case "prostokat":
                    wybierzDzialanieProstokat();
                    break;
                case "trojkat":
                    wybierzDzialanieTrojkat();
                    break;
            }


        } while (!dzialanie.equals("quit"));
        System.out.println("koncze prace");
    }

    public static void wybierzDzialanieKolo() {
        Kolo kolo = new Kolo();
        Scanner scanner = new Scanner(System.in);
        String wyborDzialania;
        System.out.println("co chcesz zrobic?\n pole,obwod,info");

        wyborDzialania = scanner.nextLine();
        switch (wyborDzialania) {

            case "pole":
                System.out.println("podaj promien");
                kolo.setPromien(scanner.nextDouble());
                System.out.println(kolo.obliczPole());
                break;

            case "obwod":
                System.out.println("podaj promien");
                kolo.setPromien(scanner.nextDouble());
                System.out.println(kolo.obliczObwod());
                break;
            case "info":
                System.out.println(kolo.wypiszOpis());
                break;
        }

    }
    public static void wybierzDzialanieProstokat() {
        Wielokat prostokat = new Prostokat();
        Scanner scanner = new Scanner(System.in);

        String wyborDzialania;
        System.out.println("co chcesz zrobic?\n pole,obwod,info");

        wyborDzialania = scanner.nextLine();
        switch (wyborDzialania) {

            case "pole":
                System.out.println("podaj bok1");
                prostokat.setBok1(scanner.nextDouble());
                System.out.println("podaj bok2");
                prostokat.setBok2(scanner.nextDouble());
                System.out.println(prostokat.obliczPole());
                break;

            case "obwod":
                System.out.println("podaj bok1");
                prostokat.setBok1(scanner.nextDouble());
                System.out.println("podaj bok2");
                prostokat.setBok2(scanner.nextDouble());
                System.out.println(prostokat.obliczObwod());
                break;

            case "info":
                System.out.println(prostokat.wypiszOpis());
                break;
        }

    }
    public static void wybierzDzialanieTrojkat() {
        Trojkat trojkat = new Trojkat();
        Scanner scanner = new Scanner(System.in);

        String wyborDzialania;
        System.out.println("co chcesz zrobic?\n pole,obwod,info");

        wyborDzialania = scanner.nextLine();
        switch (wyborDzialania) {

            case "pole":
                System.out.println("podaj bok1");
                trojkat.setBok1(scanner.nextDouble());
                System.out.println("podaj wysokosc");
                trojkat.setWysokosc(scanner.nextDouble());
                System.out.println(trojkat.obliczPole());
                break;

            case "obwod":
                System.out.println("podaj bok1");
                trojkat.setBok1(scanner.nextDouble());
                System.out.println("podaj bok2");
                trojkat.setBok2(scanner.nextDouble());
                System.out.println("podaj bok3");
                trojkat.setBok3(scanner.nextDouble());
                System.out.println(trojkat.obliczObwod());
                break;

            case "info":
                System.out.println(trojkat.wypiszOpis());
                break;
        }

    }


}
