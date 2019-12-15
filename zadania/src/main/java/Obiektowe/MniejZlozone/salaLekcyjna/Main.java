package Obiektowe.MniejZlozone.salaLekcyjna;

public class Main {
    public static void main(String[] args) {
        SalaLekcyjna salaLekcyjna1 = new SalaLekcyjna("Warszawa",1);
        SalaLekcyjna salaLekcyjna2 = new SalaLekcyjna("Sopot",2);
        SalaLekcyjna salaLekcyjna3 = new SalaLekcyjna("Kraków",3);

        salaLekcyjna1.wypiszDaneSali();
        salaLekcyjna2.wypiszDaneSali();
        salaLekcyjna3.wypiszDaneSali();
    }
}
