package fund10ExamPreparation.lab;

import java.util.Scanner;

//created by R.M.
public class P01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {
            String[] data = input.split("\\|");
            String command = data[0];
            switch (command) {
                case "Move":
                    int numberOfLetters = Integer.parseInt(data[1]);
                    getMoved(message, numberOfLetters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(data[1]);
                    String valueToInsert = data[2];
                    getInsertedValue(message, index, valueToInsert);
                    break;
                case "ChangeAll":
                    String substring = data[1];
                    String replacement = data[2];
                    changeAll(message, substring, replacement);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", message);
    }

    private static void changeAll(StringBuilder message, String substring, String replacement) {
        int index = message.indexOf(substring);
        while (index != -1) {
            message.replace(index, index + substring.length(), replacement);
            index = message.indexOf(substring, index);
        }
    }

    private static void getInsertedValue(StringBuilder message, int index, String valueToInsert) {
        message.insert(index, valueToInsert);
    }

    private static void getMoved(StringBuilder message, int numberOfLetters) {
        String firstPart = message.substring(0, numberOfLetters);
        message.delete(0, numberOfLetters);
        message.append(firstPart);
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