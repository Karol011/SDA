package Grudzien1.Kolekcje2;

public abstract class Figura implements Comparable {
    protected double bokA;

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
