package Obiektowe.BardziejZlozone.Komputer;

public class Komputer {
    protected int potrzebnaMoc;
    protected String producent;
    protected String nazwaWlasciciela;
    protected TypProcesora typProcesora;


    public Komputer(int potrzebnaMoc, String producent, String nazwaWlasciciela, TypProcesora typProcesora) {
        this.potrzebnaMoc = potrzebnaMoc;
        this.producent = producent;
        this.nazwaWlasciciela = nazwaWlasciciela;
        this.typProcesora = typProcesora;
    }

    @Override
    public String toString() {
        return "Wlasciciel: " + getNazwaWlasciciela() +
                " potrzebna moc: " + getPotrzebnaMoc() +
                " producent " + getProducent()+
                " typ procesora: "+getTypProcesora();

    }

    public int getPotrzebnaMoc() {
        return potrzebnaMoc;
    }

    public void setPotrzebnaMoc(int potrzebnaMoc) {
        this.potrzebnaMoc = potrzebnaMoc;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getNazwaWlasciciela() {
        return nazwaWlasciciela;
    }

    public void setNazwaWlasciciela(String nazwaWlasciciela) {
        this.nazwaWlasciciela = nazwaWlasciciela;
    }

    public TypProcesora getTypProcesora() {
        return typProcesora;
    }
}
