package Obiektowe.listopad24.Biblioteka;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Czlowiek c1 = new Autor("Hugh");
        Czlowiek c2 = new Autor("Mickiewicz");
        Czlowiek c3 = new Autor("Hugh");

        Czlowiek[] autorzy = {c1, c2, c3};
        Egzemplarz e1 = new Czasopismo("Playboy", 1, "Hugh",autorzy);
        Egzemplarz e2 = new Ksiazka("Krzyzacy", 2, "Sienkiewicz",autorzy);
        Egzemplarz e3 = new Ksiazka("W pustyni i w puszczy", 3, "Sienkiewicz",autorzy);
        Egzemplarz e4 = new Ksiazka("Potop", 4, "Sienkiewicz",autorzy);
        Egzemplarz e5 = new Ksiazka("Pan Tadeusz", 5, "Mickiewicz",autorzy);
        Egzemplarz e6 = new Ksiazka("Pan Wolodyjowski", 6, "Mickiewicz",autorzy);
        Egzemplarz e7 = new Ksiazka("Potop", 7, "Sienkiewicz",autorzy);

        Egzemplarz[] egzemplarze = {e1, e2, e3, e4, e5, e6, e7};


        Biblioteka biblioteka = new Biblioteka(egzemplarze);
        System.out.println(Arrays.toString(biblioteka.szukajPoTytule("Potop")));
        //biblioteka.szukajPoAutorze("Sienkiewicz");
    }
}
