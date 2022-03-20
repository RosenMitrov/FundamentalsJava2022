package examsFundamentals.finalExam03;

import java.util.Scanner;

//created by R.M.
public class P01SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder message = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Reveal")) {
            String[] data = input.split("(:\\|:)");
            String instructionType = data[0];
            boolean isError = false;
            switch (instructionType) {
                case "InsertSpace":
                    int index = Integer.parseInt(data[1]);
                    message.insert(index, ' ');
                    break;
                case "Reverse":
                    StringBuilder substringForReverse = new StringBuilder(data[1]);
                    if (message.toString().contains(substringForReverse.toString())) {
                        int indexOfString = message.indexOf(substringForReverse.toString());
                        message.delete(indexOfString, indexOfString + substringForReverse.length());
                        String reversedSubstring = substringForReverse.reverse().toString();
                        message.append(reversedSubstring);
                    } else {
                        System.out.println("error");
                        isError = true;
                    }
                    break;
                case "ChangeAll":
                    String substringForReplace = data[1];
                    String replacement = data[2];
                    while (message.toString().contains(substringForReplace)) {
                        message = new StringBuilder(message.toString().replace(substringForReplace, replacement));
                    }
                    break;
            }
            if (!isError) {
                System.out.println(message);
            }
            input = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }
}
/*
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