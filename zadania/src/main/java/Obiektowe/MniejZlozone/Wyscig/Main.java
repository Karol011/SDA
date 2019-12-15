package sda.pl.javagda34.pazdziernik26.Wyscig;

public class Main {
    public static void main(String[] args) {
         Zawodnik pioter = new Zawodnik("Pioter",14,3,10,0);
         Zawodnik janusz = new Zawodnik("Janusz",1,2,8,0);
         Zawodnik grazynka = new Zawodnik("Grazynka",5,1,12,0);

         grazynka.przedstawSie();
         grazynka.biegnij();
         grazynka.przedstawSie();



    }

}
