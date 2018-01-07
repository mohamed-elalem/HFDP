package com.company;

public class PepperoniPizza extends Pizza {

    public PepperoniPizza() {
        super.setName("Pepperoni");
        super.setDescription("Never tried it");
    }

    @Override
    public Pizza makePizza() throws CloneNotSupportedException {
        Pizza pizza = (Pizza) super.clone();

        /**
         * Adding other stuff before returning
         */

        return pizza;
    }
}
