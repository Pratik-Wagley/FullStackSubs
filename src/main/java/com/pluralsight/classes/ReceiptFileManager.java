package com.pluralsight.classes;

import com.pluralsight.classes.sides.Chips;
import com.pluralsight.classes.sides.Drink;
import com.pluralsight.classes.toppings.Toppings;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReceiptFileManager {
    public void saveReceipt(Order order) {
        String fileName = "receipt_" + order.getCustomer().getName().replaceAll("\\s+", "_") + ".txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Customer Name: " + order.getCustomer().getName() + "\n");
            writer.write("Order Details:\n");
            writer.write("Toppings:\n");
            List<Sandwich> abc = order.getSandwiches();
            for (Sandwich sandwich : abc) {
                writer.write(sandwich.toString());
            }
            writer.write("Drinks:\n");
            for (Drink drink : order.getDrinks()) {
                writer.write(drink.getName()+ " (Size: " + drink.getPrice() + ")\n");
            }
            writer.write("Chips:\n");
            for (Chips chip : order.getChips()) {
                writer.write(chip.getName() + "\n");
            }
            writer.write("Total Price: $" + order.getTotal() + "\n");
            System.out.println("Receipt saved as " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the receipt.");
            e.printStackTrace();
        }
    }
}
