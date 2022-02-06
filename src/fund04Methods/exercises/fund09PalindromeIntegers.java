package fund04Methods.exercises;

import java.util.Scanner;

//created by R.M.
public class Fund09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            printIsPalindromeOrNot(number);
            input = scanner.nextLine();
        }
    }

    private static void printIsPalindromeOrNot(int number) {
        System.out.printf("%b%n", isPalindromeNum(number));
    }

    private static boolean isPalindromeNum(int number) {
        int reversedNum = 0;
        int initialNum = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            number /= 10;
        }
        return reversedNum == initialNum;
    }
}
/*
9.	Palindrome Integers
A palindrome is a number that reads the same backward as forward,
such as 323 or 1001.
Write a program that reads a positive integer number until you receive "END".
For each numbered print whether the number is palindrome or not.

 */