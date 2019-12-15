package sda.pl.javagda34.pazdziernik13.zadaniaNaLekcji;

public class elseIf {



    public static void main(String[] args) {
        int wiek = 1;
        if (wiek < 18) {
            System.out.println("Jestes niepelnoletni");
        } else if (wiek > 18 && wiek < 99) {
            //else if wykonuje sie przed samym elsem (pomiedzy if a else,jako dodatkowa opcja)
            //ale jezeli pierwszy if zostanie wykonany to else if nawet nie jest brany pod uwage
            System.out.println("Jestes pelnoletni");
        } else {
            System.out.println("Jestes stary, masz wiecej niz 99 lat");
        }

    }




}
