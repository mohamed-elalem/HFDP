package com.company;

public class QuackCounter extends Duck {

    private Quackable duck;
    private static int quacks = 0;

    public QuackCounter(Quackable duck)
    {
        this.duck = duck;
        super.observable = new Observable(this);
    }

    @Override
    public void quack() {
        duck.quack();
        quacks++;
    }

    public static int getNumberOfQuacks() {
        return quacks;
    }
}
