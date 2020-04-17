package Obiektowe.WorldSimulator;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import lombok.Data;

import java.util.*;

@Data
public class World {
    List<Organism> organisms;
    Multimap<Integer, Organism> worldMap;
    private static boolean wasPopulatedWithEmptyEntries = false;

    public World() {
        this.organisms = new ArrayList<>();
        this.worldMap = ArrayListMultimap.create();
        populateMapWithEmptyEntries();
    }

    public void addOrganismToWorldMap(Organism o) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        worldMap.removeAll(randomNumber);
        worldMap.put(randomNumber, o);
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
        int counter = 0;
        for (Map.Entry<Integer, Organism> entry : worldMap.entries()) {
            if (counter % 10 == 0) {
                System.out.println();
            }
            if (entry.getValue() == null) {
                System.out.print("  -  ");
            } else {
                System.out.print(" " + entry.getValue());
            }
            counter++;
        }
    }

    private void populateMapWithEmptyEntries() {
        for (int i = 0; i < 100; i++) {
            worldMap.put(i, null);
        }
    }
}
