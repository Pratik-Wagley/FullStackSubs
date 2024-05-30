package com.pluralsight.classes.toppings;

public class Sauce extends Toppings{

    public Sauce(String name) {
        super(name, 0);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
