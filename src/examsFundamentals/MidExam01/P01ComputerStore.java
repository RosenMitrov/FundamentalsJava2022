package examsFundamentals.MidExam01;

import java.util.Scanner;

//created by R.M.
public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPrice = 0;
        while (!input.equals("special") && !input.equals("regular")) {
            double price = Double.parseDouble(input);
            if (price < 0) {
                System.out.println("Invalid price!");
                input = scanner.nextLine();
                continue;
            }
            totalPrice += price;

            input = scanner.nextLine();
        }
        double taxes = totalPrice * 0.20;
        double totalPriceWithTaxes = totalPrice + taxes;
        if (totalPrice == 0) {
            System.out.println("Invalid order!");
        } else if (input.equals("special")) {
            totalPriceWithTaxes -= totalPriceWithTaxes * 0.10;
            printReceipt(totalPrice, taxes, totalPriceWithTaxes);
        } else {
            printReceipt(totalPrice, taxes, totalPriceWithTaxes);
        }
    }

    private static void printReceipt(double totalPrice, double taxes, double totalPriceWithTaxes) {
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$%n", totalPrice);
        System.out.printf("Taxes: %.2f$%n", taxes);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$%n", totalPriceWithTaxes);
    }
}
/*
Write a program that prints you a receipt for your new computer.
You will receive the parts' prices (without tax) until you receive what type of customer this is - special or regular.
Once you receive the type of customer you should print the receipt.
The taxes are 20% of each part's price you receive.
If the customer is special, he has a 10% discount on the total price with taxes.
If a given price is not a positive number, you should print "Invalid price!" on the console and continue with the next price.
If the total price is equal to zero, you should print "Invalid order!" on the console.
Input
•	You will receive numbers representing prices (without tax) until command "special" or "regular":

Output
•	The receipt should be in the following format:
"Congratulations you've just bought a new computer!
Price without taxes: {total price without taxes}$
Taxes: {total amount of taxes}$
-----------
Total price: {total price with taxes}$"

Note: All prices should be displayed to the second digit after the decimal point!
The discount is applied only on the total price. Discount is only applicable to the final price!

 */