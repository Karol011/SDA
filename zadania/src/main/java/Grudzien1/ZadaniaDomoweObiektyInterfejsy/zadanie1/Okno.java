package Grudzien1.ZadaniaDomoweObiektyInterfejsy.zadanie1;

import Grudzien1.ZadaniaDomoweObiektyInterfejsy.zadanie1.Interfejsy.IZamykalny;

public class Okno implements IZamykalny {
    private boolean czyOtwarty;
    private Alarm alarm;

    Okno(boolean czyOtwarty, Alarm alarm) {
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
