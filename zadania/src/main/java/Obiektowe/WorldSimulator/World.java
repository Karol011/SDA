package Obiektowe.WorldSimulator;

import lombok.Data;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class World {

    List<Organism> organisms;
    Map<Integer, Organism> worldMap;
    private static boolean wasPopulatedWithEmptyEntries = false;


    public World() {
        this.organisms = new ArrayList<>();
        this.worldMap = new LinkedHashMap<>(100);
        populateMapWithEmptyEntries();
        // this.worldMapSizeX = worldMapSizeX;
        //this.worldMapSizeY = worldMapSizeY;
        //WorldMap worldMap = new WorldMap();
    }

    public void addOrganismToWorldMap(Organism o) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        worldMap.replace(randomNumber, o);
    }


    public void makeTurn() {
        System.out.println("\nNEW ROUND");
        for (Organism o : organisms) {
            o.action();
        }
    }

    public boolean defineIfOrganismsOnTheSamePoolAreSameType(int pool) {
        return false;
    }


    protected void drawWorld() {
       /* if (!wasPopulatedWithEmptyEntries) {
            populateMapWithEmptyEntries();
            wasPopulatedWithEmptyEntries = true;
        }*/

       // final Map<Integer, Organism> sortedByCount = worldMap.entrySet()
         //       .stream()
           //     .sorted(Map.Entry.comparingByKey())
             //   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        int counter = 0;
        for (Integer entry : worldMap.keySet()) {
            if (counter % 10 == 0) {
                System.out.println();
            }
            if (entry == null) {
                System.out.print(" - ");
            } else {
                System.out.print(worldMap.get(entry) + " ");
            }
            counter++;

        }
           /* if (entry.getValue().equals(null)) {
                System.out.print(" - ");
            } else {
                System.out.print(this);
            }
        }*/
    }

    private void populateMapWithEmptyEntries() {
        for (int i = 0; i < 100; i++) {
            worldMap.put(i, null);
        }
    }

}
