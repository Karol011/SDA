package Obiektowe.BardziejZlozone.Zadanie4Figura;

public abstract class Wielokat implements Figura {
    private double bok1;
    private double bok2;


    @Override
    public double obliczPole() {
        return 0;
    }

    @Override
    public double obliczObwod() {
        return 0;
    }

    @Override
    public String wypiszOpis() {
        return "Wielokat {" +
                "bok1=" + getBok1() +
                ", bok2=" + getBok2() +
                '}';
    }

    public double getBok1() {
        return bok1;
    }

    public double getBok2() {
        return bok2;
    }

    public void setBok1(double bok1) {
        this.bok1 = bok1;
    }

    public void setBok2(double bok2) {
        this.bok2 = bok2;
    }
}
