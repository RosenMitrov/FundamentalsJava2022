package fund02dataTypesAndVariables.MoreExercises;

import java.util.Scanner;

//created by R.M.
public class fund01DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {
            boolean isInt = false;
            boolean isDouble = false;


            int dotCounter = 0;
            int digitCounter = 0;
            for (int i = 0; i < input.length(); i++) {
                char currentSymbol = input.toLowerCase().charAt(i);
                if ((currentSymbol >= 48 && currentSymbol <= 57) || currentSymbol == 45) {
                    digitCounter++;
                } else if ((currentSymbol == 46) && digitCounter > 0 && digitCounter != input.length() - 1) {
                    dotCounter++;
                }
            }
            if (input.length() == digitCounter) {
                isInt = true;
            } else if ((input.length() - 1) == digitCounter && dotCounter == 1) {
                isDouble = true;
            }

            if (isInt) {
                System.out.printf("%s is integer type%n", input);
            } else if (isDouble) {
                System.out.printf("%s is floating point type%n", input);
            } else if (input.toLowerCase().equals("true") || input.toLowerCase().equals("false")) {
                System.out.printf("%s is boolean type%n", input);
            } else if (input.length() == 1) {
                System.out.printf("%s is character type%n", input);
            } else {
                System.out.printf("%s is string type%n", input);
            }
            input = scanner.nextLine();
        }
    }
}
/*
You will receive input until you receive "END". Find what data type is the input. Possible data types are:
•	Integer
•	Floating point
•	Characters
•	Boolean
•	Strings
Print the result in the following format: "{input} is {data type} type".
 */