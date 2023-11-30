package com.company;

import javax.swing.*;

public class FoodInADish <Food> extends DrawableObj implements Comparable<FoodInADish<Food>>{

    public draw() {

    }


    @Override
    public String toString() {
        return "DrawableObj{" +
                "xCoord=" + xCoord +
                ", yCoord=" + yCoord +
                ", width=" + width +
                ", height=" + height +
                '}';
    }


    @Override
    public int compareTo(FoodInADish<Food> o) {
        return 0;
    }

    @Override
    public void draw() {

    }
}
