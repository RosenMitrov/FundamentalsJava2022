package examsFundamentals.finalExam05;

import java.util.Scanner;

//created by R.M.
public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder stringInitial = new StringBuilder(input);

        input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] data = input.split(">>>");
            String command = data[0];
            switch (command) {
                case "Contains":
                    String substring = data[1];
                    if (stringInitial.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", stringInitial.toString(), substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLowerCase = data[1];
                    int startIndexFlip = Integer.parseInt(data[2]);
                    int endIndexFlip = Integer.parseInt(data[3]);
                    if (upperOrLowerCase.equals("Upper")) {
                        String upperCase = stringInitial.substring(startIndexFlip, endIndexFlip).toUpperCase();
                        stringInitial.replace(startIndexFlip, endIndexFlip, upperCase);
                    } else if (upperOrLowerCase.equals("Lower")) {
                        String lowerCase = stringInitial.substring(startIndexFlip, endIndexFlip).toLowerCase();
                        stringInitial.replace(startIndexFlip, endIndexFlip, lowerCase);
                    }
                    System.out.println(stringInitial);
                    break;
                case "Slice":
                    int startIndexSlice = Integer.parseInt(data[1]);
                    int endIndexSlice = Integer.parseInt(data[2]);
                    stringInitial.delete(startIndexSlice, endIndexSlice);
                    System.out.println(stringInitial);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", stringInitial);
    }
}
/*
You are about to make some good money, but first, you need to think of a way to verify who paid for your product and who didn't.
You have decided to let people use the software for a free trial period and then require an activation key to continue using the product.
Before you can cash out, the last step is to design a program that creates unique activation keys for each user. So, waste no more time and start typing!
The first line of the input will be your raw activation key. It will consist of letters and numbers only.
After that, until the "Generate" command is given, you will be receiving strings with instructions for different operations that need to be performed upon the raw activation key.
There are several types of instructions, split by ">>>":
•	"Contains>>>{substring}":
o	If the raw activation key contains the given substring, prints: "{raw activation key} contains {substring}".
o	Otherwise, prints: "Substring not found!"
•	"Flip>>>Upper/Lower>>>{startIndex}>>>{endIndex}":
o	Changes the substring between the given indices (the end index is exclusive) to upper or lower case and then prints the activation key.
o	All given indexes will be valid.
•	"Slice>>>{startIndex}>>>{endIndex}":
o	Deletes the characters between the start and end indices (the end index is exclusive) and prints the activation key.
o	Both indices will be valid.
Input
•	The first line of the input will be a string consisting of letters and numbers only.
•	After the first line, until the "Generate" command is given, you will be receiving strings.
Output
•	After the "Generate" command is received, print:
o	"Your activation key is: {activation key}"

 */