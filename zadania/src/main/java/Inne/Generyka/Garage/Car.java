package Inne.Generyka.Garage;

import java.util.Objects;

public abstract class Car {
    protected String mark;
    protected String model;
    protected String color;

    public Car(String mark, String model, String color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getMark(), car.getMark()) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }


    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void changeColor(String color) {

    }

    public String getMark() {
        return mark;
    }
}
