package Obiektowe.listopad24.Samochody;

public class Samochod {
    protected int predkosc;
    protected boolean swiatla;
    protected String kolor;
    protected String marka;
    protected int rocznik;


    public Samochod(int predkosc, boolean swiatla, String kolor, String marka, int rocznik) {
        this.predkosc = predkosc;
        this.swiatla = swiatla;
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }
@Override
    public String toString() {
        return "Samochod: predkosc "+getPredkosc()+
                " swiatla "+isSwiatla()+
                " kolor "+getKolor()+
                " marka "+getMarka()+
                " rocznik "+getRocznik();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Samochod)) return false;
        Samochod samochod = (Samochod) o;
        return getPredkosc() == samochod.getPredkosc() &&
                isSwiatla() == samochod.isSwiatla() &&
                getRocznik() == samochod.getRocznik() &&
                getKolor().equals(samochod.getKolor()) &&
                getMarka().equals(samochod.getMarka());
    }

    protected void przyspiesz() {
        setPredkosc(getPredkosc() + 10);
        if (getPredkosc() > 120) {
            System.out.println("Auto nie moze jechac szybciej niz 120");
            setPredkosc(120);
        } else {
            System.out.println("przyspieszam do " + getPredkosc());
        }
    }

    protected void przelaczSwiatla() {
        setSwiatla(!isSwiatla());
    }

    protected void czySwiatlaWlaczone() {
        if (isSwiatla()) {
            System.out.println("wlaczone");
        } else {
            System.out.println("Wylaczone");
        }
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public int getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }

    public boolean isSwiatla() {
        return swiatla;
    }

    public void setSwiatla(boolean swiatla) {
        this.swiatla = swiatla;
    }
}
