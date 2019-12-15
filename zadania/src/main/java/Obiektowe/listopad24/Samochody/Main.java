package Obiektowe.listopad24.Samochody;

public class Main {
    public static void main(String[] args) {
        Samochod ford = new Samochod(100,false,"srebrny","ford",2008);
        Samochod honda = new Samochod(100,false,"srebrny","ford",2008);
        Kabriolet kabriolet = new Kabriolet(160,true,"czerwony","ferrari",2016,true);
//        System.out.println(ford.getPredkosc());
//        ford.przyspiesz();
//        System.out.println(ford.getPredkosc());
//        ford.czySwiatlaWlaczone();
//        ford.przelaczSwiatla();
//        ford.czySwiatlaWlaczone();
//        ford.przyspiesz();
//        ford.przyspiesz();
        kabriolet.czyDach();
        System.out.println("kabrioletty");
        kabriolet.przyspiesz();
        System.out.println(kabriolet.getPredkosc());
        kabriolet.przyspiesz();
        kabriolet.przyspiesz();
        kabriolet.przyspiesz();
        System.out.println("*******************************");
        System.out.println(ford.toString());
        System.out.println(kabriolet.toString());
        System.out.println("porownanieeeeeeeeeeeeeeeeee");
        System.out.println(ford.equals(honda));
    }
}
