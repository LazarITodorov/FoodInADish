package com.company;

import javax.swing.*;
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

        FoodInADish<Food> pepperInADish = new FoodInADish<>();
        Vegetable pepper = new Vegetable();
        pepper.setName("pepper");
        pepper.setKg(0.4);
        pepperInADish.setFood(pepper);
        pepperInADish.setDishcolor("yellow");

        FoodInADish<Food> strawberryInADish = new FoodInADish<>();
        Fruit strawberry = new Fruit();
        strawberry.setName("strawberry");
        strawberry.setKg(0.7);
        strawberryInADish.setFood(strawberry);
        strawberryInADish.setDishcolor("white");

        FoodInADish<Food> blueberryInADish = new FoodInADish<>();
        Fruit blueberry = new Fruit();
        blueberry.setName("blueberry");
        blueberry.setKg(0.7);
        blueberryInADish.setFood(blueberry);
        blueberryInADish.setDishcolor("red");


        dishes.add(bananaInADish);
        dishes.add(pepperInADish);
        dishes.add(strawberryInADish);
        dishes.add(blueberryInADish);

        Collections.sort(dishes);

        JFrame fr = new JFrame();
        for (FoodInADish<Food> currentFD : dishes) {
            JPanel p = currentFD.draw();
            fr.add(p);
        }
        fr.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fr.setVisible(true);

    }
}
