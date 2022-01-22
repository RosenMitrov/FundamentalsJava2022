package fund01basicSyntaxConditionalStatementsLoops.exercises;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());
        int initialNumber = number;
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact *= i;
            }
            sum += fact;
            number /= 10;
        }

        if (initialNumber == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
