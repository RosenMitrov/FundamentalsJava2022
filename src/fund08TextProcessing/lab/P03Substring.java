package fund08TextProcessing.lab;

import java.util.Scanner;

//created by R.M.
public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toRemove = scanner.nextLine();
        String text = scanner.nextLine();

        while (text.contains(toRemove)) {
            text = text.replace(toRemove, "");
        }
        System.out.println(text);
    }
}
/*
3.	Substring
On the first line, you will receive a string.
On the second line, you will receive a second string.
Write a program that removes all the occurrences of the first string in the second until there is no match.
At the end print the remaining string.

 */