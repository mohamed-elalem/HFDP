package com.company;

/**
 * Concrete Component
 */

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super.description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.75;
    }
}
