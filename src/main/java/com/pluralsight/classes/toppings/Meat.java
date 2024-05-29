package com.pluralsight.classes.toppings;

public class Meat extends PremiumToppings {
    public Meat(String name, double price, boolean extra, int size) {
        super(name, price, extra, size);
    }

    @Override
    public double getPrice() {
        double price = 0;
        double extra = 0;
        if (getSize() == 4 && !isExtra()) {
            price = 1.00;
        } if (getSize() == 4 && isExtra()) {
            price = 1.00;
            extra = 0.50;

        }
        else if (getSize() == 8 && !isExtra()) {
            price = 2.00;
        } else if (getSize() == 8 && isExtra()) {
            price = 2.00;
            extra = 1.00;
        }
        else if (getSize() == 12 && !isExtra()) {
            price = 3.00;
        }
        else if (getSize() == 12 && isExtra()) {
            price = 3.00;
            extra = 1.50;
        }
        return price + extra;
    }

}
