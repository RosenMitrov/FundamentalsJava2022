package mixed;

import java.util.Scanner;

public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] data = input.split(":\\|:");
            String command = data[0];
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    message.insert(index, " ");
                    System.out.println(message);
                    break;
                case "Reverse":
                    String substring = data[1];
                    printResultOfReversed(message, substring);
                    break;
                case "ChangeAll":
                    substring = data[1];
                    String replacement = data[2];
                    changeAll(message, substring, replacement);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }

    private static void printResultOfReversed(StringBuilder message, String substring) {
        int index = message.indexOf(substring);
        if (index != -1) {
            StringBuilder reversed = new StringBuilder(substring).reverse();
            message.delete(index, index + substring.length());
            message.append(reversed);
            System.out.println(message);
        } else {
            System.out.println("error");
        }
    }

    private static void changeAll(StringBuilder message, String substring, String replacement) {
        int index = message.indexOf(substring);
        while (index != -1) {
            message.replace(index, index + substring.length(), replacement);
            index = message.indexOf(substring);
        }
        System.out.println(message);
    }
}
