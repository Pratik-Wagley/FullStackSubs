package com.pluralsight.classes;

import com.pluralsight.classes.sides.Chips;
import com.pluralsight.classes.toppings.Cheese;
import com.pluralsight.classes.toppings.Meat;
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
        //i need to create a customer object
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
                            break;
                        case 2:
                            meatName = "Ham";
                            break;
                        case 3:
                            meatName = "Salami";
                            break;
                        case 4:
                            meatName = "Roast beef";
                            break;
                        case 5:
                            meatName = "Chicken";
                            break;
                        case 6:
                            meatName = "Bacon";
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            continue;
                    }


                    System.out.println("Would you like extra " + meatName + "? (Yes/No)");
                    boolean extra = scanner.nextLine().equalsIgnoreCase("Yes");

                    toppings.add(new Meat(meatName, extra, size));
                }
            }

            boolean addingCheese = true;
            while (addingCheese) {
                System.out.println("What is your cheese of choice?" +
                        "\n1). American" +
                        "\n2). Provolone" +
                        "\n3). Cheddar" +
                        "\n4). Swiss" +
                        "\n5). Done adding cheese");
                int cheeseOfChoice = scanner.nextInt();
                scanner.nextLine();

                if (cheeseOfChoice == 5) {
                    addingCheese = false;
                } else {
                    String cheeseName = "";
                    switch (cheeseOfChoice) {
                        case 1: cheeseName = "American"; break;
                        case 2: cheeseName = "Provolone"; break;
                        case 3: cheeseName = "Cheddar"; break;
                        case 4: cheeseName = "Swiss"; break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            continue;
                    }

                    System.out.println("Would you like extra " + cheeseName + "? (Yes/No)");
                    boolean extra = scanner.nextLine().equalsIgnoreCase("Yes");

                    toppings.add(new Cheese(cheeseName, extra, size));
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




