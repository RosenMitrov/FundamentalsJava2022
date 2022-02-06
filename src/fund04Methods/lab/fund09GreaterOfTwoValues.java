package fund04Methods.lab;

import java.util.Scanner;

//created by R.M.
public class Fund09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfData = scanner.nextLine();
        switch (typeOfData) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                int greaterNumber = getMax(firstNum, secondNum);
                System.out.println(greaterNumber);
                break;
            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                char greaterChar = getMax(firstChar, secondChar);
                System.out.println(greaterChar);
                break;
            case "string":
                String firstName = scanner.nextLine();
                String secondName = scanner.nextLine();
                String greaterName = getMax(firstName, secondName);
                System.out.println(greaterName);
                break;
        }
    }

    private static int getMax(int firstNum, int secondNum) {
        return Math.max(firstNum, secondNum);
    }

    private static char getMax(char first, char second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    private static String getMax(String firstName, String secondName) {
        if (firstName.compareTo(secondName) >= 0) {
            return firstName;
        }
        return secondName;
    }
}
/*
9.	Greater of Two Values
You are given two values of the same type as input.
The values can be of type int, char of String.
Create a method getMax() that returns the greater of the two values:

 */