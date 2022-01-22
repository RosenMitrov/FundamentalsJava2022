package fund01basicSyntaxConditionalStatementsLoops.lab;

import java.util.Scanner;

public class Fun03PassedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade < 3.00) {
            System.out.println("Failed!");
        } else {
            System.out.println("Passed!");
        }
    }
}
