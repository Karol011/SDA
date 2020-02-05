package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.Organism;

public abstract class Animal extends Organism {


    public Animal(int strength, int speed, int[][] worldCoordinates) {
        super(strength, speed, worldCoordinates);
    }


    @Override
    protected abstract void action();

    @Override
    protected abstract void collision();

    @Override
    protected abstract void draw();
}
