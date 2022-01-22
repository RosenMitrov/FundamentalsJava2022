package fund01basicSyntaxConditionalStatementsLoops.exercises;

import java.util.Scanner;

public class Fun07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalInsertedMoney = 0.00;

        while (!input.equals("Start")) {
            double currentCoin = Double.parseDouble(input);
            if (currentCoin != 0.1 && currentCoin != 0.2 && currentCoin != 0.5 && currentCoin != 1 && currentCoin != 2) {
                System.out.printf("Cannot accept %.2f%n", currentCoin);
            } else {
                totalInsertedMoney += currentCoin;
            }
            input = scanner.nextLine();
        }
        String products = scanner.nextLine();

        double price = 0.00;
        while (!products.equals("End")) {
            boolean isValid = true;
            switch (products) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    isValid = false;
                    break;

            }
            if (totalInsertedMoney - price < 0) {
                System.out.println("Sorry, not enough money");
            } else {
                if (isValid) {
                    totalInsertedMoney -= price;
                    System.out.printf("Purchased %s%n", products);
                }
            }
            products = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalInsertedMoney);

    }
}
