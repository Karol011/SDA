package Obiektowe.listopad24.Zajezdnia;

import java.util.Arrays;

public class Zajezdnia {
    String nazwaZajezdni;
    Pojazd[] pojazdy;

    public Zajezdnia(String nazwaZajezdni, Pojazd[] pojazdy) {
        this.nazwaZajezdni = nazwaZajezdni;
        this.pojazdy = pojazdy;
    }

    public String toString() {
        return "Zajezdnia{ " + getNazwaZajezdni() +
                " pojazdy " + Arrays.toString(getPojazdy()) + "}";
    }

    public String getNazwaZajezdni() {
        return nazwaZajezdni;
    }

    public Pojazd[] getPojazdy() {
        return pojazdy;
    }
}
