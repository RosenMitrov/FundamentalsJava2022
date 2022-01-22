package fund01basicSyntaxConditionalStatementsLoops.MoreExercises;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        System.out.printf("The sum of digits of number is: %d", sum);
    }
}
