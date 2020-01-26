package WzorceProjektowe.Factory;

public abstract class PojazdSpalinowy {
    private String numerRejestracyjny;
    private String kolor;
    private String vin;

    public PojazdSpalinowy(String numerRejestracyjny, String kolor, String vin) {
        this.numerRejestracyjny = numerRejestracyjny;
        this.kolor = kolor;
        this.vin = vin;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public String getKolor() {
        return kolor;
    }

    public String getVin() {
        return vin;
    }

    public abstract void jedz();
}
