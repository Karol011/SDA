package listopad24.Komputer;

public class Laptop extends Komputer {
    protected double wielkoscMatrycy;
    protected boolean czyPosiadaRetine;

    public Laptop(int potrzebnaMoc, String producent,String nazwaWlasciciela,TypProcesora typProcesora, double wielkoscMatrycy, boolean czyPosiadaRetine) {
        super(potrzebnaMoc, producent,nazwaWlasciciela,typProcesora);
        this.wielkoscMatrycy = wielkoscMatrycy;
        this.czyPosiadaRetine = czyPosiadaRetine;
    }

    @Override
    public String toString() {
        return super.toString() +
                " wielkosc matrycy: " + getWielkoscMatrycy() +
                " posiada retine " + isCzyPosiadaRetine();

    }

    public double getWielkoscMatrycy() {
        return wielkoscMatrycy;
    }

    public void setWielkoscMatrycy(double wielkoscMatrycy) {
        this.wielkoscMatrycy = wielkoscMatrycy;
    }

    public boolean isCzyPosiadaRetine() {
        return czyPosiadaRetine;
    }

    public void setCzyPosiadaRetine(boolean czyPosiadaRetine) {
        this.czyPosiadaRetine = czyPosiadaRetine;
    }
}
