package com.company;

import javax.swing.*;
import java.awt.*;

public class FoodInADish <T> extends DrawableObj implements Comparable<FoodInADish<T>>{

    private T food;
    private String dishcolor;
    private Image[] Food;

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
    public int compareTo(FoodInADish<T> o) {
        if(this.getFood() instanceof Fruit && o.getFood() instanceof Fruit){
            return Double.compare(((Fruit) this.getFood()).getKg(), ((Fruit) o.getFood()).getKg() );
        }else {
            if (this.getFood() instanceof Vegetable && o.getFood() instanceof Vegetable)
                return Double.compare(((Vegetable) this.getFood()).getKg(), ((Vegetable) o.getFood()).getKg());
            else{
                if(Fruit)
                return -1;
                else
                return 1;
            }
        }

    }

    @Override
    public JPanel draw() {
        ImageIcon fi =  new ImageIcon("resources/" + food + ".png");
        ImageIcon di = new ImageIcon("resources/" + dishcolor + ".png");
        JLabel fl = new JLabel(fi);
//        dl = new
        JPanel p = new JPanel();
        p.add(fl);
//        p.add(dl)
        return p;
    }
}
