package Grudzien15.Rekurencja;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{2, 23, 44, 54, 12, 72, 11, 8, 31};
        //  System.out.println(sumReccursive(array, 0));
        //System.out.println(nwd(36, 24));
        //System.out.println(silnia(5));
        System.out.println(nww(3, 6));
        //System.out.println(fibonacci(6));
    }

    public static int sumReccursive(int[] array, int i) {
        return i != array.length - 1 ? (array[i] + sumReccursive(array, ++i)) : 0;
    }

    public static int nwd(int a, int b) {
        return b == 0 ? a : nwd(b, a % b);
    }

    public static int nww(int a, int b) {
        return a % b == 0 ? a : (a * b) / nwd(a, b);
    }

    public static int silnia(int a) {
        return a == 0 ? 1 : a * silnia(a - 1);
    }

    /*public static int fibonacci(int a) {//TODO
        return a == 0 ? 0 : fibonacci(a - 1) + fibonacci(a - 2);
    }*/
}
