package Obiektowe.BardziejZlozone.Zajezdnia;

public class Tramwaj extends Pojazd {
    int liczbaWagonow;

    public Tramwaj(int szybkoscMaksymalna, int numer, String nazwaZajezdni, int liczbaWagonow) {
        super(szybkoscMaksymalna, numer, nazwaZajezdni);
        this.liczbaWagonow = liczbaWagonow;
    }

    @Override
    public String toString() {
        return super.toString() +
                " liczba wagonow: " + getLiczbaWagonow();
    }

    public int getLiczbaWagonow() {
        return liczbaWagonow;
    }
}
