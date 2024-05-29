package com.pluralsight.classes;

import com.pluralsight.classes.sides.Chips;

import java.util.Scanner;

public class UserInterface { private static Scanner scanner = new Scanner(System.in);
private static boolean running = true;

public static void main(String[] args) {
    while (running) {
        showHomeScreen();
    }
    System.out.println("Exiting application. Goodbye!");
}

private static void showHomeScreen() {
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

private static void showOrderScreen() {
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

private static void addSandwich() {
    System.out.println("Please select your bread: " +
            "\nWhite" +
            "\nWheat" +
            "\nRye" +
            "\nWrap");
    String bread = scanner.nextLine();
    System.out.println("Select your size:" +
            "\n4 in" +
            "\n8 in" +
            "\n12 in");
    int size = scanner.nextInt();
    


}


private static void addDrink() {

}

private static void addChips() {

}

private static void checkout() {

}

private static void cancelOrder() {

}
}
