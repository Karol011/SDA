package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.Organism;
import Obiektowe.WorldSimulator.World;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;
import java.util.Random;

@Getter
@Setter
@Data
public abstract class Animal extends Organism implements Comparable {


    public Animal(final World world, final int strength, final int speed) {
        super(world, strength, speed);
    }

    @Override
    protected void action() {
        super.action();
        move();
    }

    @Override
    protected abstract void collision();

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
    protected abstract void draw();

    @Override
    public String toString() {
        return this.getClass().toString();
    }

    @Override
    public int compareTo(final Object o) {
        return super.compareTo(o);
    }
}
