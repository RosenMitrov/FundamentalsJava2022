package fund03Arrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class fund06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();


        int index = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            boolean isEqual = false;
            for (int j = 0; j < i; j++) {
                leftSum += numbersArr[j];
            }
            for (int j = i + 1; j < numbersArr.length; j++) {
                rightSum += numbersArr[j];
            }

            if (leftSum == rightSum) {
                isEqual = true;
                index = i;

            }
            if (isEqual) {
                System.out.printf("%d", index);
                break;
            } else if (i == numbersArr.length - 1) {
                System.out.println("no");
            }
        }
    }
}
/*
6.	Equal Sums
Write a program that determines if there exists an element in the array such that
the sum of the elements on its left is equal to the sum of the elements on its right.
If there are no elements to the left/right,
their sum is considered to be 0.
Print the index that satisfies the required condition or "no" if there is no such index.

 */
