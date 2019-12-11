package Grudzien1.ZadaniaDomoweObiektyInterfejsy.Zadanie6;

import lombok.Data;

@Data
public class Mieszkanie {
    double powierzchnia;
    double cenaZaMetrNetto;
    int iloscPokoi;
    int iloscLazienek;
    double[] powierzchniaPomieszczen;
    SunGeograficalLocation orientation;

    public Mieszkanie(double powierzchnia, double cenaZaMetrNetto, int iloscPokoi, int iloscLazienek, double[] powierzchniaPomieszczen,
                      SunGeograficalLocation orientation) {
        this.powierzchnia = powierzchnia;
        this.cenaZaMetrNetto = cenaZaMetrNetto;
        this.iloscPokoi = iloscPokoi;
        this.iloscLazienek = iloscLazienek;
        this.powierzchniaPomieszczen = powierzchniaPomieszczen;
        this.orientation = orientation;
    }

    double obliczCeneNetto() {
        return getPowierzchnia()*getCenaZaMetrNetto();
    }

    double obliczCeneBrutto() {
        return getPowierzchnia()*getCenaZaMetrNetto() * 1.23;
    }

    double obliczCeneZaMetrBrutto() {
        return getCenaZaMetrNetto()*1.23;
    }


}

