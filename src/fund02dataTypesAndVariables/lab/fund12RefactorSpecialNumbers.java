package fund02dataTypesAndVariables.lab;

import java.util.Scanner;

//created by R.M.
public class fund12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int range = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= range; i++) {
            int sumOfDigits = 0;
            int number = i;

            while (number > 0) {
                int lastDigit = number % 10;
                sumOfDigits += lastDigit;
                number /= 10;
            }
            if ((sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11)) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
