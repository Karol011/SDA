package Interfejsy.Food;

public class Programmer implements Eaters {
    private int howManyMealsEaten;
    private double weightOfAllMealsEaten;

    public Programmer() {
        this.howManyMealsEaten = 0;
        this.weightOfAllMealsEaten = 0;
    }

    @Override
    public void eat(Food food) {
        System.out.println("ale pyszne " + food.getFoodType());
        setHowManyMealsEaten(getHowManyMealsEaten()+1);
        weightOfAllMealsEaten += food.getWeight();
    }

    @Override
    public int howManyMeals(int howManyMeals) {
        return 0;
    }

    @Override
    public double howMuchGramsEaten(double howmuchGrams) {
        return 0;
    }

    public int getHowManyMealsEaten() {
        return howManyMealsEaten;
    }

    public void setHowManyMealsEaten(int howManyMealsEaten) {
        this.howManyMealsEaten = howManyMealsEaten;
    }

    public double getWeightOfAllMealsEaten() {
        return weightOfAllMealsEaten;
    }

    public void setWeightOfAllMealsEaten(double weightOfAllMealsEaten) {
        this.weightOfAllMealsEaten = weightOfAllMealsEaten;
    }
}
