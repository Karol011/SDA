package Obiektowe.BardziejZlozone.Zajezdnia;

public class Autobus extends Pojazd {
    int zuzytePaliwo;

    public Autobus(int szybkoscMaksymalna, int numer, String nazwaZajezdni, int zuzytePaliwo) {
        super(szybkoscMaksymalna, numer, nazwaZajezdni);
        this.zuzytePaliwo = zuzytePaliwo;
    }

    @Override
    public String toString() {
        return super.toString() +
                " zuzyte paliwo: " + getZuzytePaliwo();

    }

    public int getZuzytePaliwo() {
        return zuzytePaliwo;
    }
}
