package Obiektowe.listopad24.Samochody;

public class Kabriolet extends Samochod {
    boolean dach;

    public Kabriolet(int predkosc, boolean swiatla, String kolor, String marka, int rocznik, boolean dach) {
        super(predkosc, swiatla, kolor, marka, rocznik);
        this.dach = dach;
    }


    @Override
    protected void przyspiesz() {
        setPredkosc(getPredkosc() + 10);
        if (getPredkosc() > 180) {
            System.out.println("Auto nie moze jechac szybciej niz 180");
            setPredkosc(180);
        } else {
            System.out.println("przyspieszam do " + getPredkosc());
        }
    }
    @Override
    public String toString() {
        return super.toString()+
                " z rozsuwanym dachem " + isDach();
    }
    protected void schowajDach() {
        setDach(!isDach());
    }
    protected void czyDach() {
        if (isDach()) {
            System.out.println("zasloniety");
        } else {
            System.out.println("odslolniety");
        }
    }

    public boolean isDach() {
        return dach;
    }

    public void setDach(boolean dach) {
        this.dach = dach;
    }


}
