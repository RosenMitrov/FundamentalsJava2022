package basicSyntaxConditionalStatementsLoops.exercises;
//created by R.M.

import java.util.Scanner;

public class Fun05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            char symbol = username.charAt(i);
            password += symbol;
        }
        int counter = 0;
        boolean isLogged = false;
        while (counter < 3) {
            String input = scanner.nextLine();
            if (!password.equals(input)) {
                System.out.println("Incorrect password. Try again.");
            } else {
                System.out.printf("User %s logged in.", username);
                isLogged = true;
                break;
            }
            counter++;
        }
        if (!isLogged) {
            System.out.printf("User %s blocked!", username);
        }
    }
}
