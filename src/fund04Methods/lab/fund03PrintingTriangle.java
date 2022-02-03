package fund04Methods.lab;

import java.util.Scanner;

//created by R.M.
public class fund03PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        printTriangle(number);
    }

    public static void printTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            printLine(i);
        }
        for (int i = number - 1; i >= 1; i--) {
            printLine(i);
        }
    }

    public static void printLine(int lines) {
        for (int i = 1; i <= lines; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
/*
3.	Printing Triangle
Create a method for printing triangles as shown below:
3

1
1 2
1 2 3
1 2
1

 */