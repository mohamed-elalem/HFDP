package com.company;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
        super.notifyObservers();
    }
}
