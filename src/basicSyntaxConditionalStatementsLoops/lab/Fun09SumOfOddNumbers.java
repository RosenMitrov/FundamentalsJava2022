package basicSyntaxConditionalStatementsLoops.lab;
//created by R.M.
import java.util.Scanner;

public class Fun09SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOddNumbers = Integer.parseInt(scanner.nextLine());
        int startNumber = 1;
        int sumOdd = 0;
        while (countOddNumbers > 0) {
            if (startNumber % 2 != 0) {
                countOddNumbers--;
                System.out.println(startNumber);
                sumOdd += startNumber;
            }
            startNumber++;
        }
        System.out.printf("Sum: %d", sumOdd);
    }
}
