package Obiektowe.WorldSimulator.Plant;

import Obiektowe.WorldSimulator.Organism;

public abstract class Plant extends Organism {
double chanceToSpread;


    public Plant(int strength, int[][] worldCoordinates,double chanceToSpread) {
        super(strength, 0, worldCoordinates);
        this.chanceToSpread = chanceToSpread;
    }

    @Override
    protected abstract void action();

    @Override
    protected abstract void collision();

    @Override
    protected abstract void draw();

    protected abstract void spread();


}
