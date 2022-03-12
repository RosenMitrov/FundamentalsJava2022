package fund08TextProcessing.lab;

import java.util.Scanner;

//created by R.M.
public class P04TexFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banned : bannedWordsArr) {
            String censored = repeat("*", banned.length());
            text = text.replace(banned, censored);
        }
        System.out.println(text);
    }

    public static String repeat(String sign, int repetitions) {
        char[] repeated = new char[sign.length() * repetitions];
        for (int i = 0; i < repeated.length; i++) {
            repeated[i] = sign.charAt(i % sign.length());
        }
        return new String(repeated);
    }
}
/*
4.	Text Filter
Write a program that takes a text and a string of banned words.
All words included in the ban list should be replaced with asterisks "*",
equal to the word's length.
The entries in the ban list will be separated by a comma and space ", ".
The ban list should be entered on the first input line and the text on the second input line.

 */