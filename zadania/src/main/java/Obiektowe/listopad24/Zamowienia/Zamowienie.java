package Obiektowe.listopad24.Zamowienia;

import java.util.Arrays;

public class Zamowienie {
    Pozycja[] pozycje;
    int maxRozmiar;

    public Zamowienie(int maxRozmiar) {
        this.maxRozmiar = maxRozmiar;
        pozycje = new Pozycja[maxRozmiar];
    }

    public Zamowienie() {
        maxRozmiar = 10;
    }

    public double obliczWartosc() {
        double wartoscZamowienia = 0.0;
        for (int i = 0; i < pozycje.length; i++) {
            wartoscZamowienia += pozycje[i].obliczWartosc();
        }
        return wartoscZamowienia;
    }

    public void dodajPozycje(Pozycja pozycja) {
        for (int i = 0; i < pozycje.length; i++) {
            if (pozycje[i] == null) {
                pozycje[i] = pozycja;
                break;
            }

        }
    }
    @Override
    public String toString() {
        return "Zamowienie:" + " " +
                Arrays.toString(pozycje) +
                "Razem: " + obliczWartosc() + "zł";
    }

}
