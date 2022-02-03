package fund04Methods.lab;

import java.util.Scanner;

//created by R.M.
public class fund05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        switch (product) {
            case "coffee":
                printPrice(quantity, 1.50);
                break;
            case "water":
                printPrice(quantity, 1.00);
                break;
            case "coke":
                printPrice(quantity, 1.40);
                break;
            case "snacks":
                printPrice(quantity, 2.00);
                break;
        }
    }

    public static void printPrice(int quantity, double price) {
        System.out.printf("%.2f", quantity * price);
    }
}
/*
5.	Orders
Write a method that calculates the total price of an order and prints it on the console.
The method should receive one of the following products:
coffee, water, coke, snacks;
and a quantity of the product.
The prices for a single piece of each product are:
•	coffee – 1.50
•	water – 1.00
•	coke – 1.40
•	snacks – 2.00
Print the result rounded to the second decimal place.

 */