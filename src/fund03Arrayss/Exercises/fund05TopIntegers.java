package fund03Arrayss.Exercises;

import java.util.Scanner;

//created by R.M.
public class fund05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersAsString = scanner.nextLine().split(" ");
        for (int i = 0; i < numbersAsString.length; i++) {
            int currentNum = Integer.parseInt(numbersAsString[i]);
            boolean isBigger = true;

            for (int j = i + 1; j < numbersAsString.length; j++) {
                int nextNum = Integer.parseInt(numbersAsString[j]);

                if (currentNum <= nextNum) {
                    isBigger = false;
                }
            }
            if (isBigger) {
                System.out.printf("%d ", currentNum);
            }
        }
    }
}
/*
5.	Top Integers
Write a program to find all the top integers in an array.
A top integer is an integer that is bigger than all the elements to its right.

 */