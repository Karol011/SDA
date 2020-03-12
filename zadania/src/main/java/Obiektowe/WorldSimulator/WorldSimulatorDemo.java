package Obiektowe.WorldSimulator;

import Obiektowe.WorldSimulator.Animal.Fox;

import java.util.ArrayList;
import java.util.List;

public class WorldSimulatorDemo {

    public static void main(String[] args) {
        List<Organism> orgasisms = new ArrayList<>();
        int[][] worldCoordinates = new int[10][10];
        World world = new World(orgasisms,worldCoordinates);
        Organism fox = new Fox(5,5);
        orgasisms.add(fox);

        world.makeTurn();
        world.makeTurn();
        world.makeTurn();
        world.makeTurn();
    }
}
