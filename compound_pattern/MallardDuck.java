package com.company;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        super.notifyObservers();
    }
}
