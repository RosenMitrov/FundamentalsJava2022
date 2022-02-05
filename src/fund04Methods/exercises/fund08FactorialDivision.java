package fund04Methods.exercises;

import java.util.Scanner;

//created by R.M.
public class fund08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        long factFirst = getFactorial(first);
        long factSecond = getFactorial(second);

        printFactResult(factFirst, factSecond);
    }

    public static void printFactResult(double factFirst, double factSecond) {
        double result = factFirst / factSecond;
        System.out.printf("%.2f", result);
    }

    public static long getFactorial(int number) {
        long fact = 1;
        while (number != 0) {
            fact = fact * number;
            number--;
        }
        return fact;
    }
}
/*
8.	Factorial Division
Read two integer numbers.
Calculate the factorial of each number.
Divide the first result by the second
and print the division formatted to the second decimal point.

 */