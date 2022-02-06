package fund04Methods.exercises;

import java.util.Scanner;

//created by R.M.
public class Fund03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char startSymbol = scanner.nextLine().charAt(0);
        char endSymbol = scanner.nextLine().charAt(0);
        printCharsInRange(startSymbol, endSymbol);
    }

    public static void printCharsInRange(char startSymbol, char endSymbol) {
        if (startSymbol > endSymbol) {
            char temp = startSymbol;
            startSymbol = endSymbol;
            endSymbol = temp;
        }
        for (int i = startSymbol + 1; i < endSymbol; i++) {
            System.out.printf("%c ", i);
        }
    }
}
/*
3.	Characters in Range
Write a method that receives two characters
and prints on a single line all the characters in between them according to ASCII.

 */