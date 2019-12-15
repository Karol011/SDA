package Obiektowe.MniejZlozone.samochod;

/*
Stwórz klasę Samochód.
Dodaj do klasy dwa pola:
String nazwa;
int predkosc;
stwórz trzy metody w klasie samochód:
wypiszInformacjeOSamochodzie():void - która wypisuje informacje o samochodzie (prędkość,
nazwę itd.)
przyspieszO5kmh():void - która ma zwiększać wartość prędkości samochodu o 5km/h
zwolnijO5kmh():void - która ma zmniejszać wartość prędkości samochodu o 5km/h
przetestuj napisane rozwiaznie
 */
public class Samochod {
    String nazwa;
    int predkosc;

    public Samochod(String nazwa, int predkosc) {
        this.nazwa = nazwa;
        this.predkosc = predkosc;
    }

    public void wypiszInformacjeOSamochodzie() {
        System.out.println(nazwa + " jedzie z predkoscia " + predkosc);
    }

    public void przyspiesz05kmh() {
        predkosc += 5;
    }

    public void zwolnij05kmh() {
        predkosc -= 5;
    }
}
