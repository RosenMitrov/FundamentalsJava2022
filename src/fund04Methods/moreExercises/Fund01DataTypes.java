package fund04Methods.moreExercises;

import java.util.Scanner;

//created by R.M.
public class Fund01DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataType = scanner.nextLine();
        switch (dataType) {
            case "int":
                int intNum = Integer.parseInt(scanner.nextLine());
                printResult(intNum);
                break;
            case "real":
                double doubleNum = Double.parseDouble(scanner.nextLine());
                printResult(doubleNum);
                break;
            case "string":
                String string = scanner.nextLine();
                printResult(string);
                break;
        }
    }

    private static void printResult(int intNum) {
        System.out.println((intNum * 2));
    }

    private static void printResult(double doubleNum) {
        System.out.printf("%.2f", doubleNum * 1.5);
    }

    private static void printResult(String string) {
        System.out.printf("$%s$", string);
    }


}
/*
1.	Data Types
Write a program that, depending on the first line of the input, reads an int, double, or string.
•	If the data type is int, multiply the number by 2.
•	If the data type is real, multiply the number by 1.5 and format it to the second decimal point.
•	If the data type is a string, surround the input with "$".
Try to solve the problem using only one method with different overloads.

 */