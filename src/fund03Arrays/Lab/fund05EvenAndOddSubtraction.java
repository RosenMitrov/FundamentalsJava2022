package fund03Arrays.Lab;

import java.util.Scanner;

//created by R.M.
public class fund05EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersAsString = scanner.nextLine().split(" ");
        int sumEven = 0;
        int sumOdd = 0;
        for (String eachStringAsNum : numbersAsString) {
            int currentNum = Integer.parseInt(eachStringAsNum);
            if (currentNum % 2 == 0) {
                sumEven += currentNum;
            } else {
                sumOdd += currentNum;
            }
        }
        int diff = sumEven - sumOdd;
        System.out.println(diff);
    }
}
/*
5.	Even and Odd Subtraction
Write a program that calculates the difference between the sum of the even and the sum of the odd numbers in an array.
 */