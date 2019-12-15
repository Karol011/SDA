package RekurencjaSortowanie.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 6, 7, 11, 13, 21, 23, 27};
        System.out.println(binarySearch(array, 21));

        System.out.println(binarySearchReccursive(array,21,0,array.length));
    }

    private static int binarySearch(int[] array, int n) {
        int min = 0;
        int max = array.length;
        int mid;
        while (min <= max) {
            mid = (min + max) / 2;
            if (array[mid] == n) {
                return mid;
            } else if (array[mid] < n) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearchReccursive(int[] array, int n, int min, int max) {

        int mid;
        if (min <= max) {
            mid = (min + max) / 2;
            if (array[mid] == n) {
                return mid;
            } else if (array[mid] < n) {
                return binarySearchReccursive(array, n, mid + 1, max);
            } else {
                return binarySearchReccursive(array, n, min, mid-1);
            }
        }
        return -1;
    }
}
