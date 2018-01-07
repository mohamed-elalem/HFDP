package com.company;

public abstract class Pizza implements PizzaPrototype {
    private String name, description;
    private ServeBehavior serveBehavior;

    public void setServeBehavior(ServeBehavior serveBehavior) {
        this.serveBehavior = serveBehavior;
    }

    public void serve() {
        this.serveBehavior.serve();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.description;
    }
}
