package basicSyntaxConditionalStatementsLoops.exercises;
//created by R.M.

import java.util.Scanner;

public class Fun04PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());

        int sumNumbers = 0;
        while (startNumber <= endNumber) {
            System.out.printf("%d ", startNumber);
            sumNumbers += startNumber;
            startNumber++;
        }
        System.out.printf("%nSum: %d", sumNumbers);

    }
}
