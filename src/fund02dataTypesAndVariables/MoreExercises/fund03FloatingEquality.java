package fund02dataTypesAndVariables.MoreExercises;

import java.util.Scanner;

//created by R.M.
public class fund03FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numOne = Double.parseDouble(scanner.nextLine());
        double numTwo = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;
        double diff = Math.abs(numOne - numTwo);
        if (diff < eps) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
/*
3.	Floating Equality
Write a program that safely compares floating-point numbers (double) with precision eps = 0.000001.
Note that we cannot directly compare two floating-point numbers a and b by a==b because of the nature of the floating-point arithmetic.
Therefore, we assume two numbers are equal if they are more close to each other than some fixed constant eps.
You will receive two lines, each containing a floating-point number. Your task is to compare the values of the two numbers.

 */