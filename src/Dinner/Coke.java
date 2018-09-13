package Dinner;

public class Coke extends Drinks {
    @Override
    public double price() {
        return 3.10;
    }

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public String type() {
        return "Soft Drink";
    }
}
