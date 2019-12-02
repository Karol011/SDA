package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.zadaniaZObiektowosci.RachunekBankowy;

public class Bank {

    public static void main(String[] args) {
        RachunekBankowy rachunekKarola = new RachunekBankowy(1, "Karol", "Lacek", 10951);
        RachunekBankowy rachunekAlicji = new RachunekBankowy(2, "Alicja", "Iksinska", 5447);

        wykonajPrzelew(1, 2, 500);

    }

    String bankMillenium;
    int[] tablicaKontBankowych = new int[2];


    public static void wykonajPrzelew(int numerKontaZ, int numerKontaNa, double kwotaPrzelewu) {

    }

    private double setIloscSrodkowNaKoncie(double iloscSrodkowNaKoncie) {
        return this.setIloscSrodkowNaKoncie(iloscSrodkowNaKoncie);
    }


    private int setNumerKonta(int numerKonta) {
        return this.setNumerKonta(numerKonta);
    }

    private String setImie(String imie) {
        return this.setImie(imie);
    }

    private String setNazwisko(String nazwisko) {
        return this.setNazwisko(nazwisko);
    }
}
