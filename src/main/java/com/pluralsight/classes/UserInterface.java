package com.pluralsight.classes;

import com.pluralsight.classes.sides.Chips;
import com.pluralsight.classes.sides.Drink;
import com.pluralsight.classes.toppings.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
   List<Toppings> toppings = new ArrayList<>();
   List<Drink> drinks = new ArrayList<>();
   List<Chips> chips = new ArrayList<>();

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
        boolean addingRegularToppings = true;
        while (addingRegularToppings) {
            System.out.println("Select your toppings (type the number to add):" +
                    "\n1). Lettuce" +
                    "\n2). Peppers" +
                    "\n3). Onions" +
                    "\n4). Tomatoes" +
                    "\n5). Jalapenos" +
                    "\n6). Cucumbers" +
                    "\n7). Pickles" +
                    "\n8). Guacamole" +
                    "\n9). Mushrooms" +
                    "\n10). Done adding toppings");
            int toppingOfChoice = scanner.nextInt();
            scanner.nextLine();

            if (toppingOfChoice == 10) {
                addingRegularToppings = false;
            } else {
                String toppingName = "";
                switch (toppingOfChoice) {
                    case 1: toppingName = "Lettuce"; break;
                    case 2: toppingName = "Peppers"; break;
                    case 3: toppingName = "Onions"; break;
                    case 4: toppingName = "Tomatoes"; break;
                    case 5: toppingName = "Jalapenos"; break;
                    case 6: toppingName = "Cucumbers"; break;
                    case 7: toppingName = "Pickles"; break;
                    case 8: toppingName = "Guacamole"; break;
                    case 9: toppingName = "Mushrooms"; break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }

                toppings.add(new RegularToppings(toppingName));
            }
            boolean addingSauces = true;
            while (addingSauces) {
                System.out.println("Select your sauces (type the number to add):" +
                        "\n1). Mayo" +
                        "\n2). Mustard" +
                        "\n3). Ketchup" +
                        "\n4). Ranch" +
                        "\n5). Thousand Islands" +
                        "\n6). Vinaigrette" +
                        "\n7). Done adding sauces");
                int sauceOfChoice = scanner.nextInt();
                scanner.nextLine();

                if (sauceOfChoice == 7) {
                    addingSauces = false;
                } else {
                    String sauceName = "";
                    switch (sauceOfChoice) {
                        case 1: sauceName = "Mayo"; break;
                        case 2: sauceName = "Mustard"; break;
                        case 3: sauceName = "Ketchup"; break;
                        case 4: sauceName = "Ranch"; break;
                        case 5: sauceName = "Thousand Islands"; break;
                        case 6: sauceName = "Vinaigrette"; break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            continue;
                    }

                    toppings.add(new Sauce(sauceName));
                }
            }
        }



    }
    public void addDrink() {
        boolean addingDrinks = true;
        while (addingDrinks) {
            System.out.println("Select your drink (type the number to add):" +
                    "\n1). Water" +
                    "\n2). Soda" +
                    "\n3). Juice" +
                    "\n4). Tea" +
                    "\n5). Coffee" +
                    "\n6). Done adding drinks");
            int drinkOfChoice = scanner.nextInt();
            scanner.nextLine();

            if (drinkOfChoice == 6) {
                addingDrinks = false;
            } else {
                String drinkName = "";
                switch (drinkOfChoice) {
                    case 1: drinkName = "Water"; break;
                    case 2: drinkName = "Soda"; break;
                    case 3: drinkName = "Juice"; break;
                    case 4: drinkName = "Tea"; break;
                    case 5: drinkName = "Coffee"; break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        continue;
                }

                System.out.println("Select the size of your drink:" +
                        "\nSmall" +
                        "\nMedium" +
                        "\nLarge");
                String drinkSize = scanner.nextLine();

                drinks.add(new Drink(drinkName, drinkSize));
            }
        }
        
    }

    public void addChips() {

    }

    public void checkout() {

    }

    public void cancelOrder() {

    }
}




