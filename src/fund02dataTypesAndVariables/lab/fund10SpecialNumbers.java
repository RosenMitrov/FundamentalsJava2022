package fund02dataTypesAndVariables.lab;

import java.util.Scanner;

//created by R.M.
public class fund10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= range; i++) {
            int number = i;
            int sumDigits = 0;

            while (number > 0) {
                int lastDigit = number % 10;
                sumDigits += lastDigit;
                number = number / 10;
            }
            if (sumDigits == 5 || sumDigits == 7 || sumDigits == 11) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
/*
10.	Special Numbers
A number is special when its sum of digits is 5, 7, or 11.
Write a program to read an integer n and for all numbers in the range 1…n to print the number
and if it is special or not (True / False).
 */