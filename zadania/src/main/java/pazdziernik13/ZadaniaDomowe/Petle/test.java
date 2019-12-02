package sda.pl.javagda34.pazdziernik13.ZadaniaDomowe.Petle;

public class test {
    public static void main(String[] args) {
        String tekst = "1hghf2fgdg3dg";
        char znak = '5';
        int zliczenie = 0;

        if (Character.toString(znak).matches("[0-9]")) {
            zliczenie++;
            System.out.println();

        }
        System.out.println("wystapienia cyfr: "+zliczenie);
    }
}

