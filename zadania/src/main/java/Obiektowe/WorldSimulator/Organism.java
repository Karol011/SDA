package Obiektowe.WorldSimulator;

import Obiektowe.WorldSimulator.Animal.Antelope;
import Obiektowe.WorldSimulator.Animal.Fox;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
@Data
public abstract class Organism implements Comparable {

    protected World world;
    protected int strength;
    protected int speed;
    private boolean isAdded = false;

    public Organism(final World world, final int strength, final int speed) {
        this.world = world;
        this.strength = strength;
        this.speed = speed;
        getWorld().getOrganisms().add(this);
    }

    protected void action() {
        checkIfOrganismWasAddedToWorldMap();
        checkIfAnyPoolHasMoreThanOneOrganismOnIt();
    }

    private void checkIfOrganismWasAddedToWorldMap() {
        if (!isAdded) {
            getWorld().addOrganismToWorldMap(this);
            isAdded = true;
        }
    }

    private void checkIfAnyPoolHasMoreThanOneOrganismOnIt() {
        for (Map.Entry<Integer, Collection<Organism>> entry : getWorld().getWorldMap().asMap().entrySet()) {
            Collection<Organism> organisms = entry.getValue();
            if (organisms.size() > 1) {
                collision(entry);
            }
        }
    }

    protected void collision(Map.Entry<Integer, Collection<Organism>> entry) {
        Integer organismPosition = entry.getKey();
        Collection<Organism> collection = entry.getValue();
        List<Organism> organismList = new ArrayList<>(collection);
        if (organismList.size() == 3) {//null,organism1,organism2
            Organism firstOrganism = organismList.get(1);
            Organism secondOrganism = organismList.get(2);
            if (checkIfOrganismAreSameType(firstOrganism, secondOrganism)) {
                reproduce(firstOrganism, secondOrganism, organismPosition);
            } else {
                fight(firstOrganism, secondOrganism);
            }
        }
    }

    private boolean checkIfOrganismAreSameType(Organism firstOrganism, Organism secondOrganism) {
        return firstOrganism.getClass().equals(secondOrganism.getClass());
    }

    private void reproduce(Organism firstOrganism, Organism secondOrganism, Integer worldMapPosition) {
        Optional<Organism> newlyCreatedOrganism = Optional.empty();

        if (firstOrganism instanceof Antelope) {
            newlyCreatedOrganism = Optional.of(new Antelope(getWorld()));
            //todo randomly change position of newly created organism
        }
        if (firstOrganism instanceof Fox) {
            newlyCreatedOrganism = Optional.of(new Fox(getWorld()));
        }
        if (newlyCreatedOrganism.isPresent()) {
            getWorld().getWorldMap().put(worldMapPosition, newlyCreatedOrganism.get());

            System.out.println("two organism of the same type collided at pool " + worldMapPosition +
                    " creating new " + newlyCreatedOrganism.get().toString());
        }
    }

    private Organism fight(Organism firstOrganism, Organism secondOrganism) {

        return null;
    }


    protected abstract void draw();

    public int compareTo(final Object o) {
        if (o == null) {
            return -1;
        } else {
            return 0;
        }
    }

}
