package Obiektowe.MniejZlozone.Figura;

public class Prostokat extends Figura {
    private double bokB;

    Prostokat(double bokA, double bokB) {
        super(bokA);
        this.bokB = bokB;
    }

    @Override
    public double obliczPole() {
        return bokA * bokB;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    @Override
    public String toString() {
        return "Prostokat{" +
                "pole: " + obliczPole() +
                '}';
    }
}
