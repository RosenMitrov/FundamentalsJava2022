package basicSyntaxConditionalStatementsLoops.MoreExercises;
// created by R.M.

import java.util.Scanner;

public class Fun01SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        if (first > second && first > third) {
            System.out.println(first);
            if (second > third) {
                System.out.println(second);
                System.out.println(third);
            } else {
                System.out.println(third);
                System.out.println(second);
            }
        } else if (second > first && second > third) {
            System.out.println(second);
            if (first > third) {
                System.out.println(first);
                System.out.println(third);
            } else {
                System.out.println(third);
                System.out.println(first);
            }
        } else if (third > second && third > first) {
            System.out.println(third);
            if (first > second) {
                System.out.println(first);
                System.out.println(second);
            } else {
                System.out.println(second);
                System.out.println(first);
            }
        }
    }
}
