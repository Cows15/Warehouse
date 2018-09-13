package Dinner;

public class MealBuilderPattern {

    public static void main(String[] args) {
        MealBuilder mb = new MealBuilder();


        Meal b = mb.createMeal();
        System.out.print("\n\nNon-Veg Meal");

        b.showItems();
        System.out.print(b.totalCost());

    }
}
