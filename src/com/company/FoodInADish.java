package com.company;

import javax.swing.*;

public class FoodInADish <T> extends DrawableObj implements Comparable<FoodInADish<T>>{

    private T food;
    private String dishcolor;

    public T getFood() {
        return food;
    }

    public void setFood(T food) {
        this.food = food;
    }

    public String getDishcolor() {
        return dishcolor;
    }

    public void setDishcolor(String dishcolor) {
        this.dishcolor = dishcolor;
    }

    @Override
    public String toString() {
        return "A "+ food +"in a "+dishcolor+" dish";
    }


    @Override
    public void draw() {

    }

    @Override
    public int compareTo(FoodInADish<T> o) {
        return 0;
    }
}
