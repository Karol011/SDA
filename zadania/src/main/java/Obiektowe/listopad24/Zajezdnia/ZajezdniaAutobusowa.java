package Obiektowe.listopad24.Zajezdnia;

public class ZajezdniaAutobusowa extends Zajezdnia {
    Autobus[] autobus;

    public ZajezdniaAutobusowa(String nazwaZajezdni, Pojazd[] pojazdy) {
        super(nazwaZajezdni, pojazdy);
    }

    public int sumaryczneZuzyciePaliwa() {
        int suma = 0;
        for (int i = 0; i < autobus.length; i++) {
            suma += autobus[i].getZuzytePaliwo();
        }
        return suma;
    }

    @Override
    public String toString() {
        return super.toString() +
                "sumaryczne zuzycie paliwa: " + sumaryczneZuzyciePaliwa();

    }
}
