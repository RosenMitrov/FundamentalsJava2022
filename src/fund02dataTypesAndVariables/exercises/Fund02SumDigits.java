package fund02dataTypesAndVariables.exercises;

import java.util.Scanner;

//created by R.M.
public class Fund02SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (input > 0) {
            int lastDigit = input % 10;
            sum += lastDigit;
            input /= 10;
        }
        System.out.println(sum);

    }
}
/*
2.	Sum Digits
You will be given a single integer.
Your task is to find the sum of its digits.
 */