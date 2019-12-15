package Obiektowe.ZadaniaDomoweObiektyInterfejsy.zadanie1;

import Obiektowe.ZadaniaDomoweObiektyInterfejsy.zadanie1.Interfejsy.IZamykalny;

public class Drzwi implements IZamykalny {
    private boolean czyOtwarty;
    private Alarm alarm;

    Drzwi(boolean czyOtwarty, Alarm alarm) {
        this.czyOtwarty = czyOtwarty;
        this.alarm = alarm;
    }

    @Override
    public String toString() {
        return "Okno{" +
                "czyOtwarty=" + czyOtwarty +
                ", alarm=" + alarm.czyWlaczony() +
                '}';
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
}


