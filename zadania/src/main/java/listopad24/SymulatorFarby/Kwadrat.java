package listopad24.SymulatorFarby;

public class Kwadrat extends Prostokat {
    public Kwadrat(double bokA) {
        super(bokA, bokA);
    }

    public double obliczPole() {
        return getBokA() * getBokA();
    }
}
