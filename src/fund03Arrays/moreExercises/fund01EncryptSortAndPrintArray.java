package fund03Arrays.moreExercises;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class fund01EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        int[] array = new int[lines];

        for (int i = 0; i < lines; i++) {
            String input = scanner.nextLine();
            int lengthString = input.length();
            int sum = 0;
            for (int j = 0; j < lengthString; j++) {
                char letter = input.charAt(j);
                switch (letter) {
                    case 'a':
                    case 'A':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                        sum += (letter * lengthString);
                        break;
                    default:
                        sum += (letter / lengthString);
                        break;
                }
            }
            array[i] = sum;
        }
        Arrays.sort(array);

        for (int el : array) {
            System.out.println(el);
        }
    }
}
/*
1.	Encrypt, Sort and Print Array
Write a program that reads a sequence of strings from the console. Encrypt every string by summing:
•	The code of each vowel multiplied by the string length
•	The code of each consonant divided by the string length
Sort the number sequence in ascending order and print it on the console.
On the first line, you will always receive the number of strings you have to read.

 */