package Obiektowe.WorldSimulator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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
    }

    private void checkIfOrganismWasAddedToWorldMap() {
        if (!isAdded) {
            getWorld().addOrganismToWorldMap(this);
            isAdded = true;
        }
    }

    protected void collision() {
        System.out.println("collision!");
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
