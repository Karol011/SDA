package sda.pl.javagda34.pazdziernik26.zadaniaNaLekcji;

public class nieregularnaTablica {
    public static void main(String[] args) {
        char star='*';
        int[][] nieregularna = new int[10][];
        // petla na stworzenie tablicy, kazdy wiersz inna dlugosc
        for (int i = 0; i < nieregularna.length; i++) {

            nieregularna[i] = new int[i];
        }


        System.out.println(nieregularna.length);


        for (int i = 0; i < nieregularna.length; i++) {
            for (int j = 0; j < nieregularna[i].length; j++){
                nieregularna[i][j]='*';
                System.out.print((char)nieregularna[i][j]);             //rzutowanie 42 (wartosci ASCII gwiazdki) na chara
            }
            System.out.println();
        }

    }

}
