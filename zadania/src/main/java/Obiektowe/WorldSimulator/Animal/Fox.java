package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.World;
import lombok.Data;

import java.util.Random;

@Data
public class Fox extends Animal {
    protected int id;
    protected static int idCcounter;


    public Fox(final World world, final int strength, final int speed, final int worldCoordinateX) {
        super(world, strength, speed, worldCoordinateX);
        idCcounter++;
        id = idCcounter;

        //getWorld().getOrganisms().add(this);
        // this.coordinates = world.worldMap[worldCoordinateX][worldCoordinateY];
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
        // int actualYPos = this.getWorldCoordinateY();
        int newRandomlyGeneratedXPos = this.getWorldCoordinateX() + new Random().nextInt(3) - 1;
        //int newRandomlyGeneratedYPos = this.getWorldCoordinateY() + new Random().nextInt(3) - 1;

        //if (newRandomlyGeneratedXPos == world.getWorldMap()) {


        this.setWorldCoordinateX(this.getWorldCoordinateX() + new Random().nextInt(3) - 1);
        // this.setWorldCoordinateY(this.getWorldCoordinateY() + new Random().nextInt(3) - 1);
        System.out.println("new position of " + this.toString() + " is " + getWorldCoordinateX());
    }


    @Override
    protected void draw() {

    }

    @Override
    public String toString() {
        return "Fox" + id;
    }


}
