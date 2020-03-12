package Obiektowe.WorldSimulator;

import java.util.Arrays;

public class tester {

    int[][] coords;
    int xPos;
    int yPos;

    public tester(final int xPos, final int yPos) {
        this.coords = new int[xPos][yPos];
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public static void main(String[] args) {

        tester tester = new tester(5, 4);
        tester.showCoords();
    }

    void showCoords() {
        System.out.println("my name is " + " " + this.toString());
    }

    @Override
    public String toString() {
        return "coords=" +
                xPos +
                "," + yPos;
    }
}
