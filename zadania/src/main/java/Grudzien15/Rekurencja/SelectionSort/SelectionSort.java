package Grudzien15.Rekurencja.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 44, 23, 6, 3, 11, 46, 21, 12, 27};
        System.out.println(Arrays.toString(tablicaDoSortowania(array)));
        System.out.println(selectionSort(array));
    }

    private static int[] selectionSort(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int minimum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimum]) {
                    minimum = j;
                }
            }
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }
        return sortedArray;
    }

    public static int[] tablicaDoSortowania(int[] table) {
        for (int i = 0; i < table.length; i++) {
            int number = table[i];
            int j = i;
            while ((j > 0) && (table[j - 1] > number)) {
                table[j] = table[j - 1];
                j--;
                table[j] = number;
            }
        }
        return table;
    }
}
