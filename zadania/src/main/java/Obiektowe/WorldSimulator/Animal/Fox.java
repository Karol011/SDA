package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.Organism;
import Obiektowe.WorldSimulator.World;
import com.google.common.collect.Multimap;
import lombok.Data;

import java.util.Map;
import java.util.Random;

@Data
public class Fox extends Animal implements Comparable {
    protected int id;
    protected static int idCcounter;
    private boolean isAdded = false;


    public Fox(final World world, final int strength, final int speed) {
        super(world, strength, speed);
        idCcounter++;
        id = idCcounter;
    }

    @Override
    protected void action() {
        checkIfOrganismWasAddedToWorldMap();
        move();
    }

    @Override
    protected void collision() {

    }


    @Override
    protected void move() {
        int currentOrganismPosition = 0;
        int newOrganismPosition;
        for (Map.Entry<Integer, Organism> entry : getWorld().getWorldMap().entries()) {
            if (entry.getValue() != null && entry.getValue().equals(this)) {
                currentOrganismPosition = entry.getKey();
            }
        }
        newOrganismPosition = randomlyChangePosition(currentOrganismPosition);
        getWorld().getWorldMap().remove(currentOrganismPosition, this);
        getWorld().getWorldMap().put(newOrganismPosition, this);
    }

    private int randomlyChangePosition(int currentOrganismPosition) {
        int NUMBER_TO_MOVE_LEFT_BY_1 = -1;
        int NUMBER_TO_MOVE_RIGHT_BY_1 = 1;
        int NUMBER_TO_MOVE_UP_BY_1 = -10;
        int NUMBER_TO_MOVE_DOWN_BY_1 = 10;
        int MIN_WORLDMAP_POSITION = 0;
        int MAX_WORLDMAP_POSITION = 99;
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;
        int newPosition;

        switch (randomNumber) {
            case 1:
                //Move left
                newPosition = NUMBER_TO_MOVE_LEFT_BY_1;
                break;
            case 2:
                //Move right
                newPosition = NUMBER_TO_MOVE_RIGHT_BY_1;
                break;
            case 3:
                //Move up
                newPosition = NUMBER_TO_MOVE_UP_BY_1;
                break;
            case 4:
                //Move down
                newPosition = NUMBER_TO_MOVE_DOWN_BY_1;
                break;
            default:
                newPosition = 0;
        }
        if (currentOrganismPosition + newPosition >= MIN_WORLDMAP_POSITION &&
                currentOrganismPosition + newPosition <= MAX_WORLDMAP_POSITION) {
            return currentOrganismPosition + newPosition;
        } else {
            return currentOrganismPosition;
        }
    }

    @Override
    protected void draw() {

    }

    protected void checkIfOrganismWasAddedToWorldMap() {
        if (!isAdded) {
            getWorld().addOrganismToWorldMap(this);
            isAdded = true;
        }
    }

    @Override
    public String toString() {
        return "F" + id;
    }


    @Override
    public int compareTo(final Object o) {
        if (o == null) {
            return -1;
        }
        if (o.getClass().equals(this.getClass())) {
            Fox fox = (Fox) o;
            if (fox.getId() < this.getId()) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }
}
