package fund10ExamPreparation.exercises;

import java.util.Scanner;

//created by R.M.
public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] data = input.split(":\\|:");
            String command = data[0];
            boolean isError = false;
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    message = getInsertedSpace(message, index);
                    break;
                case "Reverse":
                    String substring = data[1];
                    if (message.contains(substring)) {
                        message = getReversed(message, substring);
                    } else {
                        System.out.println("error");
                        isError = true;
                    }
                    break;
                case "ChangeAll":
                    substring = data[1];
                    String replacement = data[2];
                    message = getChangedAll(message, substring, replacement);
                    break;
            }
            if (!isError) {
                System.out.println(message);
            }
            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }

    private static String getInsertedSpace(String message, int index) {
        String firstPart = message.substring(0, index);
        String secondPart = message.substring(index);
        return firstPart + " " + secondPart;
    }

    private static String getReversed(String message, String substring) {
        int indexOfSubStr = message.indexOf(substring);
        if (indexOfSubStr != -1) {
            String firstPart = message.substring(0, indexOfSubStr);
            String secondPart = message.substring(indexOfSubStr + substring.length());
            char[] subStringArr = substring.toCharArray();
            for (int index = 0; index < subStringArr.length / 2; index++) {
                char oldChar = subStringArr[index];
                subStringArr[index] = subStringArr[subStringArr.length - 1 - index];
                subStringArr[subStringArr.length - 1 - index] = oldChar;
            }
            String reversed = String.valueOf(subStringArr);
            return firstPart + secondPart + reversed;
        }
        return message;
    }

    private static String getChangedAll(String message, String substring, String replacement) {
        int index = message.indexOf(substring);
        while (index != -1) {
            message = message.replace(substring, replacement);

            index = message.indexOf(substring, index);
        }
        return message;
    }
}
/*
You have plenty of free time, so you decide to write a program that conceals and reveals your received messages. Go ahead and type it in!
On the first line of the input, you will receive the concealed message.
After that, until the "Reveal" command is given,
you will receive strings with instructions for different operations that need to be performed upon the concealed message to interpret it
and reveal its actual content. There are several types of instructions, split by ":|:"
•	"InsertSpace:|:{index}":
o	Inserts a single space at the given index. The given index will always be valid.
•	"Reverse:|:{substring}":
o	If the message contains the given substring, cut it out, reverse it and add it at the end of the message.
o	If not, print "error".
o	This operation should replace only the first occurrence of the given substring if there are two or more occurrences.
•	"ChangeAll:|:{substring}:|:{replacement}":
o	Changes all occurrences of the given substring with the replacement text.
Input / Constraints
•	On the first line, you will receive a string with a message.
•	On the following lines, you will be receiving commands, split by ":|:".
Output
•	After each set of instructions, print the resulting string.
•	After the "Reveal" command is received, print this message:
"You have a new text message: {message}"

 */