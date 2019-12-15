package PetleTablice.Tablice_i_petle;

import java.util.Scanner;

//zadanie rysowanie trojkatow
public class zadanie13 {
    public static void main(String[] args) {
        chooseTheTriangle();
    }

    public static void chooseTheTriangle() {
        System.out.println("Choose the triangle type: " +
                "\n1:" +
                "\n2:" +
                "\n3:" +
                "\n4:");
        Scanner scan = new Scanner(System.in);
        int typeOfTriangle = scan.nextInt();
        switch (typeOfTriangle) {
            case 1:
                drawFirstTriangle();
                break;
            case 2:
                drawSecondTriangle();
                break;
            case 3:
                drawThirdTriangle();
                break;
            case 4:
                drawFourthTriangle();
                break;
        }
    }

    public static void drawFirstTriangle() {
        System.out.println("First triangle: ");
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void drawSecondTriangle() {
        System.out.println("Second triangle: ");
        for (int i = 8; i > 0; i--) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("#");
            }
        }
        System.out.println();
    }

    public static void drawThirdTriangle() {
        System.out.println("Third triangle: ");
        for (int i = 0; i < 9; i++) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 8; j > i; j--) {
                System.out.print("#");
            }
        }
        System.out.println();
    }

    public static void drawFourthTriangle() {
        System.out.println("Fourth triangle: ");
        for (int i = 0; i < 9; i++) {

            for (int j = 8; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }
}
