package Dinner;

public class MealBuilder {
    public Meal createMeal() {
        Meal m = new Meal();
        m.addItems(new ChickenBurger());
        m.addItems(new Fries());
        m.addItems(new Coke());

        return m;
    }
}