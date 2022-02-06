package fund02dataTypesAndVariables.exercises;

import java.util.Scanner;

//created by R.M.
public class Fund04SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i < lines; i++) {
            char letter = scanner.nextLine().charAt(0);
            sum += letter;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}

/*
4.	Sum of Chars
Write a program, which sums the ASCII codes of n characters. Print the sum on the console.

Input
•	On the first line, you will receive n – the number of lines, which will follow.
•	On the next n lines – you will receive letters from the Latin alphabet.

Output
Print the total sum in the following format:
"The sum equals: {totalSum}"
 */