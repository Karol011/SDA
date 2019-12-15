package sda.pl.javagda34.pazdziernik26.Wyscig;

import java.util.Random;

public class Zawodnik {
    String imie;
    int identyfikator;
    int predkoscMinimalna;
    int predkoscMaksymalna;
    int pokonanaOdleglosc;

    public Zawodnik(String imie, int identyfikator, int predkoscMinimalna, int predkoscMaksymalna, int pokonanaOdleglosc) {
        this.imie = imie;
        this.identyfikator = identyfikator;
        this.predkoscMinimalna = predkoscMinimalna;
        this.predkoscMaksymalna = predkoscMaksymalna;
        this.pokonanaOdleglosc = pokonanaOdleglosc;
    }

    public void przedstawSie() {
        System.out.println(imie + " to zawodnik nr: " + identyfikator + " o predkosci od "
                + predkoscMinimalna + " do " + predkoscMaksymalna + " przebiegl juz " + pokonanaOdleglosc);

    }
    public void biegnij() {
        Random random = new Random();
        int przebiegnietyOdcinek = random.nextInt(predkoscMaksymalna - predkoscMinimalna)+1;
        pokonanaOdleglosc += przebiegnietyOdcinek;
    }
    //public void zawody(int przebiegnietyDystans) {

  //  }

}
