package Obiektowe.BardziejZlozone.Zajezdnia;

public class Main {
    public static void main(String[] args) {
        Pojazd autobus181 = new Autobus(85, 181, "autobusowa", 150);
        Pojazd autobus187 = new Autobus(100, 187, "autobusowa", 114);
        Pojazd tramwaj04 = new Tramwaj(66, 4, "tramwajowa", 2);
        Pojazd tramwaj8 = new Tramwaj(75, 8, "tramwajowa", 2);

        Pojazd[] autobusy = {autobus181, autobus187};
        Pojazd[] tramwaje = {tramwaj04, tramwaj8};

        Zajezdnia autobusowa = new ZajezdniaAutobusowa("autobusowa", autobusy);
        Zajezdnia tramwajowa = new ZajezdniaTramwajowa("tramwajowa", tramwaje);

        System.out.println(autobus181.toString());
        System.out.println(autobusowa.toString());
        System.out.println(tramwajowa.toString());
    }

}
