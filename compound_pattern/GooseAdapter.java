package com.company;

public class GooseAdapter extends Duck {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        super.observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
        super.notifyObservers();
    }
}
