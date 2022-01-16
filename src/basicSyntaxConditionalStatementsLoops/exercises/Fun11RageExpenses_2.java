package basicSyntaxConditionalStatementsLoops.exercises;
//created by R.M.

import java.util.Scanner;

public class Fun11RageExpenses_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double expenses = 0.00;
        int keyboardCount = 0;
        for (int gameCount = 1; gameCount <= lostGames; gameCount++) {
            if (gameCount % 2 == 0) {
                expenses += headsetPrice;
            }
            if (gameCount % 3 == 0) {
                expenses += mousePrice;
            }
            if (gameCount % 2 == 0 && gameCount % 3 == 0) {
                expenses += keyboardPrice;
                keyboardCount++;
                if (keyboardCount % 2 == 0) {
                    expenses += displayPrice;
                }
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", expenses);
    }
}
