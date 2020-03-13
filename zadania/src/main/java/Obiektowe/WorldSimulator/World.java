package Obiektowe.WorldSimulator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class World {

    List<Organism> organisms;
    Organism[][] worldMap;
    int worldMapSizeX;
    int worldMapSizeY;

    public World(final int worldMapSizeX, final int worldMapSizeY) {
        this.organisms = new ArrayList<>();
        this.worldMap = new Organism[worldMapSizeX][worldMapSizeY];
    }

    protected void addOrganismsToWorldMap() {

        for (Organism o : organisms) {
            int tempCoordX = o.getWorldCoordinateX();
            int tempCoordY = o.getWorldCoordinateY();

            getWorldMap()[tempCoordX][tempCoordY] = o;
        }
    }

    public void makeTurn() {
        for (Organism o : organisms) {
            o.action();
        }
    }
}
