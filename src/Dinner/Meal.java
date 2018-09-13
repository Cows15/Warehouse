package Dinner;

import java.util.ArrayList;

public class Meal {

    Meal(){

    }
    ArrayList<Item> items = new ArrayList<>();

    void addItems(Item item){
        items.add(item);
    }

    double totalCost(){
        double price = 0;

        for(Item iss : items){
            price += iss.price();
        }
        return price;
    }

    void showItems(){
        for(Item a : items){
            System.out.println("Items on your order  " + a.name());
            System.out.println("Total cost of order " + a.price());
        }
    }
}
