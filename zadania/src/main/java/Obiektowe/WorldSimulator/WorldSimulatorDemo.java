package Obiektowe.WorldSimulator;

import Obiektowe.WorldSimulator.Animal.Antelope;
import Obiektowe.WorldSimulator.Animal.Fox;
import Obiektowe.WorldSimulator.Animal.Turtle;
import Obiektowe.WorldSimulator.Plant.Grass;
import Obiektowe.WorldSimulator.Plant.Plant;
import Obiektowe.WorldSimulator.Plant.SowThistle;

import java.util.ArrayList;
import java.util.List;

public class WorldSimulatorDemo {

    public static void main(String[] args) {
        World world = new World();
        Organism fox1 = new Fox(world);
        Organism fox2 = new Fox(world);
        Organism fox3 = new Fox(world);
        Organism antelope = new Antelope(world);
        Organism antelodpe = new Antelope(world);
        Organism antelosdpe = new Antelope(world);
        Organism turkte = new Turtle(world);
        Organism tsurkte = new Turtle(world);
        Organism grass = new Grass(world);
        Organism grass1ss = new Grass(world);
        Organism grassd = new Grass(world);
        Organism ghgh = new SowThistle(world);



        for (int i = 0; i < 2; i++) {
            world.makeTurn();
            world.drawWorld();
        }
    }
}
