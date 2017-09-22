package com.company;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public String swim() {
        return "All ducks float, even decoys!";
    }

    public abstract String display();


    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public String preformFly() {
        return this.flyBehavior.fly();
    }

    public String preformQuack() {
        return this.quackBehavior.quack();
    }
}
