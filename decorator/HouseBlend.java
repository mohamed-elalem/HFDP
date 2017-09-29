package com.company;

/**
 * Concrete Component
 */

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.description = "House Blend Coffe";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
