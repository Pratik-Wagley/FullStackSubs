package com.pluralsight.classes;

import com.pluralsight.classes.toppings.Toppings;

import java.util.List;

public class Sandwich {
    private int size;
    private String breadType;
    private List<Toppings> toppings;
    private boolean toasted;

    public Sandwich(int size, String breadType, List<Toppings> toppings, boolean toasted) {
        this.size = size;
        this.breadType = breadType;
        this.toppings = toppings;
        this.toasted = toasted;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    public List<Toppings> getToppings() {
        return toppings;
    }

    public void setToppings(List<Toppings> toppings) {
        this.toppings = toppings;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
}
