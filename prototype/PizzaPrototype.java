package com.company;

public interface PizzaPrototype extends Cloneable {
    Pizza makePizza() throws CloneNotSupportedException;
}
