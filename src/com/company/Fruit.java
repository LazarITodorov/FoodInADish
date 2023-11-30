package com.company;

public class Fruit extends Food{

  private boolean isReadyToEat = true;

    public boolean isReadyToEat() {
        return isReadyToEat;
    }

    public void setReadyToEat(boolean isReadyToEat) {
        this.isReadyToEat = isReadyToEat;
    }
}
