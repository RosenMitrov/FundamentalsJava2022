package fund04Methods.moreExercises;

import java.util.Scanner;

//created by R.M.
public class Fund05MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        printIsPositiveNegativeOrZero(num1, num2, num3);
    }

    public static void printIsPositiveNegativeOrZero(int num1, int num2, int num3) {

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        }
        if (num1 > 0 && num2 > 0 && num3 > 0) {
            System.out.println("positive");
        } else if (num1 < 0 || num2 < 0 || num3 < 0) {
            if ((num1 < 0 && num2 < 0) && num3 > 0) {
                System.out.println("positive");
            } else if ((num2 < 0 && num3 < 0) && num1 > 0) {
                System.out.println("positive");
            } else if ((num3 < 0 && num1 < 0) && num2 > 0) {
                System.out.println("positive");
            } else {
                System.out.println("negative");
            }
        }
    }
}
/*
5.	Multiplication Sign
You are given a number num1, num2, and num3.
Write a program that finds if num1 * num2 * num3 (the product) is negative,
positive, or zero.
Try to do this WITHOUT multiplying the 3 numbers.

 */