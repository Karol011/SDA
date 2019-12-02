package listopad30.Food;

public class Vegan implements Eaters {
    private double mealWeight = 0;
    private int numberOfMeals = 0;

    @Override
    public void eat(Food food) {
        if (food.getFoodType() == FoodType.FRUITS) {
            setNumberOfMeals(getNumberOfMeals()+1);

        }
    }

    @Override
    public int howManyMeals(int howManyMeals) {
        return 0;
    }

    @Override
    public double howMuchGramsEaten(double howmuchGrams) {
        return 0;
    }

    public double getMealWeight() {
        return mealWeight;
    }

    public void setMealWeight(double mealWeight) {
        this.mealWeight = mealWeight;
    }

    public int getNumberOfMeals() {
        return numberOfMeals;
    }

    public void setNumberOfMeals(int numberOfMeals) {
        this.numberOfMeals = numberOfMeals;
    }
}
