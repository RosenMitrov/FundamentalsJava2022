package fund04Methods.lab;

import java.util.Scanner;

//created by R.M.
public class fund01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        printSign(number);
    }

    public static void printSign(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else {
            if (number < 0) {
                System.out.println("The number " + number + " is negative.");
            } else {//when the number is zero!
                System.out.println("The number " + number + " is zero.");
            }
        }
    }
}
/*
1.	Sign of Integer
Create a method that prints the sign of an integer number.

 */