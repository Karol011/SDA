package Kolekcje.SetyZadaniaDomowe.PairOFNumbers;

public class PairOfNumbers {
   private int a,b;

    protected PairOfNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "PairOfNumbers{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
