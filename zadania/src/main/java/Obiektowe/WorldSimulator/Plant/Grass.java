package Obiektowe.WorldSimulator.Plant;

public class Grass extends Plant {


    public Grass(final int strength, final int worldCoordinateX, final int worldCoordinateY, final double chanceToSpread) {
        super(strength, worldCoordinateX, worldCoordinateY, chanceToSpread);
    }

    @Override
    protected void action() {

    }

    @Override
    protected void collision() {

    }

    @Override
    protected void draw() {

    }

    @Override
    protected void spread() {
        if (Math.ceil(Math.random() * 100) < chanceToSpread) {//if random number is lower than chance to spread then spread
            //todo
        }
    }
}
