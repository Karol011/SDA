package Obiektowe.WorldSimulator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public abstract class Organism {

    protected World world;
    protected int strength;
    protected int speed;
    protected int worldCoordinateX;
    protected int worldCoordinateY;
    protected int coordinates;

    public Organism(final World world, final int strength, final int speed,
                    final int worldCoordinateX, final int worldCoordinateY) {
        this.world = world;
        this.strength = strength;
        this.speed = speed;
        this.worldCoordinateX = worldCoordinateX;
        this.worldCoordinateY = worldCoordinateY;
        this.coordinates = world.worldMap[worldCoordinateX][worldCoordinateY];
        getWorld().getOrganisms().add(this);
    }


    protected abstract void action();

    protected abstract void collision();

    protected abstract void draw();


}
