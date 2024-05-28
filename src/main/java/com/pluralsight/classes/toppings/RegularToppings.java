package com.pluralsight.classes.toppings;

public class RegularToppings extends Toppings{
    public RegularToppings(String name, double price) {
        super(name, price);
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
