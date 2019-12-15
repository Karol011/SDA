package Obiektowe.listopad24.kolo;

public class Kolo {
    private final double PI = 3.14;
    protected double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public final void obliczPole() {
        setPromien(PI*getPromien()*getPromien());
    }

    public double getPromien() {
        return promien;
    }

    public void setPromien(double promien) {
        this.promien = promien;
    }

    public double getPI() {
        return PI;
    }
}
