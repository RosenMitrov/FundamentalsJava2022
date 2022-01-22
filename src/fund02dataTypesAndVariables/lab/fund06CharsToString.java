package fund02dataTypesAndVariables.lab;

import java.util.Scanner;

//created by R.M.
public class fund06CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            char letter = scanner.nextLine().charAt(0);
            output.append(letter);
        }
        System.out.printf("%s", output);

        //SECOND SOLUTION

//        String output = "";
//        for (int i = 1; i <= 3; i++) {
//            char letter = scanner.nextLine().charAt(0);
//            output += letter;
//        }
//        System.out.printf("%s", output);
    }
}
/*
6.	Chars to String
Write a program that reads 3 lines of input.
On each line, you get a single character.
Combine all the characters into one string and print it on the console.
 */