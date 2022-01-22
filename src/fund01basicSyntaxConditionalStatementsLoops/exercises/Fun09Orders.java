package fund01basicSyntaxConditionalStatementsLoops.exercises;
//created by R.M.

import java.util.Scanner;

public class Fun09Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfOrders = Integer.parseInt(scanner.nextLine());

        double totalPriceCoffee = 0.00;
        while (countOfOrders > 0) {
            double currentPriceCoffee = 0.00;
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());

            //((daysInMonth * capsulesCount) * pricePerCapsule)
            currentPriceCoffee = days * countCapsules * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", currentPriceCoffee);
            totalPriceCoffee += currentPriceCoffee;

            countOfOrders--;
        }
        System.out.printf("Total: $%.2f", totalPriceCoffee);
    }
}
