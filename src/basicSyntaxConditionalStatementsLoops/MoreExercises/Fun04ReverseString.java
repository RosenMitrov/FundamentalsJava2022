package basicSyntaxConditionalStatementsLoops.MoreExercises;
//created by R.M.

import java.util.Scanner;

public class Fun04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            char currentSymbol = input.charAt(i);
            reversed.append(currentSymbol);
        }
        System.out.println(reversed);
    }
}
