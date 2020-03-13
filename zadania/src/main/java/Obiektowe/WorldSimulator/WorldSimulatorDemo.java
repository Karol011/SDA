package Obiektowe.WorldSimulator;

import Obiektowe.WorldSimulator.Animal.Fox;

import java.util.ArrayList;
import java.util.List;

public class WorldSimulatorDemo {

    public static void main(String[] args) {
        List<Organism> orgasisms = new ArrayList<>();
        World world = new World( 10, 10);
        Organism fox = new Fox(world, 10, 10, 5, 5);
       // orgasisms.add(fox);
        world.addOrganismsToWorldMap();
        world.makeTurn();
        System.out.println(fox.getCoordinates());
        System.out.println(fox.getWorldCoordinateX());
        System.out.println(fox.getWorldCoordinateY());
        world.makeTurn();
        world.makeTurn();
        world.makeTurn();
    }
}
