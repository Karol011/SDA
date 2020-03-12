package Obiektowe.WorldSimulator.Plant;

import Obiektowe.WorldSimulator.Organism;

public abstract class Plant extends Organism {
    double chanceToSpread;

    public Plant(final int strength, final int worldCoordinateX, final int worldCoordinateY, final double chanceToSpread) {
        super(strength, 0, worldCoordinateX, worldCoordinateY);
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
