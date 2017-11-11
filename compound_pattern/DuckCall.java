package com.company;

public class DuckCall extends Duck {

    public DuckCall() {
        super.observable = new Observable(this);
    }
    @Override
    public void quack() {
        System.out.println("Kwak");
        super.notifyObservers();
    }
}
