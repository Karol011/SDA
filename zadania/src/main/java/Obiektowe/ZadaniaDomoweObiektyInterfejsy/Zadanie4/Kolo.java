package Obiektowe.ZadaniaDomoweObiektyInterfejsy.Zadanie4;

public class Kolo implements Figura {
    private double promien;
    private final double PI = 3.14;



    @Override
    public double obliczPole() {
        return PI * getPromien() * getPromien();
    }

    @Override
    public double obliczObwod() {
        return 2 * PI * getPromien();
    }

    @Override
    public String wypiszOpis() {
        return "Kolo:"+
                "\npromien: " + getPromien() +
                "\npole : " +  obliczPole() +
                "\nobwod: " + obliczObwod();
    }

    public double getPromien() {
        return promien;
    }


    public void setPromien(double promien) {
        this.promien = promien;
    }
}
