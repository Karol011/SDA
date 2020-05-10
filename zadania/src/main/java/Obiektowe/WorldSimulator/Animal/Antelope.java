package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.Organism;
import Obiektowe.WorldSimulator.World;

import java.util.Collection;
import java.util.Map;
import java.util.Random;

public class Antelope extends Animal implements Comparable {
    private int id;
    private static int idCounter;

    public Antelope(final World world) {
        super(world, 4, 4);
        idCounter++;
        id = idCounter;
    }

    @Override
    protected void action() {
        super.action();
    }

    @Override
    protected void collision(final Map.Entry<Integer, Collection<Organism>> entry) {
        super.collision(entry);
        //todo 50% chance to escape from fight (moves to nearby, unoccupied field)
    }

    @Override
    protected void move() {
        super.move();
    }

    @Override
    protected int randomlyChangePosition(int currentOrganismPosition) {
        int NUMBER_TO_MOVE_LEFT_BY_2 = -2;
        int NUMBER_TO_MOVE_RIGHT_BY_2 = 2;
        int NUMBER_TO_MOVE_UP_BY_2 = -20;
        int NUMBER_TO_MOVE_DOWN_BY_2 = 20;
        int MIN_WORLD_MAP_POSITION = 0;
        int MAX_WORLD_MAP_POSITION = 99;
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;
        int newPosition;

        switch (randomNumber) {
            case 1:
                //Move left
                newPosition = NUMBER_TO_MOVE_LEFT_BY_2;
                break;
            case 2:
                //Move right
                newPosition = NUMBER_TO_MOVE_RIGHT_BY_2;
                break;
            case 3:
                //Move up
                newPosition = NUMBER_TO_MOVE_UP_BY_2;
                break;
            case 4:
                //Move down
                newPosition = NUMBER_TO_MOVE_DOWN_BY_2;
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
    public String toString() {
        return "A" + id;
    }


    @Override
    protected void draw() {

    }

    @Override
    public int compareTo(final Object o) {
        return super.compareTo(o);
    }
}
