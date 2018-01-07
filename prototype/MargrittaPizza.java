package com.company;

public class MargrittaPizza extends Pizza {

    public MargrittaPizza() {
        super.setName("Margritta");
        super.setDescription("What i know");
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
