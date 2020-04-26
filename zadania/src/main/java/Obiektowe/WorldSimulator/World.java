package Obiektowe.WorldSimulator;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

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
        int randomNumber = random.nextInt(10);
        worldMap.put(randomNumber, o);
//        worldMap.remove(randomNumber, null);
    }

    public void makeTurn() {
        System.out.println("\n ***** NEW ROUND ***** \n");
        for (Organism o : organisms) {
            o.action();
        }
    }

    public boolean defineIfOrganismsOnTheSamePoolAreSameType(int pool) {
        return false;
    }

    protected void drawWorld() {
        int counter = 0;
        for (Map.Entry<Integer, Collection<Organism>> entry : worldMap.asMap().entrySet()) {
            Collection<Organism> valuesForKey = entry.getValue();
            if (counter % 10 == 0) {
                System.out.println();
            }
            if (valuesForKey.size() == 1) {
                System.out.print("  " + counter + "  ");
            } else {
                printValuesWithoutNullEntry(valuesForKey);
            }
            counter++;
        }
    }

    private void printValuesWithoutNullEntry(Collection<Organism> organisms) {
        final int INDEX_WHERE_NULL_PHRASE_ENDS = 7;
        System.out.print("[" + organisms.toString().substring(INDEX_WHERE_NULL_PHRASE_ENDS));
    }

    private void populateMapWithEmptyEntries() {
        for (int i = 0; i < 100; i++) {
            worldMap.put(i, null);
        }
    }
}
