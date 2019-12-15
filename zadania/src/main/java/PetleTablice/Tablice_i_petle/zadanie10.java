package PetleTablice.Tablice_i_petle;

import java.util.Scanner;

/*
10. Utwórz program, który przyjmuje tablicę od użytkownika w postaci liczb całkowitych odseparowanych przecinkiem,
 a następnie na tej tablicy usuwa wszystkie zduplikowane elementy i wyświetla tablicę bez duplikacji.
 */
public class zadanie10 {
    public static void main(String[] args) {
        int[] tablica = new int[]{5, 3, 5, 2, 5};
        //deleteDuplicateElements(loadArrayOfIntegeres());
        deleteDuplicateElements(tablica);
    }

    public static int[] loadArrayOfIntegeres() {
        System.out.println("How many numbers do you want to load?");
        Scanner scanner = new Scanner(System.in);
        int howManyNumbers = scanner.nextInt();
        int[] array = new int[howManyNumbers];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void deleteDuplicateElements(int[] loadedArray) {
        int currentArrayElement;
        int[] utilityArray = new int[loadedArray.length];
        for (int i = 0; i < loadedArray.length; i++) {
            currentArrayElement = loadedArray[i];
            utilityArray[i] = loadedArray[i];
            for (int j = 1; j < i; j++) {
                if (currentArrayElement != loadedArray[i]) {
                    utilityArray[i] = loadedArray[i];
                    break;
                }
            }
        }
        for (int i = 0; i < utilityArray.length; i++) {
            System.out.println(utilityArray[i]);
        }
    }

}
