package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.World;

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
    protected void move() {
        super.move();
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
