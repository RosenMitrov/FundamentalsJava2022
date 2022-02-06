package fund02dataTypesAndVariables.lab;

import java.util.Scanner;
//created by R.M.

public class Fund05ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //FIRST SOLUTION
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 3; i++) {
            char symbol = scanner.nextLine().charAt(0);
            stringBuilder.append(symbol);
        }
        StringBuilder reversedBuilder = new StringBuilder();

        for (int i = stringBuilder.length() - 1; i >= 0; i--) {
            char symbol = stringBuilder.charAt(i);
            reversedBuilder.append(symbol);
            reversedBuilder.append(" ");
        }
        System.out.printf("%s", reversedBuilder);

        //SECOND SOLUTION

//        for (int i = 1; i <= 3; i++) {
//            char symbol = scanner.nextLine().charAt(0);
//
//            stringBuilder.append(symbol);
//            stringBuilder.append(" ");
//
//        }
//        stringBuilder.reverse();
//        System.out.printf("%s", stringBuilder);
    }
}
/*
7.	Reversed Chars
Write a program that takes 3 lines of characters
and prints them in reversed order with a space between them.
 */