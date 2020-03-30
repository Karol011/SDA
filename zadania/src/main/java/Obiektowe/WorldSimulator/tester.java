package Obiektowe.WorldSimulator;

import lombok.Data;

import java.util.Arrays;

@Data
public class tester {

    int[][] coords = new int[10][10];
    int xPos;
    int yPos;

    public tester(final int xPos, final int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.coords = setCoords(xPos,yPos);
    }

    public static void main(String[] args) {

        tester tester = new tester(5, 4);
        //tester.coords[5][4] = tester.
        System.out.println(Arrays.deepToString(tester.getCoords()));
        tester.setCoords(5,4);
        Arrays.deepToString(tester.getCoords());
        tester.showCoords();
    }

    int[][] setCoords(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.coords[xPos][yPos] = coords[xPos][yPos];
        return coords;
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
