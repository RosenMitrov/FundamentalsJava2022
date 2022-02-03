package fund04Methods.lab;

import java.util.Scanner;

//created by R.M.
public class fund {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int repeatability = Integer.parseInt(scanner.nextLine());
        String repeatedText = repeatString(text, repeatability);
        System.out.println(repeatedText);
    }

    public static String repeatString(String text, int repeatability) {
        String[] strings = new String[repeatability];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = text;
        }
        return String.join("", strings);
    }
}
/*
7.	Repeat String
Write a method that receives a string and a repeat count n (integer).
The method should return a new string (the old one repeated n times).

 */
