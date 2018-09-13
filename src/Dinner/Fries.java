package Dinner;

public class Fries implements Item {
    @Override
    public double price() {
        return 3.50;
    }

    @Override
    public String name() {
        return "Fries";
    }
}
