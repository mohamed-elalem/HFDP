package com.company;

public class DeliveryServe implements ServeBehavior {
    @Override
    public void serve() {
        System.out.println("Delivery serving");
    }
}
