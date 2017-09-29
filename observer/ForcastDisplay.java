package com.company;

/**
* Concrete Observer
*/


public class ForcastDisplay implements Observer, DisplayElement {

    private Subject weatherData;

    public ForcastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("This is a dummy forcasting");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        /**
         * Do nothing i'm not a fortune teller
         */
        display();
    }
}
