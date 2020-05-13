package Obiektowe.WorldSimulator.Plant;

import Obiektowe.WorldSimulator.Organism;
import Obiektowe.WorldSimulator.World;
import lombok.Data;

import java.util.Collection;
import java.util.Map;

//mlecz
public class SowThistle extends Plant {
    protected int id;
    protected static int idCounter;

    public SowThistle(final World world) {
        super(world);
        idCounter++;
        id = idCounter;
    }

    @Override
    protected void action() {
        super.action();
    }

    @Override
    protected void spread() {
        final int NUMBER_OF_SPREADING_TRIES = 3;
         for (int i = 0; i < NUMBER_OF_SPREADING_TRIES; i++) {
             super.spread();
         }
    }

    @Override
    protected void collision(final Map.Entry<Integer, Collection<Organism>> entry) {
        super.collision(entry);
    }

    @Override
    protected void draw() {
        super.draw();
    }

    @Override
    public String toString() {
        return "S" + id;
    }

    @Override
    public int compareTo(final Object o) {
        return super.compareTo(o);
    }
}
