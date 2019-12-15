package sda.pl.javagda34.pazdziernik13.zadaniaNaLekcji;

public class zadanieWypisanieObrazkaZPetli {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println("*");
            for (int j = 11; j > i; j--) {
                System.out.print("*");
            }
        }
    }


}
