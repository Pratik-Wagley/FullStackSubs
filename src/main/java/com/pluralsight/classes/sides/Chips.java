package com.pluralsight.classes.sides;

public class Chips extends Extras {
    public Chips(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return 1.50;
    }
}
