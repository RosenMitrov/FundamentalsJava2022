package fund04Methods.exercises;

import java.util.Scanner;

//created by R.M.
public class fund07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        printRowsAndLines(num);
    }

    public static void printLine(int num) {
        for (int i = 0; i < num; i++) {
            System.out.printf("%d ", num);
        }
    }

    public static void printRowsAndLines(int num) {
        for (int i = 0; i < num; i++) {
            printLine(num);
            System.out.println();
        }
    }
}
/*
7.	NxN Matrix
Write a method that receives a single integer n and prints nxn matrix with that number.

 */