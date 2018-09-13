package com.condo;

/*
FACTORY METHOD PATTERN
By tommydates
 */

public class CandyStore {

    private static final CandyFactory chocFactory = new ChocolateFactory();
    private static final CandyFactory hardFactory = new HardCandyFactory();

    public static void main(String[] args) {
//         CandyFactory.getCandyPackage(12,"Dark","chocolate");
//        CandyFactory.getCandyPackage(10,"Dark","chocolate");
//        CandyFactory.getCandyPackage(8,"Hard","chocolate");
//        CandyFactory.getCandyPackage(18,"Orange","dark");
//        CandyFactory.getCandyPackage(30,"Fudge","soft");

        chocFactory.getCandyPackage(8,"White");
        chocFactory.getCandyPackage(14,"Milk");
        hardFactory.getCandyPackage(10,"Lollipop");






    }
}
