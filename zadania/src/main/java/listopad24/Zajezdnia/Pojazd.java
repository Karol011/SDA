package listopad24.Zajezdnia;

public class Pojazd {
    protected int szybkoscMaksymalna;
    protected int numer;
    protected String nazwaZajezdni;

    public Pojazd(int szybkoscMaksymalna, int numer, String nazwaZajezdni) {
        this.szybkoscMaksymalna = szybkoscMaksymalna;
        this.numer = numer;
        this.nazwaZajezdni = nazwaZajezdni;
    }

    @Override
    public String toString() {
        return "Pojazd{" +
                " predkosc max: " + getSzybkoscMaksymalna() +
                " numer: " + getNumer() +
                " zajezdnia: " + getNazwaZajezdni() + "}";
    }

    public int getSzybkoscMaksymalna() {
        return szybkoscMaksymalna;
    }

    public void setSzybkoscMaksymalna(int szybkoscMaksymalna) {
        this.szybkoscMaksymalna = szybkoscMaksymalna;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    public String getNazwaZajezdni() {
        return nazwaZajezdni;
    }

    public void setNazwaZajezdni(String nazwaZajezdni) {
        this.nazwaZajezdni = nazwaZajezdni;
    }
}
