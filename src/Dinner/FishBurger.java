package Dinner;

public class FishBurger extends Burger {

    @Override
    public double price() {
        return 6;
    }

    @Override
    public String name() {
        return "Fish";
    }
}
