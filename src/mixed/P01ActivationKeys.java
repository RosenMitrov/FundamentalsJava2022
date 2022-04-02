package mixed;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String input = scanner.nextLine();
        while (!input.equals("Generate")) {
            String[] data = input.split(">>>");
            String command = data[0];
            boolean isFound = true;
            switch (command) {
                case "Contains":
                    String substring = data[1];
                    if (text.contains(substring)) {
                        System.out.printf("%s contains %s%n", text, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    isFound = false;
                    break;
                case "Flip":
                    String upperOrLowerCase = data[1];
                    int startIndexOfFlip = Integer.parseInt(data[2]);
                    int endIndexOfFlip = Integer.parseInt(data[3]);
                    if (upperOrLowerCase.equals("Upper")) {
                        text = changeToUpperCase(text, startIndexOfFlip, endIndexOfFlip);
                    } else if (upperOrLowerCase.equals("Lower")) {
                        text = changeToLowerCase(text, startIndexOfFlip, endIndexOfFlip);
                    }
                    break;
                case "Slice":
                    int startIndexToSlice = Integer.parseInt(data[1]);
                    int endIndexToSlice = Integer.parseInt(data[2]);
                    text = slicePart(text, startIndexToSlice, endIndexToSlice);
                    break;
            }
            if (isFound) {
                System.out.println(text);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", text);
    }

    private static String slicePart(String text, int startIndexToSlice, int endIndexToSlice) {
        StringBuilder current = new StringBuilder(text);
        text = current.delete(startIndexToSlice, endIndexToSlice).toString();
        return text;
    }

    private static String changeToLowerCase(String text, int startIndexOfFlip, int endIndexOfFlip) {
        StringBuilder current = new StringBuilder(text);
        String upperCase = text.substring(startIndexOfFlip, endIndexOfFlip).toLowerCase();
        return current.replace(startIndexOfFlip, endIndexOfFlip, upperCase).toString();
    }

    private static String changeToUpperCase(String text, int startIndexOfFlip, int endIndexOfFlip) {
        StringBuilder current = new StringBuilder(text);
        String upperCase = text.substring(startIndexOfFlip, endIndexOfFlip).toUpperCase();
        return current.replace(startIndexOfFlip, endIndexOfFlip, upperCase).toString();
    }
}
