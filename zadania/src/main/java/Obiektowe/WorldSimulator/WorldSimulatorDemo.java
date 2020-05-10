package Obiektowe.WorldSimulator;

import Obiektowe.WorldSimulator.Animal.Antelope;
import Obiektowe.WorldSimulator.Animal.Fox;

import java.util.ArrayList;
import java.util.List;

public class WorldSimulatorDemo {

    public static void main(String[] args) {
        World world = new World();
        world.drawWorld();
        Organism fox = new Fox(world);
        Organism foxxy = new Fox(world);
        Organism foxter = new Fox(world);
        Organism foxters = new Fox(world);
        Organism foxtessr = new Fox(world);
        Organism antelope = new Antelope(world);
        Organism antelodpe = new Antelope(world);
        Organism antelosdpe = new Antelope(world);
        Organism antel4ope = new Antelope(world);
        Organism antelop3e = new Antelope(world);
        Organism antelop3de = new Antelope(world);
        Organism antelops3e = new Antelope(world);
        Organism antelop3dde = new Antelope(world);
        Organism antelop3ew = new Antelope(world);
        Organism antelop3ewww = new Antelope(world);


        for (int i = 0; i < 2; i++) {
            world.makeTurn();
            world.drawWorld();
        }
    }
}
