package WzorceProjektowe.Factory;

public class Motocykl extends PojazdSpalinowy {
    private boolean czyMaBagaznik;
    private boolean czyMaOwiewki;

    public Motocykl(String numerRejestracyjny, String kolor, String vin, boolean czyMaBagaznik, boolean czyMaOwiewki) {
        super(numerRejestracyjny, kolor, vin);
        this.czyMaBagaznik = czyMaBagaznik;
        this.czyMaOwiewki = czyMaOwiewki;
    }

    public boolean isCzyMaBagaznik() {
        return czyMaBagaznik;
    }

    public boolean isCzyMaOwiewki() {
        return czyMaOwiewki;
    }

    @Override
    public void jedz() {
        System.out.println("Ziuuuum");
    }
}
