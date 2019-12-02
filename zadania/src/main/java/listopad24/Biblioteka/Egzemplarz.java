package listopad24.Biblioteka;

public abstract class Egzemplarz {
    protected String tytul;
    protected int numerEgzemplarza;
    protected String imie;
    protected Czlowiek[] autorzy;

    public Egzemplarz(String tytul, int numerEgzemplarza, String imie, Czlowiek[] autorzy) {
        this.tytul = tytul;
        this.numerEgzemplarza = numerEgzemplarza;
        this.imie = imie;
        this.autorzy = autorzy;
    }
}
