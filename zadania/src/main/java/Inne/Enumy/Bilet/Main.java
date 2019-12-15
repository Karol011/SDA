package Inne.Enumy.Bilet;

public class Main {
    public static void main(String[] args) {

        Bilet normalnyGodzinny = Bilet.NORMALNY_GODZINNY;
        Bilet ulgowyGodzinny = Bilet.ULGOWY_GODZINNY;


        System.out.println(Bilet.kupBilet(14, 66, 3));
    }

}
