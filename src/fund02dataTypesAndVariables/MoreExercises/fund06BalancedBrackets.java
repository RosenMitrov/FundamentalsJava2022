package fund02dataTypesAndVariables.MoreExercises;

import java.util.Scanner;

//created by R.M.
public class Fund06BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        int count = 0;

        boolean isBalanced = true;
        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            char check = input.charAt(0);

            if (check == '(') {
                if (count == 1) {
                    isBalanced = false;
                    break;
                }
                count++;
            }
            if (check == ')') {
                if (count == 0) {
                    isBalanced = false;
                    break;
                }
                count--;
            }
        }
        if (!isBalanced) {
            System.out.println("UNBALANCED");
        } else if (count > 0) {
            System.out.println("UNBALANCED");
        } else {
            System.out.println("BALANCED");
        }
    }
}
/*
6.	Balanced Brackets
You will receive n lines. On those lines, you will receive one of the following:
•	Opening bracket – "(",
•	Closing bracket – ")" or
•	Random string
Your task is to find out if the brackets are balanced.
That means after every opening bracket should follow a closing one.
Nested parentheses are not valid, and if two consecutive opening brackets exist,
the expression should be marked as unbalanced.
Input
•	On the first line, you will receive n – the number of lines, which will follow.
•	On the next n lines, you will receive "(", ")" or another string.
Output
You have to print "BALANCED" if the parentheses are balanced and "UNBALANCED" otherwise.

 */