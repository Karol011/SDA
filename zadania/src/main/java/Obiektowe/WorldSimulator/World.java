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
    private static int roundCounter = 1;

    public World() {
        this.organisms = new ArrayList<>();
        this.worldMap = ArrayListMultimap.create();
        populateMapWithEmptyEntries();
    }

    private void populateMapWithEmptyEntries() {
        for (int i = 0; i < 100; i++) {
            getWorldMap().put(i, null);
        }
    }

    public void addOrganismToWorldMap(Organism o) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        getWorldMap().put(randomNumber, o);
    }

    public void makeTurn() {
        System.out.println("\n\n ***** ROUND no." + roundCounter + " ***** \n");
       /* for (Organism o : getOrganisms()) {
            o.action();
        }*/
        for (int i = 0; i < getOrganisms().size(); i++) {
            getOrganisms().get(i).action();
        }
        roundCounter++;
    }

    protected void drawWorld() {
        int counter = 0;
        for (Map.Entry<Integer, Collection<Organism>> entry : getWorldMap().asMap().entrySet()) {
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
        System.out.print(sortedOrganisms.toString()
                .substring(0, INDEX_WHERE_NULL_PHRASE_BEGINS)
                .replaceAll(" ", "")
                + "]"
        );
    }


}
