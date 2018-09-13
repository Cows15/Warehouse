package com.condo;

import java.util.ArrayList;

public class DarkChocolate extends Candy {
    @Override
    ArrayList<Candy> makeCandy(int quantity) {
        ArrayList chocPack = new ArrayList();
        for(int i=1; i <= quantity;i++){
            DarkChocolate chocolate = new DarkChocolate();
            chocPack.add(chocolate);
        }
        System.out.println("Amount of " + quantity + " Dark chocolate has been made");
        return chocPack;
    }
}

