package Zgapa;

import Obiektowe.WorldSimulator.Animal.Fox;
import Obiektowe.WorldSimulator.Organism;
import Obiektowe.WorldSimulator.World;

import java.util.LinkedHashMap;
import java.util.Map;

public class dfsdf {
    public static void main(String[] args) {

        Map<Organism, Integer> mapa = new LinkedHashMap<>();

        Organism fox = new Fox(new World(),10,10);
        Organism foxxy = new Fox(new World(),10,10);

        mapa.put(fox, 12);
        mapa.put(foxxy, 12);

        mapa.entrySet().stream().forEach(System.out::println);


    }
}
