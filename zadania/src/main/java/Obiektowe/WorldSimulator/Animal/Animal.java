package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.Organism;
import Obiektowe.WorldSimulator.World;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Map;
import java.util.Random;

@Getter
@Setter
@Data
public abstract class Animal extends Organism implements Comparable {


    public Animal(final World world, final int strength, final int speed) {
        super(world, strength);
        this.speed = speed;
    }

    @Override
    protected void action() {
        super.action();
        move();
    }

    @Override
    protected void collision(final Map.Entry<Integer, Collection<Organism>> entry) {
        super.collision(entry);
    }

    protected void move() {
        int currentOrganismPosition = 0;
        int newOrganismPosition;
        for (Map.Entry<Integer, Organism> entry : getGetWorld().getWorldMap().entries()) {
            if (entry.getValue() != null && entry.getValue().equals(this)) {
                currentOrganismPosition = entry.getKey();
            }
        }
        newOrganismPosition = randomlyChangePosition(currentOrganismPosition);
        getGetWorld().getWorldMap().remove(currentOrganismPosition, this);
        getGetWorld().getWorldMap().put(newOrganismPosition, this);
    }

    protected int randomlyChangePosition(int currentOrganismPosition) {
        int NUMBER_TO_MOVE_LEFT_BY_1 = -1;
        int NUMBER_TO_MOVE_RIGHT_BY_1 = 1;
        int NUMBER_TO_MOVE_UP_BY_1 = -10;
        int NUMBER_TO_MOVE_DOWN_BY_1 = 10;
        int MIN_WORLD_MAP_POSITION = 0;
        int MAX_WORLD_MAP_POSITION = 99;
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
        if (currentOrganismPosition + newPosition >= MIN_WORLD_MAP_POSITION &&
                currentOrganismPosition + newPosition <= MAX_WORLD_MAP_POSITION) {
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
