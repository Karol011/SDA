package Obiektowe.WorldSimulator;

import lombok.Data;

import java.util.*;

@Data
public class World {

    List<Organism> organisms;
    Organism[][] worldMap;

    public World() {
        this.organisms = new ArrayList<>();
        this.worldMap = new Organism[10][10];
        // this.worldMapSizeX = worldMapSizeX;
        //this.worldMapSizeY = worldMapSizeY;
        //WorldMap worldMap = new WorldMap();
    }

    public void addOrganismToWorldMap(Organism o) {
        boolean wasAdded = false;
        Random random = new Random();
        int randomNumber1 = random.nextInt(10);
        int randomNumber2 = random.nextInt(10);

        if (worldMap[randomNumber1][randomNumber2] == null && !wasAdded) {
            worldMap[randomNumber1][randomNumber2] = o;
            wasAdded = true;
        } else {
            randomNumber1 = random.nextInt(10);
            randomNumber2 = random.nextInt(10);
            worldMap[randomNumber1][randomNumber2] = o;
            wasAdded = true;
        }
    }


    public void makeTurn() {
        System.out.println("NEW ROUND");
        for (Organism o : organisms) {
            o.action();
        }
    }
/*
    public boolean defineIfOrganismsOnTheSamePoolAreSameType() {

    }*/

    protected void drawWorld() {
        int counter = 0;
        for (int i = 0; i < worldMap.length; i++) {

            for (int j = 0; j < worldMap[i].length; j++) {
                counter++;
                //System.out.println("Field nr: " + counter);
                if (worldMap[i][j] == null) {
                    System.out.print("-");
                } else {
                    System.out.print(worldMap[i][j].toString() + "");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
