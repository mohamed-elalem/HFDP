package com.company;

/**
 * Component
 */

public abstract class Beverage {
    protected String description;
    private double cost;

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
