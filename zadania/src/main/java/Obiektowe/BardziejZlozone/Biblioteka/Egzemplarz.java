package Obiektowe.BardziejZlozone.Biblioteka;

import java.util.Arrays;

public abstract class Egzemplarz {
    private String tytul;
    protected int numerEgzemplarza;
    protected String imie;
    protected Czlowiek[] autorzy;

    public Egzemplarz(String tytul, int numerEgzemplarza, String imie, Czlowiek[] autorzy) {
        this.tytul = tytul;
        this.numerEgzemplarza = numerEgzemplarza;
        this.imie = imie;
        this.autorzy = autorzy;
    }

    public String getTytul() {
        return tytul;
    }

    public int getNumerEgzemplarza() {
        return numerEgzemplarza;
    }

    public String getImie() {
        return imie;
    }

    @Override
    public String toString() {
        return "Egzemplarz{" +
                "tytul='" + tytul + '\'' +
                ", numerEgzemplarza=" + numerEgzemplarza +
                '}';
    }

    public Czlowiek[] getAutorzy() {
        return autorzy;
    }
}
