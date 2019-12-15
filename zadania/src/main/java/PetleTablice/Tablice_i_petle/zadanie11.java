package PetleTablice.Tablice_i_petle;

/*
11. Utwórz program, który przyjmuje dwie tablice a zwraca trzecią zawierającą wspólne elementy obu tablic.
 */
public class zadanie11 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = new int[]{1, 3, 10, 7, 9, 5};
commonArray(array1,array2);
    }

    public static void commonArray(int[] array1, int[] array2) {
        int[] commonArray = new int[array2.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    commonArray[j] = array2[j];
                }
            }
        }
        for (int value : commonArray) {
            System.out.println(value);
        }
    }
}
