package Grudzien1.ZadaniaDomoweObiektyInterfejsy.Zadanie4;

public class Trojkat extends Wielokat implements Figura {
    private double bok3;
    private double wysokosc;

    @Override
    public double obliczPole() {
        return 0.5 * getWysokosc() * getBok1();
    }

    @Override
    public double obliczObwod() {
        return getBok1() + getBok2() + getBok3();
    }

    @Override
    public String wypiszOpis() {
        return "Trojkat {" +
                "bok1= " + getBok1() +
                ", bok2= " + getBok2() +
                ", bok3= " + getBok3() +
                "obwod= " + obliczObwod() +
                "pole= " + obliczPole() +
                '}';
    }

    public double getBok3() {
        return bok3;
    }

    public void setBok3(double bok3) {
        this.bok3 = bok3;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }
}
