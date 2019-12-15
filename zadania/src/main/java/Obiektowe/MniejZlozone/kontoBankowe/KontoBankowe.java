package sda.pl.javagda34.pazdziernik26.kontoBankowe;

public class KontoBankowe {
    Long numerKonta;
    int stanKonta;
    String identyfikator;

    public KontoBankowe(long numerKonta, int stanKonta, String identyfikator) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
        this.identyfikator = identyfikator;
    }

    public void wyswietlStanKonta() {
        System.out.println("Stan konta " + identyfikator + " wynosi " + stanKonta);
    }

    public void wplacSrodki(int wplacaneSrodki) {
        stanKonta = stanKonta + wplacaneSrodki;
    }

    public int pobierzSrodki(int pobieraneSrodki) {
        stanKonta = stanKonta - pobieraneSrodki;
        return stanKonta;
    }


}
