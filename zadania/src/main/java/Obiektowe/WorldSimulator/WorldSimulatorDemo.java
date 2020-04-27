package Obiektowe.WorldSimulator;

import Obiektowe.WorldSimulator.Animal.Antelope;
import Obiektowe.WorldSimulator.Animal.Fox;

import java.util.ArrayList;
import java.util.List;

public class WorldSimulatorDemo {

    public static void main(String[] args) {
        World world = new World();
        world.drawWorld();
        Organism fox = new Fox(world, 10, 10);
        Organism foxxy = new Fox(world, 10, 10);
        Organism foxter = new Fox(world, 10, 10);
        Organism foxters = new Fox(world, 10, 10);
        Organism foxtessr = new Fox(world, 10, 10);
        Organism antelope = new Antelope(world, 5, 5);
        Organism antelodpe = new Antelope(world, 5, 5);
        Organism antelosdpe = new Antelope(world, 5, 5);
        Organism antel4ope = new Antelope(world, 5, 5);
        Organism antelop3e = new Antelope(world, 5, 5);


        for (int i = 0; i < 2; i++) {
            world.makeTurn();
            world.drawWorld();
        }
    }
}
