package fund01basicSyntaxConditionalStatementsLoops.lab;
//created by R.M.
import java.util.Scanner;

public class Fun11MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        if (numberTwo > 10) {
            System.out.printf("%d X %d = %d", numberOne, numberTwo, numberOne * numberTwo);
        } else {
            for (int i = numberTwo; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", numberOne, i, numberOne * i);
            }
        }
    }
}
