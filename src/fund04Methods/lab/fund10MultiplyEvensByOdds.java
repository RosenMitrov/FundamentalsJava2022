package fund04Methods.lab;

import java.util.Scanner;

//created by R.M.
public class fund10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        resultOfMultiplicationOddAndEven(number);
    }

    public static void resultOfMultiplicationOddAndEven(int number) {
        int result = getEvenSum(number) * getOddSum(number);
        System.out.println(result);
    }

    public static int getEvenSum(int number) {
        int sumEven = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 == 0) {
                sumEven += lastDigit;
            }
            number /= 10;
        }
        return sumEven;
    }

    public static int getOddSum(int number) {
        int sumOdd = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                sumOdd += lastDigit;
            }
            number /= 10;
        }
        return sumOdd;
    }
}
/*
Create a program that reads an integer number and multiplies the sum of all its even digits by the sum of all its odd digits:
 */