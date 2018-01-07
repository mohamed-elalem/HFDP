package com.company;

public class PizzaFactory {
    private Pizza pizza;
    private Pizza pepperoni;
    private Pizza margritta;

    public PizzaFactory(Pizza margritta, Pizza pepperoni) {
        this.pepperoni = pepperoni;
        this.margritta = margritta;
    }


    public Pizza getPizza(PizzaEnum pizzaType) {

        switch(pizzaType) {
            case MARGRITTA:
                this.pizza = this.margritta;
                break;
            case PEPPERONI:
                this.pizza = this.pepperoni;
                break;
        }
        try {
            pizza = this.pizza.makePizza();
        } catch (CloneNotSupportedException ex) {
            System.err.println("Unsupported Cloning");
        }
        return this.pizza;
    }
}
