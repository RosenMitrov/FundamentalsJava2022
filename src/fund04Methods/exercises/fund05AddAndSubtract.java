package fund04Methods.exercises;

import java.util.Scanner;

//created By R.M.
public class fund05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sumOfFirstAndSecond = getSumFirstAndSecond(firstNum, secondNum);
        printSumSubtractingSumOfFirstAndSec(sumOfFirstAndSecond, thirdNum);

    }

    private static int getSumFirstAndSecond(int first, int second) {
        return first + second;
    }

    private static void printSumSubtractingSumOfFirstAndSec(int sumOfFirstAndSecond, int third) {
        System.out.println(sumOfFirstAndSecond - third);
    }
}
/*
5.	Add and Subtract
You will receive 3 integers.
Write a method sum to get the sum of the first two integers
and subtract the method that subtracts the third integer from the result from the sum method.

 */