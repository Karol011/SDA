package sda.pl.javagda34.pazdziernik26.zadaniaNaLekcji;

public class tabliczkaMnozenia {
    public static void main(String[] args) {
        int[][] array = new int[11][7];

        System.out.println(array.length);
        System.out.println(array[1].length);

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                array[i][j] = i * j;
            }
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
