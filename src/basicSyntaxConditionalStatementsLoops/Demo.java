package basicSyntaxConditionalStatementsLoops;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        while (num1 <= num2) {
            System.out.printf("%d ", num1);
            sum += num1;
            num1++;
        }
        System.out.printf("%nSum: %d",sum);
    }
}
