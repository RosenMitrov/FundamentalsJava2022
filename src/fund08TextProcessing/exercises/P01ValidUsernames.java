package fund08TextProcessing.exercises;

import java.util.Scanner;

//created by R.M.
public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");
        for (String user : usernames) {
            boolean isValid = false;
            if (user.length() >= 3 && user.length() <= 16) {
                for (int i = 0; i < user.length(); i++) {
                    char symbol = user.charAt(i);
                    if ((symbol == 95 || symbol == 45 || (symbol >= 48 && symbol <= 57) || (symbol >= 65 && symbol <= 90) || (symbol >= 97 && symbol <= 122))) {
                        isValid = true;
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid) {
                System.out.println(user);
            }
        }
    }
}
/*
1.	Valid Usernames
Write a program that reads usernames on a single line (joined by ", ") and prints all valid usernames.
A valid username is:
•	Has a length between 3 and 16 characters.
•	Contains only letters, numbers, hyphens, and underscores.

 */