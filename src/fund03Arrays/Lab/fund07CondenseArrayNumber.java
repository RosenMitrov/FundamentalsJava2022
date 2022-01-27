package fund03Arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class fund07CondenseArrayNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int iteration = numbersArr.length - 1;

        for (int i = 0; i < iteration; i++) {
            int[] condensed = new int[numbersArr.length - 1];

            for (int j = 0; j < condensed.length; j++) {
                condensed[j] = numbersArr[j] + numbersArr[j + 1];
            }

            numbersArr = condensed;
        }
        for (int num : numbersArr) {
            System.out.println(num);
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
