package fund08TextProcessing.exercises;

import java.util.Scanner;

//created by R.M.
public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");

        String first = data[0];
        String second = data[1];

        int max = Math.max(first.length(), second.length());
        int min = Math.min(first.length(), second.length());
        int totalSum = 0;
        for (int index = 0; index < max; index++) {
            if (index < min) {
                totalSum = totalSum + first.charAt(index) * second.charAt(index);
            } else {
                if (first.length() > second.length()) {
                    totalSum = totalSum + first.charAt(index);
                } else {
                    totalSum = totalSum + second.charAt(index);
                }
            }
        }
        System.out.println(totalSum);
    }
}
/*
2.	Character Multiplier
Create a method that takes two strings as arguments
and returns the sum of their character codes multiplied (multiply str1[0] with str2[0] and add to the total sum).
Then continue with the next two characters.
If one of the strings is longer than the other,
add the remaining character codes to the total sum without multiplication.

 */