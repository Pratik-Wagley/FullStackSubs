package com.pluralsight.classes;

import com.pluralsight.classes.sides.Chips;
import com.pluralsight.classes.toppings.PremiumToppings;
import com.pluralsight.classes.toppings.Toppings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);
    private static boolean running = true;

    public void display() {
        while (running) {
            showHomeScreen();
        }
        System.out.println("Exiting application. Goodbye!");
    }

    public void showHomeScreen() {
        System.out.println("Welcome to the Sandwich Shop!");
        System.out.println("1) New Order");
        System.out.println("0) Exit");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                showOrderScreen();
                break;
            case 0:
                running = false;
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    public void showOrderScreen() {
        boolean ordering = true;

        while (ordering) {
            System.out.println("Order Screen");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addSandwich();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    checkout();
                    ordering = false;
                    break;
                case 0:
                    cancelOrder();
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void addSandwich() {
        List<Toppings> toppings = new ArrayList<>();
        boolean addingSandwich = true;
        while (addingSandwich) {
            System.out.println("Please select your bread: " +
                    "\nWhite" +
                    "\nWheat" +
                    "\nRye" +
                    "\nWrap");
            String bread = scanner.nextLine();
            System.out.println("Select your size:" +
                    "\n4in" +
                    "\n8in" +
                    "\n12in");
            int size = scanner.nextInt();
            scanner.nextLine();
            boolean addingMeat = true;
            while (addingMeat) {
                System.out.println("What is your meat of choice?" +
                        "\n1). Steak" +
                        "\n2). Ham" +
                        "\n3). Salami" +
                        "\n4). Roast beef" +
                        "\n5). Chicken" +
                        "\n6). Bacon");
                int meatOfChoice = scanner.nextInt();
                scanner.nextLine();

                if (meatOfChoice == 7) {
                    addingMeat = false;
                } else {
                    String meatName = "";
                    double price = 0.0;

                    switch (meatOfChoice) {
                        case 1:
                            meatName = "Steak";
                            price = 2.50;
                            break;
                        case 2:
                            meatName = "Ham";
                            price = 2.00;
                            break;
                        case 3:
                            meatName = "Salami";
                            price = 1.75;
                            break;
                        case 4:
                            meatName = "Roast beef";
                            price = 2.75;
                            break;
                        case 5:
                            meatName = "Chicken";
                            price = 2.25;
                            break;
                        case 6:
                            meatName = "Bacon";
                            price = 1.50;
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            continue;
                    }


                    System.out.println("Would you like extra " + meatName + "? (Yes/No)");
                    boolean extra = scanner.nextLine().equalsIgnoreCase("Yes");

                    toppings.add(new PremiumToppings(meatName, price, extra, size));
                }
            }
            System.out.println("1). Add another sandwich" +
                    "\n2). Finished adding sandwich");
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                addingSandwich = true;
            } else if (userInput == 2) {
                addingSandwich = false;
            } else {
                System.out.println("Invalid Command");
            }
        }


    }
    public void addDrink() {

    }

    public void addChips() {

    }

    public void checkout() {

    }

    public void cancelOrder() {

    }
}




