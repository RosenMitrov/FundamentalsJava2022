package fund03Arrayss.Exercises;

import java.util.Scanner;

//created by R.M.
public class fund03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        String[] firstArr = new String[lines];
        String[] secondArr = new String[lines];

        for (int i = 0; i < lines; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String tokenOne = tokens[0];
            String tokenTwo = tokens[1];

            if ((i + 1) % 2 != 0) {
                firstArr[i] = tokenOne;
                secondArr[i] = tokenTwo;
            } else {
                firstArr[i] = tokenTwo;
                secondArr[i] = tokenOne;
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));
    }
}
/*
3.	Zig-Zag Arrays
Write a program that creates 2 arrays.
You will be given an integer n. On the next n lines, you get 2 integers. Form 2 arrays as shown below.

 */
