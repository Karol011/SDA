package Obiektowe.WorldSimulator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class World {

    List<Organism> organisms;
    public int[][] worldMap;
    int worldMapSizeX;
    int worldMapSizeY;

    public World(final int worldMapSizeX, final int worldMapSizeY) {
        this.organisms = new ArrayList<>();
        this.worldMap = new int[worldMapSizeX][worldMapSizeY];
    }

    protected void addOrganismsToWorldMap() {

        for (Organism o : organisms) {
            int tempCoordX = o.getWorldCoordinateX();
            int tempCoordY = o.getWorldCoordinateY();
            worldMap[tempCoordX][tempCoordY] = o.getCoordinates();
        }
    }

    public void makeTurn() {
        for (Organism o : organisms) {
            o.action();
        }
    }

    protected void drawWorld() {
        for (int i = 0; i < worldMapSizeX; i++) {
            for (int j = 0; j < worldMapSizeY; j++) {
                /*if (worldMap[i][j] == null) {
                    System.out.println("0");
                } else {
                    System.out.println("1");
                }*/
                System.out.println("*");
            }
        }
    }
}
