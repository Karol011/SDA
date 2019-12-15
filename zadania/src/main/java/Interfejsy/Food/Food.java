package Interfejsy.Food;

public class Food {
    String foodName;
    Enum foodType;
    double weight;

    public Food(String foodName, Enum foodType, double weight) {
        this.foodName = foodName;
        this.foodType = foodType;
        this.weight = weight;
    }

    public String getFoodName() {
        return foodName;
    }

    public Enum getFoodType() {
        return foodType;
    }

    public double getWeight() {
        return weight;
    }
}
