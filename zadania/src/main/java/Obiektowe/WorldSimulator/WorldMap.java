package Obiektowe.WorldSimulator;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class WorldMap {
    Map<Organism, String> worldMap = new HashMap<>();

    public WorldMap(final Map<Organism, String> worldMap) {
        this.worldMap = worldMap;
    }

  //  public void addOrganismToWorldMap(Organism o) {
    //    getWorldMap().put(o, convertCoordinatesToString(o.getWorldCoordinateX(), o.getWorldCoordinateY()));
    //}

    private String convertCoordinatesToString(int coordX, int coordY) {
        return coordX + "," + coordY;
    }
}
