package Obiektowe.BardziejZlozone.AlarmCzajnik;


import Obiektowe.BardziejZlozone.AlarmCzajnik.Interfejsy.IZamykalny;

public class Brama implements IZamykalny {
    private boolean czyOtwarty;

    Brama(boolean czyOtwarty) {
        this.czyOtwarty = czyOtwarty;
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
    public String toString() {
        return "Brama{" +
                "czyOtwarty=" + czyOtwarty +
                '}';
    }
}
