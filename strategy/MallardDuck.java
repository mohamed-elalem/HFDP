package com.company;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super.flyBehavior = new FlyWithWings();
        super.quackBehavior = new Quack();
    }

    @Override
    public String display() {
        return "I'm a mallard duck";
    }
}
