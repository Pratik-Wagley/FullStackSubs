package com.pluralsight.classes.toppings;

public class Cheese extends PremiumToppings{
    public Cheese(String name, boolean extra, int size) {
        super(name, 0, extra, size);
        this.setPrice(getSize());
    }
    @Override
    public double getPrice() {
        double price = 0;
        double extra = 0;
        if (getSize() == 4 && !isExtra()) {
            price = .75;
        } else if (getSize() == 4 && isExtra()) {
            price = .75;
            extra = .30;

        }
        else if (getSize() == 8 && !isExtra()) {
            price = 1.50;
        } else if (getSize() == 8 && isExtra()) {
            price = 1.50;
            extra = .60;
        }
        else if (getSize() == 12 && !isExtra()) {
            price = 2.25;
        }
        else if (getSize() == 12 && isExtra()) {
            price = 2.25;
            extra = .90;
        }
        return price + extra;
    }
}
