package Obiektowe.WorldSimulator.Plant;

import Obiektowe.WorldSimulator.Organism;
import Obiektowe.WorldSimulator.World;

import java.util.Collection;
import java.util.Map;
import java.util.Random;

public abstract class Plant extends Organism implements Comparable {
    double chanceToSpread;

    public Plant(final World world) {
        super(world, 0);
        this.chanceToSpread = 0.5;
    }

    @Override
    protected void action() {
        super.action();
        spread();
    }

    protected void spread() {
        final double CHANCE_TO_SPREAD = 0.25;
        int organismPosition = this.getOrganismPosition();
        if (Math.random() <= CHANCE_TO_SPREAD) {
            createNewPlantNearby(organismPosition, this);
        }
    }

    protected void createNewPlantNearby(int organismPosition, Plant plant) {
        int LEFT_FIELD = -1;
        int RIGHT_FIELD = 1;
        int UP_FIELD = -10;
        int DOWN_FIELD = 10;
        int MIN_WORLD_MAP_POSITION = 0;
        int MAX_WORLD_MAP_POSITION = 99;
        Random random = new Random();
        int randomNumber = random.nextInt(4) + 1;
        int newPosition;

        switch (randomNumber) {
            case 1:
                //Move left
                newPosition = LEFT_FIELD;
                break;
            case 2:
                //Move right
                newPosition = RIGHT_FIELD;
                break;
            case 3:
                //Move up
                newPosition = UP_FIELD;
                break;
            case 4:
                //Move down
                newPosition = DOWN_FIELD;
                break;
            default:
                newPosition = 0;
        }
        if (organismPosition + newPosition >= MIN_WORLD_MAP_POSITION &&
                organismPosition + newPosition <= MAX_WORLD_MAP_POSITION) {
            System.out.println(this.toString() + " is spreading at "+ (organismPosition+newPosition));
            getGetWorld().getWorldMap().put(organismPosition + newPosition, definePlantTypeAndCreateIt(plant));
        }
    }

    private Plant definePlantTypeAndCreateIt(Organism plant) {
        if (plant instanceof Grass) {
            return new Grass(getWorld);
        }
        if (plant instanceof SowThistle) {
            return new SowThistle(getWorld);
        } else {
            throw new PlantTypeNotFoundException("plant type not found");
        }
    }

    @Override
    protected void collision(final Map.Entry<Integer, Collection<Organism>> entry) {
        super.collision(entry);
    }

    @Override
    protected void draw() {

    }

    @Override
    public int compareTo(final Object o) {
        return super.compareTo(o);
    }


}
