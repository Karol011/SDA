package listopad24.Zamowienia;

public class Pozycja {
    String nazwaTowaru;
    int iloscSztuk;
    double cenaSztuki;

    public Pozycja(String nazwaTowaru, int iloscSztuk, double cenaSztuki) {
        this.nazwaTowaru = nazwaTowaru;
        this.iloscSztuk = iloscSztuk;
        this.cenaSztuki = cenaSztuki;
    }

    public double obliczWartosc() {
        return iloscSztuk * cenaSztuki;
    }
    @Override
    public String toString() {
        return
                this.nazwaTowaru + "  " +
                        this.cenaSztuki + "zł " +
                        this.iloscSztuk + "szt.  " +
                        obliczWartosc() + "zł "
                        + "\n";
    }

}
