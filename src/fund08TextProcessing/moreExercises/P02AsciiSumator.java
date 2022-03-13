package fund08TextProcessing.moreExercises;

import java.util.Scanner;

//created by R.M.
public class P02AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (isValid(first, second, symbol)) {
                sum += symbol;
            }
        }
        System.out.println(sum);
    }

    private static boolean isValid(char first, char second, char symbol) {
        if (first < second) {
            return first < symbol && symbol < second;
        } else {
            return  symbol < first && second < symbol;
        }
    }
}
/*
2.	Ascii Sumator
Write a program that prints a sum of all characters between two given characters (their ASCII code).
In the first line, you will get a character. On the second line, you get another character.
On the last line, you get a random string.
Find all the characters between the two given and print their ASCII sum.

 */