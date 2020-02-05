package Obiektowe.WorldSimulator.Plant;

public class Grass extends Plant {

    public Grass(int strength, int[][] worldCoordinates, double chanceToSpread) {
        super(strength, worldCoordinates, 70);
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
        if (Math.ceil(Math.random() *100) < chanceToSpread) {//if random number is lower than chance to spread then spread
            //todo
        }
    }
}
