package Kolekcje.Kolekcje2;

public class Kwadrat extends Prostokat {
    public Kwadrat(double bokA) {
        super(bokA, bokA);
    }

    @Override
    public double obliczPole() {
        return bokA * bokA;
    }
    @Override
    public String toString() {
        return "Kwadrat{" +
                "pole: " + obliczPole() +
                '}';
    }

}
