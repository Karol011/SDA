package Obiektowe.WorldSimulator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class World {

    List<Organism> organisms;
    Organism[][] worldMap;

    public World(final List<Organism> organisms, final int worldMapSizeX, final int worldMapSizeY) {
        this.organisms = organisms;
        this.worldMap = new Organism[worldMapSizeX][worldMapSizeY];
    }

}
