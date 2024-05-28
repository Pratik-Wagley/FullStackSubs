package com.pluralsight.classes.toppings;

public class PremiumToppings extends Toppings{
    private boolean extra;
    private String size;

    public PremiumToppings(String name, double price, boolean extra, String size) {
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
