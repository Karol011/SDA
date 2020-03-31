package Obiektowe.WorldSimulator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class World {

    List<Organism> organisms;
    public int[] worldMap;
    int worldMapSizeX;
    // int worldMapSizeY;

    public World(final int worldMapSizeX) {
        this.organisms = new ArrayList<>();
        this.worldMap = new int[worldMapSizeX];
    }

    protected void addOrganismsToWorldMap() {

        for (Organism o : organisms) {
            int tempCoordX = o.getWorldCoordinateX();
            // int tempCoordY = o.getWorldCoordinateY();
            worldMap[tempCoordX] = o.getWorldCoordinateX();
        }
    }

    public void makeTurn() {
        for (Organism o : organisms) {
            o.action();
        }
    }

    protected void drawWorld() {
        for (int i = 0; i < getWorldMap().length; i++) {
            if (worldMap[i] == 0) {
                System.out.print("0");
            } else {
                System.out.print("1");
            }
            if ((i + 1) % 10 == 0) { //i+1 so it displays in even rows
                System.out.println();
            }
        }
    }
}
