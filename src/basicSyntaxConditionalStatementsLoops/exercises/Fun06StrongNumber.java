package basicSyntaxConditionalStatementsLoops.exercises;
//created by R.M.

import java.util.Scanner;

public class Fun06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int initialNumber = number;
        int sumFact = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            int currentFactorial = 1;
            while (lastDigit > 0) {
                currentFactorial *= lastDigit;
                lastDigit--;
            }
            sumFact += currentFactorial;
        }
        if (initialNumber == sumFact) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
