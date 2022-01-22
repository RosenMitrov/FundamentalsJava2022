package fund01basicSyntaxConditionalStatementsLoops.lab;
// refactored by R.M
import java.util.Scanner;

public class Fun13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOddNumbers = Integer.parseInt(scanner.nextLine());
        int sumOddNumbers = 0;
        for (int i = 0; i < countOddNumbers; i++) {
            System.out.printf("%d%n",2 * i + 1);
            sumOddNumbers += 2 * i +1;
        }
        System.out.printf("Sum: %d%n", sumOddNumbers);
    }
}
