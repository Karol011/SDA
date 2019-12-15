package Obiektowe.ZadaniaDomoweObiektyInterfejsy.zadanie1;

import Obiektowe.ZadaniaDomoweObiektyInterfejsy.zadanie1.Interfejsy.IWylaczalny;
import Obiektowe.ZadaniaDomoweObiektyInterfejsy.zadanie1.Interfejsy.IZamykalny;

public class Samochod implements IZamykalny, IWylaczalny {
    private boolean czyWlaczony;
    private boolean czyOtwarty;
    private Alarm alarm;

     Samochod(boolean czyWlaczony, boolean czyOtwarty, Alarm alarm) {
        this.czyWlaczony = czyWlaczony;
        this.czyOtwarty = czyOtwarty;
        this.alarm = alarm;
    }

    @Override
    public void zamknij() {
        this.czyOtwarty = false;
    }

    @Override
    public void otworz() {
        this.czyOtwarty = true;
    }

    @Override
    public boolean czyOtwarty() {
        return czyOtwarty;
    }

    @Override
    public void wylacz() {
        this.czyWlaczony = false;
    }

    @Override
    public void wlacz() {
        this.czyWlaczony = true;
    }

    @Override
    public boolean czyWlaczony() {
        return czyWlaczony;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "czyWlaczony=" + czyWlaczony +
                ", czyOtwarty=" + czyOtwarty +
                ", alarm=" + alarm.czyWlaczony() +
                '}';
    }
}
