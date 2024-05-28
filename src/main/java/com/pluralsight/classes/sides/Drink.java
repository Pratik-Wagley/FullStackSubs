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
}
