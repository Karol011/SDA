package Obiektowe.WorldSimulator.Plant;

import Obiektowe.WorldSimulator.Organism;
import Obiektowe.WorldSimulator.World;

import java.util.Collection;
import java.util.Map;

public class Grass extends Plant {
    protected int id;
    protected static int idCounter;


    public Grass(final World world) {
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
        super.spread();
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
        return "G"+id;
    }
}
