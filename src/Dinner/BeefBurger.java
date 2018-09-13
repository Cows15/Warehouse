package Dinner;

public class BeefBurger extends Burger {

    @Override
    public double price() {
        return 7.50;
    }

    @Override
    public String name() {
        return "Beef";
    }
}
