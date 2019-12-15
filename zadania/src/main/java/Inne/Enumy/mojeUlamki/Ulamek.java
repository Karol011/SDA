package Inne.Enumy.mojeUlamki;

public class Ulamek {
    private int licznik;
    private int mianownik;

    public Ulamek(int licznik, int mianownik) {
        this.licznik = licznik;
        this.mianownik = mianownik;
    }

    public void wyswietlUlamek() {
        System.out.println(getLicznik() + "/" + getMianownik());
    }

    public void dodaj(Ulamek drugiUlamek) {
        int nowyLicznik = getLicznik() * drugiUlamek.getMianownik() + getMianownik() * drugiUlamek.getLicznik();
        int nowyMianownik = getMianownik()*drugiUlamek.getMianownik();
    }


    private int getLicznik() {
        return licznik;
    }

    private void setLicznik(int licznik) {
        this.licznik = licznik;
    }

    private int getMianownik() {
        return mianownik;
    }

    private void setMianownik(int mianownik) {
        this.mianownik = mianownik;
    }
}
