package WzorceProjektowe.Prototyp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tab = { 5, 3, 8, 2};
        int[] kolejnaTablica = tab.clone();

        System.out.println("Tablica 1: " + Arrays.toString(tab));
        System.out.println("Tablica 2: " + Arrays.toString(kolejnaTablica));

        tab[2] = 2345678;

        System.out.println("Tablica 1: " + Arrays.toString(tab));
        System.out.println("Tablica 2: " + Arrays.toString(kolejnaTablica));
    }
}
