package Inne.Wyjatki;


import java.util.Scanner;

public class Dividing {
    public static void main(String[] args) {
        System.out.println(divideMethod1());
        System.out.println(divideMethod2());
    }

    private static double divideMethod1() {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("first");
        a = scanner.nextInt();
        System.out.println("second");
        b = scanner.nextInt();
        if (b == 0) {
            throw new ArithmeticException("Don't divide by 0");
        }
        return a/b;
    }

    private static double divideMethod2() {
        Scanner scanner = new Scanner(System.in);
        int a,b=1;
        System.out.println("first:");
        a = scanner.nextInt();
        System.out.println("second");
        try {
            b = scanner.nextInt();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return a/b;
    }


}
