package Obiektowe.BardziejZlozone.Zadanie4Figura;

public class Prostokat extends Wielokat implements Figura {


    @Override
    public double obliczPole() {
        return getBok1() * getBok2();
    }

    @Override
    public double obliczObwod() {
        return 2 * getBok1() + 2 * getBok2();
    }

    @Override
    public String wypiszOpis() {
        return "Prostokat {" +
                "bok1= " + getBok1() +
                ", bok2= " + getBok2() +
                "obwod= " + obliczObwod() +
                "pole= " + obliczPole() +
                '}';
    }

}
