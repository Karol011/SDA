package Grudzien1.ZadaniaDomoweObiektyInterfejsy.zadanie1;

import Grudzien1.ZadaniaDomoweObiektyInterfejsy.zadanie1.Interfejsy.IOtwieralny;
import Grudzien1.ZadaniaDomoweObiektyInterfejsy.zadanie1.Interfejsy.IWlaczalny;
import Grudzien1.ZadaniaDomoweObiektyInterfejsy.zadanie1.Interfejsy.IWylaczalny;
import Grudzien1.ZadaniaDomoweObiektyInterfejsy.zadanie1.Interfejsy.IZamykalny;

public class Czajnik implements  IZamykalny, IWylaczalny {
   private boolean czyWlaczony;
   private boolean czyOtwarty;

     Czajnik(boolean czyWlaczony, boolean czyOtwarty) {
        this.czyWlaczony = czyWlaczony;
        this.czyOtwarty = czyOtwarty;
    }

    @Override
    public String toString() {
        return "Czajnik{" +
                "czyWlaczony=" + czyWlaczony +
                ", czyOtwarty=" + czyOtwarty +
                '}';
    }

    @Override
    public boolean czyOtwarty() {
        return czyOtwarty;
    }

    @Override
    public void wlacz() {
        this.czyWlaczony = true;
    }

    @Override
    public void wylacz() {
        this.czyWlaczony = false;
    }

    @Override
    public boolean czyWlaczony() {
        return czyWlaczony;
    }


    @Override
    public void otworz() {
        this.czyOtwarty = true;
    }

    @Override
    public void zamknij() {
        this.czyOtwarty = false;

    }
}
