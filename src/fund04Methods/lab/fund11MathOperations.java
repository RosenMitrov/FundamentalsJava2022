package fund04Methods.lab;

import java.util.Scanner;

//created by R.M.
public class Fund11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());

        printResult(firstNum, operator, secondNum);
    }

    private static void printResult(int firstNum, char operator, int secondNum) {
        switch (operator) {
            case '/':
                System.out.println(resultOfDivision(firstNum, secondNum));
                break;
            case '*':
                System.out.println(resultOfMultiplication(firstNum, secondNum));
                break;
            case '+':
                System.out.println(resultOfAddition(firstNum, secondNum));
                break;
            case '-':
                System.out.println(resultOfSubtraction(firstNum, secondNum));
                break;
        }
    }

    public static int resultOfDivision(int firstNum, int secondNum) {
        return firstNum / secondNum;
    }

    public static int resultOfMultiplication(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static int resultOfAddition(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public static int resultOfSubtraction(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }
}
/*
11.	Math Operations
Write a method that receives two numbers and an operator,
calculates the result, and returns it.
You will be given three lines of input.
The first will be the first number,
the second one will be the operator
and the last one will be the second number.
The possible operators are: / * + -
Print the result rounded up to the second decimal point.

 */