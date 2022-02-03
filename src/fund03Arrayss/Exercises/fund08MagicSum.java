package fund03Arrayss.Exercises;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class fund08MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicNum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < array.length; i++) {
            int currentNumber = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int nextNumber = array[j];

                if (currentNumber + nextNumber == magicNum) {
                    System.out.printf("%d %d%n", currentNumber , nextNumber);
                }
            }
        }
    }
}
/*
8.	Magic Sum
Write a program, which prints all unique pairs in an array of integers whose sum is equal to a given number.

 */