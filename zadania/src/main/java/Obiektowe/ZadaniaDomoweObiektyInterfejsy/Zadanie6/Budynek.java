package Obiektowe.ZadaniaDomoweObiektyInterfejsy.Zadanie6;

import lombok.Data;

@Data

public class Budynek {
    String nazwaOsiedla;
    String adres;
    int iloscOfert;
    int etapBudowy;
    int planowanyRokZakonczeniaBudowy;
    int planowanyKwartalZakonczeniaBudowy;
    double dystansDoCentrum;
    int etapOsiedla;
    Mieszkanie[] ofertyMieszkan = new Mieszkanie[5];

    protected Budynek(String nazwaOsiedla, String adres, int iloscOfert, int etapBudowy, int planowanyRokZakonczeniaBudowy,
                   int planowanyKwartalZakonczeniaBudowy, double dystansDoCentrum, int etapOsiedla, Mieszkanie[] ofertyMieszkan) {
        this.nazwaOsiedla = nazwaOsiedla;
        this.adres = adres;
        this.iloscOfert = iloscOfert;
        this.etapBudowy = etapBudowy;
        this.planowanyRokZakonczeniaBudowy = planowanyRokZakonczeniaBudowy;
        this.planowanyKwartalZakonczeniaBudowy = planowanyKwartalZakonczeniaBudowy;
        this.dystansDoCentrum = dystansDoCentrum;
        this.etapOsiedla = etapOsiedla;
        this.ofertyMieszkan = ofertyMieszkan;
    }

    double lacznaWartoscBudynkuNetto() {
        double lacznaWartosc = 0;
        for (int i = 0; i < ofertyMieszkan.length; i++) {
            lacznaWartosc += ofertyMieszkan[i].obliczCeneNetto();
        }
        return lacznaWartosc;
    }

    double podajLacznaWartoscBudynkuBrutto() {
        return lacznaWartoscBudynkuNetto() * 1.23;
    }

    void wypiszOferte() {
        System.out.println("Budynek{" +
                "nazwaOsiedla='" + getNazwaOsiedla() + '\'' +
                ", adres='" + getAdres() + '\'' +
                ", iloscOfert=" + getIloscOfert() +
                ", etapBudowy=" + getEtapBudowy() +
                ", planowanyRokZakonczeniaBudowy=" + getPlanowanyRokZakonczeniaBudowy() +
                ", planowanyKwartalZakonczeniaBudowy=" + getPlanowanyKwartalZakonczeniaBudowy() +
                ", dystansDoCentrum=" + getDystansDoCentrum() +
                ", etapOsiedla=" + getEtapOsiedla() +
                '}');
    }
}

