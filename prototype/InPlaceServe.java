package com.company;

public class InPlaceServe implements ServeBehavior {
    @Override
    public void serve() {
        System.out.println("Served in place");
    }
}
