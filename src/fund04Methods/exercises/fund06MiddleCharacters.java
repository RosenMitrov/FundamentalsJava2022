package fund04Methods.exercises;

import java.util.Scanner;

//created by R.M.
public class fund06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleChar(text);
    }

    public static void printMiddleChar(String text) {
        if (text.length() % 2 == 0) {
            int firstMid = ((text.length() / 2) - 1);
            int secondMid = text.length() / 2;
            System.out.printf("%c%c", text.charAt(firstMid), text.charAt(secondMid));
        } else { // != 0
            int mid = text.length() / 2;
            System.out.printf("%c", text.charAt(mid));
        }
    }
}
/*
6.	Middle Characters
You will receive a single string.
Write a method that prints the middle character.
If the length of the string is even,
here are two middle characters.

 */
