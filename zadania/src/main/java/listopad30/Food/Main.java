package listopad30.Food;

public class Main {
    public static void main(String[] args) {
        Food eggs = new Food("eggs", FoodType.DAIRY, 70);
        Food steak = new Food("steak", FoodType.MEAT, 200);
        Food bananas = new Food("bananas", FoodType.FRUITS, 150);
        Food margerita = new Food("margerita", FoodType.PIZZA, 1000);

        Food[] food = {eggs, steak, bananas, margerita};
        Krokodyl krokodyl = new Krokodyl();
        Programmer programistaMarcin = new Programmer();

        System.out.println(krokodyl.getHowManyMealsEaten());
        System.out.println(krokodyl.getWeightOfAllMealsEaten());
        krokodyl.eat(bananas);
        krokodyl.eat(steak);
        krokodyl.eat(margerita);
        krokodyl.eat(steak);

        System.out.println(krokodyl.getHowManyMealsEaten());
        System.out.println(krokodyl.getWeightOfAllMealsEaten());

        System.out.println(programistaMarcin.getHowManyMealsEaten());
        System.out.println(programistaMarcin.getWeightOfAllMealsEaten());
        programistaMarcin.eat(bananas);
        programistaMarcin.eat(steak);
        programistaMarcin.eat(margerita);
        programistaMarcin.eat(steak);

        System.out.println(programistaMarcin.getHowManyMealsEaten());
        System.out.println(programistaMarcin.getWeightOfAllMealsEaten());


    }
}

