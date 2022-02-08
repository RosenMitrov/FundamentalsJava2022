package fund04Methods.moreExercises;

import java.util.Scanner;

//created by R.M.
public class Fund04TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sequence = Integer.parseInt(scanner.nextLine());

        printTribonaciiSequence(sequence);
    }

    public static void printTribonaciiSequence(int sequence) {
        int[] tribonacci = new int[sequence];
        if (sequence == 1) {
            System.out.println("1");
        } else if (sequence == 2) {
            System.out.println("1 1");
        } else {
            tribonacci[0] = 1;
            tribonacci[1] = 1;
            tribonacci[2] = 2;
            for (int i = 3; i < tribonacci.length; i++) {
                tribonacci[i] = tribonacci[i - 3] + tribonacci[i - 2] + tribonacci[i - 1];
            }
            for (int num : tribonacci) {
                System.out.printf("%d ", num);
            }
        }
    }
}
/*
4.	Tribonacci Sequence
In the "Tribonacci" sequence, every number is formed by the sum of the previous 3.
You are given a number num. Write a program that prints num numbers from the Tribonacci sequence,
each on a new line, starting from 1.
The input comes as a parameter named num.
The value num will always be a positive integer.

 */