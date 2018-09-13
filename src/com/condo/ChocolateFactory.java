package com.condo;

public class ChocolateFactory extends CandyFactory {

    @Override
    public Candy getCandy(String section) {
        switch (section) {
            case "Milk":
                return new MilkChocolate();

            case "White":
                return new DarkChocolate();

            case "Dark":
                return new DarkChocolate();

            case "Orange":
                return new DarkChocolate();
                default:
                    return null;
        }
    }
}
