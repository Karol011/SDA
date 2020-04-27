package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.World;

public class Antelope extends Animal implements Comparable {
    protected int id;
    protected static int idCcounter;

    public Antelope(final World world, final int strength, final int speed) {
        super(world, strength, speed);
        idCcounter++;
        id = idCcounter;
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
    protected void collision() {

    }

    @Override
    protected void draw() {

    }

    @Override
    public int compareTo(final Object o) {
        return super.compareTo(o);
    }
}
