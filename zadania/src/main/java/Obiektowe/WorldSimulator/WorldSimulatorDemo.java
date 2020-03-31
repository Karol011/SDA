package Obiektowe.WorldSimulator;

import Obiektowe.WorldSimulator.Animal.Fox;

import java.util.ArrayList;
import java.util.List;

public class WorldSimulatorDemo {

    public static void main(String[] args) {
        // List<Organism> orgasisms = new ArrayList<>();
        World world = new World(100);
        Organism fox = new Fox(world, 10, 10, 50);
        Organism foxxy = new Fox(world, 10, 10, 65);
        Organism foxter = new Fox(world, 10, 10, 68);
        //  world.getOrganisms().add(fox);
        world.addOrganismsToWorldMap();
        world.makeTurn();
        //System.out.println("coords of fox: " +fox.getCoordinates());
        //System.out.println(fox.getWorldCoordinateX());
        //System.out.println(fox.getWorldCoordinateY());
        world.makeTurn();
        world.addOrganismsToWorldMap();
        world.makeTurn();
        world.addOrganismsToWorldMap();
        //world.makeTurn();
        world.drawWorld();
        world.getOrganisms().stream()
                .filter(o -> o.getWorldCoordinateX() > 40)
                .forEach(System.out::println);
    }
}
