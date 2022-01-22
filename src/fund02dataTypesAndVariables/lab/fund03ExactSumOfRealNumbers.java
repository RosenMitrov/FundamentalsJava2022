package fund02dataTypesAndVariables.lab;

import java.math.BigDecimal;
import java.util.Scanner;

//created by R.M.
public class fund03ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 0; i < lines; i++) {
            BigDecimal number = new BigDecimal(scanner.nextLine());
            sum = sum.add(number);
        }
        System.out.println(sum);
    }
}
//3.	Exact Sum of Real Numbers
//Write a program to enter n numbers and calculate and print their exact sum (without rounding).
