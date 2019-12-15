package Inne.Enumy.Ulamki;

public class Main {
    public static void main(String[] args) {
        Ulamek ulamek1 = new Ulamek(1,2);
        Ulamek ulamek2 = new Ulamek(3,4);

        ulamek1.wyswietlUlamek();
        ulamek1.dodaj(ulamek2);
        ulamek1.wyswietlUlamek();
        ulamek2.wyswietlUlamek();
    }
}
