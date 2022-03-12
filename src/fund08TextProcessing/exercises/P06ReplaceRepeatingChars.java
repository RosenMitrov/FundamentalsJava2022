package fund08TextProcessing.exercises;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder input = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                input.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(input);
    }
}
/*
6.	Replace Repeating Chars
Write a program that reads a string from the console
and replaces any sequence of the same letters with a single corresponding letter.
 */