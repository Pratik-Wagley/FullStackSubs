package com.pluralsight.classes;

import com.pluralsight.classes.sides.Chips;
import com.pluralsight.classes.sides.Drink;

import java.util.List;

public class Order {
    private List<Sandwich> sandwiches;
    private List<Drink> drinks;
    private List<Chips> chips;
    private Customer customer;

    public Order(List<Sandwich> sandwiches, List<Drink> drinks, List<Chips> chips, Customer customer) {
        this.sandwiches = sandwiches;
        this.drinks = drinks;
        this.chips = chips;
        this.customer = customer;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

//make a calculate total method