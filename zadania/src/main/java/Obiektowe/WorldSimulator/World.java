package Obiektowe.WorldSimulator;

import lombok.Data;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

@Data
public class World {

    List<Organism> organisms;
    Map<Organism, Integer> worldMap;

    public World() {
        this.organisms = new ArrayList<>();
        this.worldMap = new LinkedHashMap<>();
        // this.worldMapSizeX = worldMapSizeX;
        //this.worldMapSizeY = worldMapSizeY;
        //WorldMap worldMap = new WorldMap();
    }

    public void addOrganismToWorldMap(Organism o) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        worldMap.put(o, randomNumber);
    }


    public void makeTurn() {
        System.out.println("NEW ROUND");
        for (Organism o : organisms) {
            o.action();
        }
    }

    public boolean defineIfOrganismsOnTheSamePoolAreSameType(int pool) {
        return false;
    }


    protected void drawWorld() {
        boolean wasPopulatedWithEmptyEntries = false;
        if (!wasPopulatedWithEmptyEntries) {
            populateMapWithEmptyEntries();
            wasPopulatedWithEmptyEntries = true;
        }
        for (Map.Entry entry : worldMap.entrySet()) {
            if (entry.getValue().equals(0)) {
                System.out.print(" - ");
            } else {
                System.out.print(this);
            }
        }
    }

    private void populateMapWithEmptyEntries() {
        for (int i = 0; i < 100; i++) {
            worldMap.put(null, 0);
        }
    }

}
