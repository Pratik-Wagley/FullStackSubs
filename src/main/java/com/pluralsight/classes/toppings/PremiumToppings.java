package com.pluralsight.classes.toppings;

public class PremiumToppings extends Toppings{
    private boolean extra;
    private int size;

    public PremiumToppings(String name, double price, boolean extra, int size) {
        super(name, price);
        this.extra = extra;
        this.size = size;
    }

    public boolean isExtra() {
        return extra;
    }

    public void setExtra(boolean extra) {
        this.extra = extra;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
