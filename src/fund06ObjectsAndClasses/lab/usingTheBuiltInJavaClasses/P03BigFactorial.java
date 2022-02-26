package fund06ObjectsAndClasses.lab.usingTheBuiltInJavaClasses;

import java.math.BigInteger;
import java.util.Scanner;

//created by R.M.
public class P03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
}
/*
3.	Big Factorial
You will receive N - the number in the range [0 - 1000]. Calculate the Factorial of N and print the result.

 */