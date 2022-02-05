package fund04Methods.exercises;

import java.util.Scanner;

//created by R.M.
public class fund04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (isValidCountOfCharacters(password) && isOnlyLettersAndDigits(password) && atLeast2Digits(password)) {
            System.out.println("Password is valid");
        }
        if (!isValidCountOfCharacters(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!isOnlyLettersAndDigits(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!atLeast2Digits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    public static boolean isValidCountOfCharacters(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);
            if (!Character.isLetterOrDigit(currentSymbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean atLeast2Digits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentSymbol = password.charAt(i);
            if (Character.isDigit(currentSymbol)) {
                count++;
                if (count == 2) {
                    return true;
                }
            }
        }
        return false;
    }
}
/*
4.	Password Validator
Write a program that checks if a given password is valid. Password rules are:
•	6 – 10 characters (inclusive);
•	Consists only of letters and digits;
•	Have at least 2 digits.
If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule print a message:
•	"Password must be between 6 and 10 characters";
•	"Password must consist only of letters and digits";
•	"Password must have at least 2 digits".

 */