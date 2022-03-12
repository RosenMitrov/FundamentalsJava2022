package fund08TextProcessing.lab;

import java.util.Scanner;

//created by R.M.
public class P05DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                digits.append(symbol);
            } else if ((symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 122)) {
                letters.append(symbol);
            } else {
                others.append(symbol);
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
/*
5.	Digits, Letters and Other
Write a program that receives a single string and on the first line prints all the digits,
on the second – all the letters, and on the third – all the other characters.
There will always be at least one digit, one letter, and one other character.

 */
