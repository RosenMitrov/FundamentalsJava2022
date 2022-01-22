package fund01basicSyntaxConditionalStatementsLoops.MoreExercises;
//created by R.M.

import java.util.Scanner;

public class Fun03GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double spentMoney = 0.00;

        String input = scanner.nextLine();

        while (!input.equals("Game Time")) {
            double currentGamePrice = 0.00;

            boolean isFound = true;

            switch (input) {
                case "OutFall 4":
                    currentGamePrice = 39.99;
                    break;
                case "CS: OG":
                    currentGamePrice = 15.99;
                    break;
                case "Zplinter Zell":
                    currentGamePrice = 19.99;
                    break;
                case "Honored 2":
                    currentGamePrice = 59.99;
                    break;
                case "RoverWatch":
                    currentGamePrice = 29.99;
                    break;
                case "RoverWatch Origins Edition":
                    currentGamePrice = 39.99;
                    break;
                default:
                    isFound = false;
                    break;
            }
            if (!isFound) {
                System.out.println("Not found");
            } else {
                balance -= currentGamePrice;
                spentMoney += currentGamePrice;
                if (balance == 0) {
                    System.out.printf("Bought %s%n", input);
                    System.out.println("Out of money!");
                    break;
                }
                if (balance < 0) {
                    System.out.println("Too Expensive");
                    balance += currentGamePrice;
                    spentMoney -= currentGamePrice;
                } else {
                    System.out.printf("Bought %s%n", input);
                }
            }
            input = scanner.nextLine();
        }
        if (balance != 0) {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spentMoney, balance);
        }
    }
}
