package com.condo;

import java.util.ArrayList;

public class HardCandy extends Candy {
    @Override
    ArrayList<Candy> makeCandy(int quantity) {
        ArrayList hardCandyPack = new ArrayList<>();
        for(int i =1; i <=quantity;i++){
            HardCandy hardCandy = new HardCandy();
            hardCandyPack.add(hardCandy);

        }
        System.out.println("Amount of " + quantity + " Hard candy has been made!");
        return hardCandyPack;
    }
}
