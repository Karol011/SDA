package Obiektowe.BardziejZlozone.AlarmCzajnik;

import Obiektowe.BardziejZlozone.AlarmCzajnik.Interfejsy.IZamykalny;

/*
Zadanie 1:
Stwórz interfejs IOpenable. W interfejsie zaimplementuj metodę:
- czyOtwarty():boolean
Stwórz interfejs IOtwieralny. Interfejs powinien rozszerzać interfejs IOpenable. W interfejsie zaimplementuj metodę:
- otwórz():void
Stwórz interfejs IZamykalny. Interfejs powinien rozszerzać interfejs IOpenable. W interfejsie zaimplementuj metodę:
- zamknij():void
Stwórz interfejs IWłączalny. W interfejsie zaimplementuj metody:
- włącz():void
- czyWłączony():boolean
Stwórz interfejs IWyłączalny. W interfejsie zaimplementuj metody:
- wyłącz():void
- czyWłączony():boolean
Stwórz klasę:
Czajnik, Okno, Drzwi, Brama, Alarm, Samochód.
W których z tych klas warto zaimplementować który interfejs? Spróbuj zaimplementować klasy jak najpełniej.
Pamiętaj o paradygmacie abstrakcji. Stwórz main'a i w nim kilka obiektów. Co najmniej po jednym każdego typu.
 Dodaj obiekty IOpenable do tablicy. Przeiteruj je i wszystkie otwórz, a następnie zamknij.

 */
public class Main {
    public static void main(String[] args) {
        Czajnik czajnik = new Czajnik(false, false);
        Alarm alarmWOknie = new Alarm(false);
        Alarm alarmWDrzwiach = new Alarm(true);
        Alarm alarmSamochodowy = new Alarm(true);
        Brama brama = new Brama(true);
        Okno okno = new Okno(false, alarmWOknie);
        Drzwi drzwi = new Drzwi(true, alarmWDrzwiach);
        Samochod samochod = new Samochod(false, true, alarmSamochodowy);

        IZamykalny[] tablica = {czajnik, brama, okno, drzwi, samochod};
        for (int i = 0; i < tablica.length; i++) {
            tablica[i].otworz();
            System.out.println(tablica[i].toString());
            tablica[i].zamknij();
            System.out.println(tablica[i].toString());
        }

/*
        System.out.println(okno.toString());
        alarmWOknie.wlacz();
        System.out.println(okno.toString());

        System.out.println("******************");
        System.out.println(okno.czyOtwarty());
        okno.otworz();
        System.out.println(okno.czyOtwarty());
        System.out.println(czajnik.toString());
        *//*System.out.println(czajnik.czyWlaczony());
        czajnik.wlacz();
        System.out.println(czajnik.czyWlaczony());
        System.out.println();
        System.out.println(czajnik.czyOtwarty());
        czajnik.otworz();
        System.out.println(czajnik.czyOtwarty());
        czajnik.zamknij();
        System.out.println(czajnik.czyOtwarty());
        System.out.println();
        System.out.println(czajnik.czyWlaczony());
        czajnik.wylacz();
        System.out.println(czajnik.czyWlaczony());*/


    }

}
