package fund04Methods.exercises;

import java.util.Scanner;

//created by R.M.
public class fund02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printVowelsCount(text);
    }

    private static void printVowelsCount(String text) {
        int count = 0;
        for (int index = 0; index < text.length(); index++) {
            char symbol = text.charAt(index);
            if (symbol == 'a' || symbol == 'u' || symbol == 'o' || symbol == 'y' || symbol == 'e' || symbol == 'i' ||
                    symbol == 'A' || symbol == 'U' || symbol == 'O' || symbol == 'Y' || symbol == 'E' || symbol == 'I') {
                count++;
            }
        }
        System.out.println(count);
    }
}
/*
2.	Vowels Count
Write a method that receives a single string and prints the count of the vowels.
Use an appropriate name for the method.

 */