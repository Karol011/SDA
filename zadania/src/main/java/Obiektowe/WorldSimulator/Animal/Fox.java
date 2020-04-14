package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.World;
import lombok.Data;

import java.util.Random;

@Data
public class Fox extends Animal {
    protected int id;
    protected static int idCcounter;
    private boolean isAdded = false;


    public Fox(final World world, final int strength, final int speed) {
        super(world, strength, speed);
        idCcounter++;
        id = idCcounter;
    }

    @Override
    protected void action() {
        checkIfOrganismWasAddedToWorldMap();
        move();
    }

    @Override
    protected void collision() {

    }

    @Override
    protected void move() {
        int xPos = 0;
        int yPos = 0;

        for (int i = 0; i < world.getWorldMap().length; i++) {
            for (int j = 0; j < world.getWorldMap()[i].length; j++) {
                if (world.getWorldMap()[i][j] != null && world.getWorldMap()[i][j].equals(this)) {
                    xPos = i;
                    yPos = j;
                    world.getWorldMap()[i][j] = null;
                }
            }
        }

        world.getWorldMap()[randomlyChangePosition(xPos)][randomlyChangePosition(yPos)] = this;

       /* if (xPos == 0 && yPos == 0) {
            world.getWorldMap()[xPos][yPos] = this;
            System.out.println(this.toString() + " didn't change his position, because of map limit");
        } else if (xPos == 0 || yPos == 0) {
            if (xPos == 0) {
                world.getWorldMap()[xPos][yPos - 1] = this;
                System.out.println("new position of " + this.toString() + " is " + (xPos) + "," + (yPos - 1));
            }
            if (yPos == 0) {
                world.getWorldMap()[xPos - 1][yPos] = this;
                System.out.println("new position of " + this.toString() + " is " + (xPos - 1) + "," + yPos);
            }
        } else {
            world.getWorldMap()[xPos - 1][yPos - 1] = this;
            System.out.println("new position of " + this.toString() + " is " + (xPos - 1) + "," + (yPos - 1));
        }*/
    }

    private int randomlyChangePosition(int pos) {
        Random random = new Random();
        int newXPos;
        newXPos = (random.nextInt(3) - 1) + pos;
        if (newXPos > 9) {
            newXPos = 9;
        }
        if (newXPos < 0) {
            newXPos = 0;
        }
        return newXPos;
    }

    @Override
    protected void draw() {

    }

    protected void checkIfOrganismWasAddedToWorldMap() {
        if (!isAdded) {
            getWorld().addOrganismToWorldMap(this);
            isAdded = true;
        }
    }

    @Override
    public String toString() {
        return "Fox" + id;
    }

}
