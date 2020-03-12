package Obiektowe.WorldSimulator;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class World {

    List<Organism> organisms;
    int[][] worldMap;

    public World(final List<Organism> organisms, final int[][] worldMap) {
        this.organisms = organisms;
        this.worldMap = worldMap;
    }

    void makeTurn() {
        for (Organism organizm : organisms) {
            organizm.action();
        }
    }

    void drawWorld() {

    }
}
