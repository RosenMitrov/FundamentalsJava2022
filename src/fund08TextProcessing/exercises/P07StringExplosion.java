package fund08TextProcessing.exercises;

import java.util.Scanner;

//created by R.N.
public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder line = new StringBuilder(scanner.nextLine());
        int strength = 0;
        for (int i = 0; i < line.length(); i++) {
            char symbol = line.charAt(i);
            if (symbol == '>') {
                strength += Integer.parseInt(String.valueOf(line.charAt(i + 1)));
            } else if (strength > 0) {
                line.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.println(line);
    }
}

/*
7.	String Explosion
Explosions are marked with ">". Immediately after the mark, there will be an integer, which signifies the strength of the explosion.
You should remove x characters (where x is the strength of the explosion), starting after the punched character (">").
If you find another explosion mark (">") while you’re deleting characters, you should add the strength to your previous explosion.
When all characters are processed, print the string without the deleted characters.
You should not delete the explosion character – ">", but you should delete the integers, which represent the strength.
Input
You will receive a single line with the string.
Output
Print what is left from the string after explosions.
Constraints
•	You will always receive strength for the punches.
•	The path will consist only of letters from the Latin alphabet, integers, and the char ">".
•	The strength of the punches will be in the interval [0…9].

 */
