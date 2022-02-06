package fund02dataTypesAndVariables.MoreExercises;

import java.util.Scanner;

//created by R.M.
public class Fund02FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numbers; i++) {

            long left = scanner.nextLong();
            long right = scanner.nextLong();
            if (left > right) {
                long sum = 0L;
                while (left != 0) {
                    long lastDigit = left % 10;
                    sum += lastDigit;
                    left /= 10;
                }
                System.out.println(Math.abs(sum));
            } else {//left <= right
                long sum = 0L;
                while (right != 0) {
                    long lastDigit = right % 10;
                    sum += lastDigit;
                    right /= 10;
                }
                System.out.println(Math.abs(sum));
            }
        }
    }

}
/*
2.	From Left to the Right
You will receive a number that represents how many lines we will get as input.
On the next N lines, you will receive a string with 2 numbers separated by a single space.
You need to compare them. If the left number is greater than the right number,
you need to print the sum of all digits in the left number,
otherwise, print the sum of all digits in the right number.
 */