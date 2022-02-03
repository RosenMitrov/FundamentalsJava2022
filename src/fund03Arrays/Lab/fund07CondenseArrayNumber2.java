package fund03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class fund07CondenseArrayNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        while (numbersArr.length > 1) {
            int[] condensedArray = new int[numbersArr.length - 1];

            for (int i = 0; i < condensedArray.length; i++) {
                int leftNum = numbersArr[i];
                int rightNum = numbersArr[i + 1];
                condensedArray[i] = leftNum + rightNum;
            }
            numbersArr = condensedArray;
        }

        for (int number : numbersArr) {
            System.out.println(number);
        }
    }
}
/*
7.	Condense Array to Number
Write a program to read an array of integers
and condense them by summing adjacent couples of elements until a single integer is obtained.
For example, if we have 3 elements {2, 10, 3},
we sum the first two and the second two elements and obtain {2+10, 10+3} = {12, 13},
then we sum again all adjacent elements and obtain {12+13} = {25}.

 */
