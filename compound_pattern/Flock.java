package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock extends Duck {

    private ArrayList<Quackable> quackers;

    public Flock() {
        quackers = new ArrayList<>();
        super.observable = new Observable(this);
    }

    public void add(Quackable quacker) {
        this.quackers.add(quacker);
    }

    public void addAll(Quackable... quackers) {
        for(Quackable quacker : quackers) {
            this.quackers.add(quacker);
        }
    }

    @Override
    public void quack() {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()) {
            Quackable quacker = (Quackable) iterator.next();
            quacker.quack();
        }
        super.notifyObservers();
    }
}
