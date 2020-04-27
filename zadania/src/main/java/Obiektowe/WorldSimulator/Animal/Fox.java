package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.World;
import lombok.Data;

@Data
public class Fox extends Animal implements Comparable {
    protected int id;
    protected static int idCounter;

    public Fox(final World world, final int strength, final int speed) {
        super(world, strength, speed);
        idCounter++;
        id = idCounter;
    }


    @Override
    protected void collision() {
    }

    @Override
    protected void move() {
        super.move();
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
