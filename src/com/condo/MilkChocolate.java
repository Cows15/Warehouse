package com.condo;

import java.util.ArrayList;

public class MilkChocolate extends Candy {
    @Override
    ArrayList<Candy> makeCandy(int quantity) {
        ArrayList chocPack = new ArrayList();
        for(int i=1; i <= quantity;i++){
            MilkChocolate chocolate = new MilkChocolate();
            chocPack.add(chocolate);
        }
        System.out.println("Amount of " + quantity + " Milk chocolate has been made");
        return chocPack;
    }
}
