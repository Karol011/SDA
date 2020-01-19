package Obiektowe.MniejZlozone.Figura;

public class Kwadrat extends Prostokat {
    Kwadrat(double bokA) {
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
