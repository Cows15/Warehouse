package com.condo;

import java.util.ArrayList;

public class HardCandyFactory extends CandyFactory {

    @Override
    public Candy getCandy(String section) {
        switch (section) {
            case "Peppermint":
                return new HardCandy();

            case "Candy Cane":
                return new HardCandy();

            case "Lollipop":
                return new HardCandy();

            case "Nerds":
                return new HardCandy();
            default:
                return null;
        }
    }


        @Override
        public ArrayList getCandyPackage(int quantity, String type) {
            Candy candy = getCandy(type);
            if(quantity % 10 != 0) {
                System.out.println("Hard candy must be packaged in multiples of 10.");
                return null;
            }
            ArrayList candyPackage = candy.makeCandy(quantity);
            return candyPackage;
        }
}
