package sda.pl.javagda34.pazdziernik26.osoby;

public class Osoba {
    String imie;
    int wiek;
    String plec;

    public Osoba(String imie, int wiek, String plec) {              //stworzenie konstruktora Osoba i przypisanie mu danych
        this.imie = imie;
        this.wiek = wiek;
        this.plec = plec;
    }
    public void przedstawSie() {
        System.out.println("Nazywam sie " + imie + " i mam " + wiek + " lat  i jestem "+plec);
    }//stworzenie metody przedstawiajacej osobe
    public void czyJestKobieta() {
        if (plec.equals("kobieta")) {
            System.out.println(imie + " Jest kobieta");
        }
    }//metoda sprawdzajaca czy dana osoba jest kobieta, porownujac Stringa plec z "kobieta"
    public void czyJestMezczyzna() {
        if (plec.equals("mezczyzna")) {
            System.out.println(imie + " Jest mezczyzna");
        }
    }


}

