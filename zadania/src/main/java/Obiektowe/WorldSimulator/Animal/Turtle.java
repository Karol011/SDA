package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.Organism;
import Obiektowe.WorldSimulator.World;

import java.util.Collection;
import java.util.Map;


public class Turtle extends Animal implements Comparable {
    protected int id;
    protected static int idCounter;

    public Turtle(final World world) {
        super(world, 2, 1);
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
        //todo repels attackers (they must return to previous field), that have strength < 5
    }

    @Override
    protected void move() {
        final double CHANCE_THAT_TURTLE_WILL_NOT_WANT_TO_MOVE = 0.75;

        if (Math.random() > CHANCE_THAT_TURTLE_WILL_NOT_WANT_TO_MOVE) {
            super.move();
        } else {
            System.out.println(this.toString() + " was too lazy to move");
        }
    }

    @Override
    protected void draw() {

    }

    @Override
    public String toString() {
        return "T" + id;
    }

    @Override
    public int compareTo(final Object o) {
        return super.compareTo(o);
    }
}
