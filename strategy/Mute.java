package com.company;

public class Mute implements QuackBehavior {
    @Override
    public String quack() {
        return "<< Silence >>";
    }
}
