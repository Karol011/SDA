package sda.pl.javagda34.listopad23.Ulamki;

public class Ulamek {
    private int licznik;
    private int mianownik;

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public int getLicznik() {
        return licznik;
    }

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }

    public int getMianownik() {
        return mianownik;
    }

    public void setMianownik(int mianownik) {
        this.mianownik = mianownik;
    }

    public void wyswietlUlamek() {
        System.out.println(getLicznik() + "/" + getMianownik());
    }

    public void dodaj(Ulamek ulamek2) {
        Ulamek[] tablicaSprowadzonych = sprowadzdoWspolnegoMianownika(this, ulamek2);
        this.licznik = tablicaSprowadzonych[0].licznik + tablicaSprowadzonych[1].licznik;
        this.mianownik = tablicaSprowadzonych[0].mianownik;
    }

    private Ulamek[] sprowadzdoWspolnegoMianownika(Ulamek ulamek1, Ulamek ulamek2) {
        Ulamek[] wyniki = new Ulamek[2];

        int nowyLicznikPierwszego = ulamek1.licznik * ulamek2.mianownik;
        int nowyMianownikPierwszego = ulamek1.mianownik * ulamek2.mianownik;
        Ulamek sprowadzonyPierwszy = new Ulamek(nowyLicznikPierwszego,nowyMianownikPierwszego);
        wyniki[0] = sprowadzonyPierwszy;

        int nowyLicznikDrugiego = ulamek1.licznik * ulamek2.mianownik;
        int nowyMianownikDrugiego = ulamek1.mianownik * ulamek2.mianownik;
        Ulamek sprowadzonyDrugi = new Ulamek(nowyLicznikPierwszego,nowyMianownikDrugiego);
        wyniki[1] = sprowadzonyDrugi;
        return wyniki;
    }


}
