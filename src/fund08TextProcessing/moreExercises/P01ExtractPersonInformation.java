package fund08TextProcessing.moreExercises;

import java.util.Scanner;

//created by R.M.
public class P01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int indexOfLeftName = input.indexOf("@");
            int indexOfRightName = input.indexOf("|");
            String name = input.substring(indexOfLeftName + 1, indexOfRightName);
            int indexOfAgeLeft = input.indexOf("#");
            int indexOfAgeRight = input.indexOf("*");
            int age = Integer.parseInt(input.substring(indexOfAgeLeft + 1, indexOfAgeRight));
            System.out.printf("%s is %d years old.%n", name, age);
        }
    }
}
/*
1.	Extract Person Information
Write a program that reads n lines of strings and extracts the name and age of a given person.
The name of the person will be between "@" and "|".
The person’s age will be between "#" and "*".
Example: "Hello my name is @Peter| and I am #20* years old."
For each found name and age print a line in the following format "{name} is {age} years old."
 */