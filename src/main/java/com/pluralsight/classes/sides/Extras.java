package com.pluralsight.classes.sides;

import com.pluralsight.interfaces.IGetPrice;

public class Extras implements IGetPrice {
    private String name;
    private double price;

    public Extras(String name) {
        this.name = name;
        this.price = 1.50;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
