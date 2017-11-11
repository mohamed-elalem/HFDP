package com.company;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        super.notifyObservers();
    }
}
