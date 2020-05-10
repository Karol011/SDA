package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.Organism;
import Obiektowe.WorldSimulator.World;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class Fox extends Animal implements Comparable {
    protected int id;
    protected static int idCounter;

    public Fox(final World world) {
        super(world, 3, 7);
        idCounter++;
        id = idCounter;
    }


    @Override
    protected void move() {
        super.move();
    }

    @Override
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
                currentOrganismPosition + newPosition <= MAX_WORLD_MAP_POSITION &&
                !desiredFieldIsOccupiedWithStrongerOrganism(newPosition)) {
            return currentOrganismPosition + newPosition;
        } else {
            return currentOrganismPosition;
        }
    }

    private boolean desiredFieldIsOccupiedWithStrongerOrganism(int newPosition) {
       /* final Optional<Integer> strengthOfTheStrongestOrganismInNewPosition = getWorld().getWorldMap().asMap().entrySet().stream()
                .filter(element -> element.getKey() == newPosition)
                .filter(Objects::nonNull)
                .map(Map.Entry::getValue)
                .flatMap(e -> e.stream()
                .max(Comparator.comparingInt(this::compareTo)))
                .collect(Collectors.toList())
                .sort(Comparator.comparingInt(this::compareTo));

        if (strengthOfTheStrongestOrganismInNewPosition.isEmpty()) {//no other organisms on nearby field
            return false;
        } else {
            if (this.getStrength() > strengthOfTheStrongestOrganismInNewPosition.get()) {//fox is stronger than organism on nearby field
                System.out.println("smart at "+ newPosition);
                return false;
            } else {//fox is weaker
                return true;
            }
        }*/
       return false;
    }


    @Override
    protected void draw() {
    }

    @Override
    public String toString() {
        return "F" + id;
    }

    @Override
    public int compareTo(final Object o) {
        return super.compareTo(o);
    }
}
