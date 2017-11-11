package com.company;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
