package fund08TextProcessing.lab;

import java.util.Scanner;

//created by R.M.
public class P01ReversStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        while (!input.toString().equals("end")) {
            String initial = input.toString();
            System.out.printf("%s = %s%n", initial, input.reverse());
            input = new StringBuilder(scanner.nextLine());
        }
    }
}
/*
1.	Reverse Strings
You will be given a series of strings until you receive an "end" command.
Write a program that reverses strings and prints each pair on a separate line in the format "{word} = {reversed word}".

 */