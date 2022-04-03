package finalExamReal;

import java.util.Scanner;

public class P01DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Finish")) {
            String[] data = input.split(" ");
            String command = data[0];

            switch (command) {
                case "Replace":
                    String currentSymbol = data[1];
                    String newSymbol = data[2];
                    getReplaced(message, currentSymbol, newSymbol);
                    System.out.println(message);
                    break;
                case "Cut":
                    int startIndexToCut = Integer.parseInt(data[1]);
                    int endIndexToCut = Integer.parseInt(data[2]);
                    if (isValidIndex(message, startIndexToCut, endIndexToCut)) {
                        getCut(message, startIndexToCut, endIndexToCut);
                        System.out.println(message);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    String upperOrLowerCase = data[1];
                    if (upperOrLowerCase.equals("Upper")) {
                        message = new StringBuilder(message.toString().toUpperCase());
                    } else if (upperOrLowerCase.equals("Lower")) {
                        message = new StringBuilder(message.toString().toLowerCase());
                    }
                    System.out.println(message);
                    break;
                case "Check":
                    String stringToCheck = data[1];
                    if (message.toString().contains(stringToCheck)) {
                        System.out.printf("Message contains %s%n", stringToCheck);
                    } else {
                        System.out.printf("Message doesn't contain %s%n", stringToCheck);
                    }
                    break;
                case "Sum":
                    int startIndexToSum = Integer.parseInt(data[1]);
                    int endIndexToSum = Integer.parseInt(data[2]);
                    if (isValidIndex(message, startIndexToSum, endIndexToSum)) {
                        int sum = getSum(message, startIndexToSum, endIndexToSum);
                        System.out.println(sum);
                    } else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isValidIndex(StringBuilder message, int start, int end) {
        return (start >= 0 && start < message.length()) && (end >= 0 && end < message.length());
    }

    private static void getReplaced(StringBuilder message, String currentSymbol, String newSymbol) {
        int index = message.indexOf(currentSymbol);
        while (index != -1) {
            message.replace(index, index + currentSymbol.length(), newSymbol);
            index = message.indexOf(currentSymbol);
        }
    }

    private static void getCut(StringBuilder message, int startIndexToCut, int endIndexToCut) {
        message.delete(startIndexToCut, endIndexToCut + 1);
    }


    private static int getSum(StringBuilder message, int startIndexToSum, int endIndexToSum) {
        int sum = 0;
        for (int i = startIndexToSum; i <= endIndexToSum; i++) {
            sum += message.charAt(i);
        }
        return sum;
    }
}
