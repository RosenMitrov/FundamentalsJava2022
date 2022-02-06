package fund04Methods.lab;

import java.util.Scanner;

//created by R.M.
public class Fund04Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                printAdd(numOne, numTwo);
                break;
            case "multiply":
                printMultiply(numOne, numTwo);
                break;
            case "subtract":
                printSubtract(numOne, numTwo);
                break;
            case "divide":
                printDivide(numOne, numTwo);
                break;
        }
    }

    public static void printAdd(int numOne, int numTwo) {
        System.out.println(numOne + numTwo);
    }

    public static void printMultiply(int numOne, int numTwo) {
        System.out.println(numOne * numTwo);
    }

    public static void printSubtract(int numOne, int numTwo) {
        System.out.println(numOne - numTwo);
    }

    public static void printDivide(int numOne, int numTwo) {
        System.out.println(numOne / numTwo);
    }
}
/*
4.	Calculations
Write a program that receives a string on the first line ("add", "multiply", "subtract", "divide")
and on the next two lines receives two numbers. Create four methods (for each calculation)
and invoke the right one depending on the command.
The method should also print the result (needs to be void).

 */