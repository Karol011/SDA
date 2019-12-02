package sda.pl.javagda34.pazdziernik26.osoby;

public class Main {
    public static void main(String[] args) {


        Osoba ania = new Osoba("Ania",25,"kobieta");//stworzenie 6 obiektow typu Osoba wykorzystujac zdefiniowany wczesniej konstruktor
        Osoba andrzej = new Osoba("Andrzej",50,"mezczyzna");
        Osoba mariola = new Osoba("Mariola",65,"kobieta");
        Osoba karol = new Osoba("Karol",119,"mezczyzna");
        Osoba aneta = new Osoba("Aneta",18,"kobieta");
        Osoba sylwia = new Osoba("Sylwia",22,"kobieta");

        Osoba[] osoby = new Osoba[]{ania,andrzej,mariola,karol,aneta,sylwia};       //stworzenie tablicy osob i przypisanie jej Osob(obiektow typu osoba)
                                                                                    //
        for (int i = 0; i < osoby.length; i++) {
            //osoby[i].czyJestKobieta();
            if (osoby[i].plec.equals("kobieta")) {
                System.out.println(osoby[i].imie);
            }
            //osoby[i].czyJestMezczyzna();                                            //sprawdzanie czy pole "plec" == "mezczyzna"
        }

        //ania.przedstawSie();
        //mariola.przedstawSie();

    }

}
