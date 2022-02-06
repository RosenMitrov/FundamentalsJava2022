package fund04Methods.exercises;

import java.util.Scanner;

//created by R.M.
public class fund10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            if (isDivisibleBy8(i) && isThereAtLeastOneOddDigit(i)) {
                System.out.printf("%d%n", i);
            }
        }
    }

    private static boolean isDivisibleBy8(int number) {
        int sumDigits = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            sumDigits += lastDigit;
            number /= 10;
        }
        return sumDigits % 8 == 0;
    }

    private static boolean isThereAtLeastOneOddDigit(int number) {
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
/*
Read an integer n from the console. 
Find all top numbers in the range [1 … n] and print them. 

A top number holds the following properties:
•	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
•	Holds at least one odd digit, e.g. 232, 707, 87578.

 */