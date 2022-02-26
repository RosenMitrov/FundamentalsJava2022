package fund06ObjectsAndClasses.lab.usingTheBuiltInJavaClasses;

import java.math.BigInteger;
import java.util.Scanner;

//created by R.M.
public class P02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger first = new BigInteger(scanner.nextLine());
        BigInteger second = new BigInteger(scanner.nextLine());
        BigInteger result = first.add(second);

        System.out.println(result);
    }
}
/*
2.	Sum Big Numbers
You will receive two numbers (0 to 1050), print their sum.

 */