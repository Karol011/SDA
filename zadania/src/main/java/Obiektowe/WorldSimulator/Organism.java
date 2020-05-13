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

    protected World getWorld;
    protected int strength;
    protected int speed;
    private boolean isAdded = false;

    public Organism(final World world, final int strength) {
        this.getWorld = world;
        this.strength = strength;
        getGetWorld().getOrganisms().add(this);
    }

    protected void action() {
        checkIfOrganismWasAddedToWorldMap();
        checkIfAnyPoolHasMoreThanOneOrganismOnIt();
    }

    private void checkIfOrganismWasAddedToWorldMap() {
        if (!isAdded) {
            getGetWorld().addOrganismToWorldMap(this);
            isAdded = true;
        }
    }

    private void checkIfAnyPoolHasMoreThanOneOrganismOnIt() {
        for (Map.Entry<Integer, Collection<Organism>> entry : getGetWorld().getWorldMap().asMap().entrySet()) {
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
                fight(firstOrganism, secondOrganism, organismPosition);
            }
        }
    }

    public int getOrganismPosition() {
        int currentOrganismPosition = 0;
        for (Map.Entry<Integer, Organism> entry : getGetWorld().getWorldMap().entries()) {
            if (entry.getValue() != null && entry.getValue().equals(this)) {
                currentOrganismPosition = entry.getKey();
            }
        }
        return currentOrganismPosition;
    }

    private boolean checkIfOrganismAreSameType(Organism firstOrganism, Organism secondOrganism) {
        return firstOrganism.getClass().equals(secondOrganism.getClass());
    }

    private void reproduce(Organism firstOrganism, Organism secondOrganism, Integer worldMapPosition) {
        Optional<Organism> newlyCreatedOrganism = Optional.empty();

        if (firstOrganism instanceof Antelope) {
            newlyCreatedOrganism = Optional.of(new Antelope(getGetWorld()));
            //todo randomly change position of newly created organism
        }
        if (firstOrganism instanceof Fox) {
            newlyCreatedOrganism = Optional.of(new Fox(getGetWorld()));
        }
        if (newlyCreatedOrganism.isPresent()) {
            getGetWorld().getWorldMap().put(worldMapPosition, newlyCreatedOrganism.get());

            System.out.println("two organism of the same type collided at pool " + worldMapPosition +
                    " creating new " + newlyCreatedOrganism.get().toString());
        }
    }

    private void fight(Organism firstOrganism, Organism secondOrganism, Integer worldMapPosition) {
        Organism loser;
        if (firstOrganism.getStrength() == secondOrganism.getStrength()) {
            draw();
        } else {
            if (firstOrganism.getStrength() > secondOrganism.getStrength()) {
                loser = secondOrganism;
            } else {
                loser = firstOrganism;
            }
            getGetWorld().getOrganisms().remove(loser);
            getGetWorld().getWorldMap().remove(worldMapPosition, loser);
            System.out.println(
                    firstOrganism.toString() + " and " + secondOrganism.toString() +
                            " have fought at pool " + worldMapPosition +
                            ", " + loser.toString() +
                            " didn't survive");
        }

    }

    protected abstract void draw();

    @Override
    public String toString() {
        return "Organism{}";
    }

    public int compareTo(final Object o) {
        if (o == null) {
            return -1;
        } else {
            return 0;
        }
    }

}
