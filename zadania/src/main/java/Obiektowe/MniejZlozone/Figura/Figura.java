package Obiektowe.MniejZlozone.Figura;

public abstract class Figura implements Comparable {
    double bokA;

    public Figura(double bokA) {
        this.bokA = bokA;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "pole: " + obliczPole() +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        return Double.compare(this.obliczPole(), ((Figura) (o)).obliczPole());
    }

    public abstract double obliczPole();
}
