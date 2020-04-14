package Obiektowe.WorldSimulator.Animal;

import Obiektowe.WorldSimulator.Organism;
import Obiektowe.WorldSimulator.World;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
@Data
public abstract class Animal extends Organism {


    public Animal(final World world, final int strength, final int speed) {
        super(world, strength, speed);
       // this.coordinates = world.worldMap[worldCoordinateX][worldCoordinateY];
    }

    @Override
    protected void action() {
    }

    @Override
    protected abstract void collision();

 //   protected abstract void move();

    @Override
    protected abstract void draw();

    @Override
    public String toString() {
        return "Animal";
    }
}
