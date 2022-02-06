package fund02dataTypesAndVariables.lab;

import java.util.Scanner;

//created by R.M.
public class Fund08LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letter = scanner.nextLine().charAt(0);

        if (letter >= 65 && letter <= 90) {
            System.out.println("upper-case");
        } else {
            if (letter >= 97 && letter <= 122) {
                System.out.println("lower-case");
            }
        }
    }
}
/*
8.	Lower or Upper
Write a program that prints whether a given character is upper-case or lower-case.
 */