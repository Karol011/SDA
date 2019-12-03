package Grudzien1.ZadaniaDomoweObiektyInterfejsy.zadanie1;

import Grudzien1.ZadaniaDomoweObiektyInterfejsy.zadanie1.Interfejsy.IWylaczalny;

public class Alarm implements IWylaczalny {
    private boolean czyWlaczony;

    Alarm(boolean czyWlaczony) {
        this.czyWlaczony = czyWlaczony;
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
}
