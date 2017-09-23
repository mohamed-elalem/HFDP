package com.company;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float avgTemperature;
    private float minTemperature = Float.MAX_VALUE;
    private float maxTemperature;
    private int numberOfReadings;
    private float sumOfTemperature;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("min/avg/max: " + minTemperature + "/" + avgTemperature + "/" + maxTemperature);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        maxTemperature = Math.max(temp, this.maxTemperature);
        minTemperature = Math.min(temp, this.minTemperature);
        this.numberOfReadings++;
        this.sumOfTemperature += temp;
        this.avgTemperature = this.sumOfTemperature / this.numberOfReadings;
        display();
    }
}
