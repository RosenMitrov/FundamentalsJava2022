package fund02dataTypesAndVariables.exercises;

import java.util.Scanner;

//created by R.M.
public class Fund05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = start; i <= end; i++) {
            System.out.printf("%c ", i);
        }
    }
}
/*
5.	Print Part of the ASCII Table

Write a program that prints part of the ASCII table of characters at the console.
On the first line of input, you will receive the char index you should start with, and on the
second line - the index of the last character you should print.
 */