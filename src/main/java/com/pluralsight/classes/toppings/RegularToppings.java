package com.pluralsight.classes.toppings;

public class RegularToppings extends Toppings{
    public RegularToppings(String name) {
        super(name, 0);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
