package sda.pl.javagda34.pazdziernik26.zadaniaDomowe.zadaniaKlasyIMetody.Wisielec;

public class Gra {
    public static void main(String[] args) {
       String password = Wisielec.loadPassword();
       // Wisielec.guessTheLetter();
        Wisielec.checkIfLetterIsCorrect(Wisielec.guessTheLetter(),password);
    }
}
