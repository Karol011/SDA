package sda.pl.javagda34.pazdziernik26.zadaniaNaLekcji;

public class tablicePowtorka {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 3, 5,10};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println("elementy tablicy");
        for (int i = 0; i < array.length; i++) {
            System.out.print(", "+array[i]);
        }
        System.out.println();
        System.out.println("parzysty indeks");
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(","+array[i]);
            }
        }
        System.out.println("\nparzyste: " );
        for (Integer integer : array) {
            if (integer % 2 == 0) {
                System.out.print("," + integer);
            }
        }
        System.out.println("\nodwrotna kolejnosc ");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print("," +array[i]);
        }


    }
}
