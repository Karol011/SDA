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
        int randomNumber = random.nextInt(5);
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
            System.out.print(" ");
            if (valuesForKey.size() == 1) {
                System.out.print(" ");
                System.out.print(counter);
                System.out.print(" ");
            } else {
                printValuesWithoutNullEntry(valuesForKey);
            }
            System.out.print(" ");
            counter++;
        }
    }

    private void printValuesWithoutNullEntry(Collection<Organism> organisms) {
        final Collection<Organism> sortedOrganisms = organisms.stream()
                .sorted()
                .collect(Collectors.toList());

        final int INDEX_WHERE_NULL_PHRASE_BEGINS = sortedOrganisms.toString().length() - 7;
        System.out.print(sortedOrganisms.toString().substring(0, INDEX_WHERE_NULL_PHRASE_BEGINS) + "]");
    }

    private void populateMapWithEmptyEntries() {
        for (int i = 0; i < 100; i++) {
            worldMap.put(i, null);
        }
    }
}
