package fund08TextProcessing.lab;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P02RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringsArr = scanner.nextLine().split(" ");

        for (int index = 0; index < stringsArr.length; index++) {
            String currentElement = stringsArr[index];
            stringsArr[index] = getRepeated(currentElement, currentElement.length());
        }
        System.out.println(String.join("", stringsArr));
    }

    private static String getRepeated(String currentElement, int repetitions) {
        char[] repeated = new char[repetitions * repetitions];

        for (int index = 0; index < repeated.length; index++) {
            repeated[index] = currentElement.charAt(index % currentElement.length());
        }
        return new String(repeated);
    }
}
/*
2.	Repeat Strings
Write a Program That Reads an Array of Strings. Each String is Repeated N Times, Where N is the length of the String. Print the Concatenated String.

 */