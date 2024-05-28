package com.pluralsight.classes.sides;

import com.pluralsight.interfaces.IGetPrice;

public class Drink extends Extras implements IGetPrice {
    private String size;

    public Drink(String name, String size) {
        super(name);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
        double price = 0;
        if (getSize().equals("Small")) {
            price = 2.00;
        } else if (getSize().equals("Medium")) {
            price = 2.50;
        } else if (getSize().equals("Large")) {
            price = 3.00;
        }
        return price;
    }
}
