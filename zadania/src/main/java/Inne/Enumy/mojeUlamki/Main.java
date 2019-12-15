package Inne.Enumy.mojeUlamki;

public class Main {
    public static void main(String[] args) {
        Ulamek pierwszyUlamek = new Ulamek(1, 2);
        Ulamek drugiUlamek = new Ulamek(6, 8);
        pierwszyUlamek.wyswietlUlamek();
        drugiUlamek.wyswietlUlamek();
        pierwszyUlamek.dodaj(drugiUlamek);
        pierwszyUlamek.wyswietlUlamek();

    }
}
