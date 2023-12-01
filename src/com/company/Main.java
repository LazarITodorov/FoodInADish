package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<FoodInADish<Food>> dishes = new ArrayList<>();

        FoodInADish<Food> bananaInADish = new FoodInADish<>();
        Fruit banana = new Fruit();
        banana.setName("banana");
        banana.setKg(0.7);
        bananaInADish.setFood(banana);
        bananaInADish.setDishcolor("green");


        dishes.add(bananaInADish);

        Collections.sort(dishes);
    }
}
