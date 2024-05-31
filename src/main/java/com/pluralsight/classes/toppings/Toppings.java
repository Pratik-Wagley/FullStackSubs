package com.pluralsight.classes.toppings;

public abstract class Toppings {
    private String name;
    private double price;

    public Toppings(String name, double price) {
        this.name = name;
        this.price = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public double getPrice();

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
