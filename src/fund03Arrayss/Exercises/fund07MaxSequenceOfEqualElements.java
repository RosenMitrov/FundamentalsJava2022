package fund03Arrayss.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class fund07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int length = 0;
        int lengthMax = 0;
        int startIndex = 0;
        int bestIndex = 0;

        for (int index = 0; index < array.length - 1; index++) {
            int currentIndex = array[index];
            int nextIndex = array[index + 1];

            if (currentIndex == nextIndex) {
                length++;
            } else {
                length = 0;
                startIndex = index + 1;
            }
            if (length > lengthMax) {
                lengthMax = length;
                bestIndex = startIndex;
            }
        }
        for (int i = bestIndex; i <= bestIndex + lengthMax; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
/*
7.	Max Sequence of Equal Elements
Write a program that finds the longest sequence of equal elements in an array of integers.
If several longest sequences exist, print the leftmost one.

 */