package fund08TextProcessing.exercises;

import java.util.Scanner;

public class P05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String secondNumAsString = scanner.nextLine();
        int multiplayer = Integer.parseInt(secondNumAsString);

        StringBuilder result = new StringBuilder();
        int remainder = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            int product = digit * multiplayer + remainder;
            if (i == 0) {
                result.reverse();
                result.insert(0, product);
            } else {
                int digitToAdd = product % 10;
                remainder = product / 10;
                result.append(digitToAdd);
            }
        }

        while (result.charAt(0) == '0' && result.length() > 1) {
            result.deleteCharAt(0);
        }
        System.out.println(result);

    }
}
/*
5.	Multiply Big Number
You are given two lines – the first one can be a huge number (0 to 1050).
The second one will be a single-digit number (0 to 9).
You must display the product of these numbers.
Note: do not use the BigInteger class.
 */