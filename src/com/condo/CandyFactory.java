package com.condo;

import java.util.ArrayList;

public abstract class CandyFactory {

    public abstract Candy getCandy(String type);

    public  ArrayList getCandyPackage(int quantity, String type){
        Candy candy = getCandy(type);


        ArrayList candyPackage = candy.makeCandy(quantity);

        return candyPackage;
    }
}
