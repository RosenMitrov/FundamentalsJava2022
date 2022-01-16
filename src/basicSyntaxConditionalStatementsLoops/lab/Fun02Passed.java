package basicSyntaxConditionalStatementsLoops.lab;
       // created by R.M.
import java.util.Scanner;

public class Fun02Passed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3.00) {
            System.out.println("Passed!");
        }
    }
}
