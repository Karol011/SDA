package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.World;
import lombok.Data;

import java.util.Random;

@Data
public class Fox extends Animal {

    public Fox(final World world, final int strength, final int speed, final int worldCoordinateX, final int worldCoordinateY) {
        super(world, strength, speed, worldCoordinateX, worldCoordinateY);
    }

    @Override
    protected void action() {
        move();

    }

    @Override
    protected void collision() {


    }

    @Override
    protected void move() {
        int actualXPos = this.getWorldCoordinateX();
        int actualYPos = this.getWorldCoordinateY();
        int newRandomlyGeneratedXPos = this.getWorldCoordinateX() + new Random().nextInt(3) - 1;
        int newRandomlyGeneratedYPos = this.getWorldCoordinateY() + new Random().nextInt(3) - 1;

        //if (newRandomlyGeneratedXPos == world.getWorldMap()) {


        this.setWorldCoordinateX(this.getWorldCoordinateX() + new Random().nextInt(3) - 1);
        this.setWorldCoordinateY(this.getWorldCoordinateY() + new Random().nextInt(3) - 1);
        System.out.println("new position is " + this.toString() + getWorldCoordinateX() + "," + getWorldCoordinateY());
    }


    @Override
    protected void draw() {

    }

    @Override
    public String toString() {
        return "Fox";
    }


}
