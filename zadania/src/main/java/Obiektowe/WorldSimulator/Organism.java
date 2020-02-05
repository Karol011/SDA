package Obiektowe.WorldSimulator;

import lombok.Getter;

@Getter
public abstract class Organism {
    int strength;
    int speed;
    int[][] worldCoordinates;


    public Organism(int strength, int speed, int[][] worldCoordinates) {
        this.strength = strength;
        this.speed = speed;
        this.worldCoordinates = worldCoordinates;
    }

    protected abstract void action();

    protected abstract void collision();

    protected abstract void draw();
}
