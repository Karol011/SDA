package WzorceProjektowe.Factory;

public class WytworniaPojazdowSpalinowych {

    public static PojazdSpalinowy wyprodukujPojazd(String marka, String kolor) {
        if (marka.equals("Yamacha")) {
            return new Motocykl("GDA15283", kolor, "345678987654345", true, false);
        } else if (marka.equals("Ford") || marka.equals("Fiat")) {
            return new Samochod("GDA18263", kolor, "45678987654345", "Sedan", TypSkrzyniBiegow.AUTOMAT);
        }
        return null;
    }
}
