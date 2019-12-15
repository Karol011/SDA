package Obiektowe.MniejZlozone.RachunekBankowy;

public class RachunekBankowy {
    int numerKonta;
    double iloscSrodkowNaKoncie;
    String imie;
    String nazwisko;

    public RachunekBankowy(int numerKonta, String imie, String nazwisko, double srodkiNaKoncie) {
        this.numerKonta = numerKonta;
        this.iloscSrodkowNaKoncie = srodkiNaKoncie;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    private double getIloscSrodkowNaKoncie(double iloscSrodkowNaKoncie) {
        return this.iloscSrodkowNaKoncie;
    }

    private int getNumerKonta(int numerKonta) {
        return this.numerKonta;
    }

    private String getImie(String imie) {
        return this.imie;
    }

    private String getNazwisko(String nazwisko) {
        return this.nazwisko;
    }

    void wykonajPrzelewPrzychodzacy(double kwota) {
        iloscSrodkowNaKoncie += kwota;
    }

    void wykonajPrzelewWychodzacy(double kwota) {
        iloscSrodkowNaKoncie += kwota;
    }
}
