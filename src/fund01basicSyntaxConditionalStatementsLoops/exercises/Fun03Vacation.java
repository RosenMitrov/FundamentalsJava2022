package fund01basicSyntaxConditionalStatementsLoops.exercises;
//created by R.M.

import java.util.Scanner;

public class Fun03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleInGroup = Integer.parseInt(scanner.nextLine());
        String typeOfGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0.00;
        double totalPrice = 0.00;
        switch (typeOfGroup) {
            case "Students":
                if (dayOfWeek.equals("Friday")) {
                    price = 8.45;
                } else if (dayOfWeek.equals("Saturday")) {
                    price = 9.80;
                } else if (dayOfWeek.equals("Sunday")) {
                    price = 10.46;
                }
                break;
            case "Business":
                if (dayOfWeek.equals("Friday")) {
                    price = 10.90;
                } else if (dayOfWeek.equals("Saturday")) {
                    price = 15.60;
                } else if (dayOfWeek.equals("Sunday")) {
                    price = 16.00;
                }
                break;
            case "Regular":
                if (dayOfWeek.equals("Friday")) {
                    price = 15.00;
                } else if (dayOfWeek.equals("Saturday")) {
                    price = 20.00;
                } else if (dayOfWeek.equals("Sunday")) {
                    price = 22.50;
                }
                break;
        }
        totalPrice = price * peopleInGroup;

        if (peopleInGroup >= 30 && typeOfGroup.equals("Students")) {
            totalPrice -= totalPrice * 0.15;
        } else if (peopleInGroup >= 100 && typeOfGroup.equals("Business")) {
            totalPrice = totalPrice - price * 10;
        } else if ((10 <= peopleInGroup && peopleInGroup <= 20) && typeOfGroup.equals("Regular")) {
            totalPrice -= totalPrice * 0.05;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
