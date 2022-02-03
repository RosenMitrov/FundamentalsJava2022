package fund03Arrayss.Lab;

import java.util.Scanner;

//created by R.M.
public class fund04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayOfStrings = scanner.nextLine().split(" ");

        for (int i = 0; i < arrayOfStrings.length / 2; i++) {
            String last = arrayOfStrings[arrayOfStrings.length - 1 - i];
            String first = arrayOfStrings[i];
            arrayOfStrings[arrayOfStrings.length - 1 - i] = first;
            arrayOfStrings[i] = last;
        }
        System.out.println(String.join(" ", arrayOfStrings));
    }
}
/*
4.	Reverse an Array of Strings
Writes a program to read an array of strings, reverse it and print its elements.
The input consists of a sequence of space-separated strings.
Print the output on a single line (space separated).
 */
