package examsFundamentals.finalExam01;

import java.util.Scanner;

//created by R.M.
public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();


        while (!input.equals("Decode")) {
            String[] data = input.split("([|])");
            String command = data[0];

            switch (command) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(data[1]);
                    message = getMove(numberOfLetters, message);
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    String value = data[2];
                    message = getInsertedValue(index, value, message);
                    break;
                case "ChangeAll":
                    String substring = data[1];
                    String replacement = data[2];
                    message = changeAll(substring, replacement, message);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);
    }

    private static String getMove(int numberOfLetters, String message) {
        String firstPart = message.substring(0, numberOfLetters);
        String secondPart = message.substring(numberOfLetters);
        return secondPart + firstPart;
    }

    private static String getInsertedValue(int index, String value, String message) {
        String firstPart = message.substring(0, index);
        String secondPart = message.substring(index);
        return firstPart + value + secondPart;
    }

    private static String changeAll(String substring, String replacement, String message) {
        return message.replace(substring, replacement);
    }
}
/*
During World War 2, you are a mathematician who has joined the cryptography team to decipher the enemy's enigma code.
Your job is to create a program to crack the codes.
On the first line of the input, you will receive the encrypted message.
After that, until the "Decode" command is given,
you will be receiving strings with instructions for different operations that need to be performed upon the concealed message to interpret it
and reveal its true content. There are several types of instructions, split by '|'
•	"Move {number of letters}":
o	Moves the first n letters to the back of the string
•	"Insert {index} {value}":
o	Inserts the given value before the given index in the string
•	"ChangeAll {substring} {replacement}":
o	Changes all occurrences of the given substring with the replacement text
Input / Constraints
•	On the first line, you will receive a string with a message.
•	On the following lines, you will be receiving commands, split by '|' .
Output
•	After the "Decode" command is received, print this message:
"The decrypted message is: {message}"

 */