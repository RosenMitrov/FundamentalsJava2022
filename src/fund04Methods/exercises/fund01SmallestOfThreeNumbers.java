package fund04Methods.exercises;

import java.util.Scanner;

//created by R.M.
public class fund01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        int result = getSmallest(num1, num2, num3);
        System.out.println(result);
    }

    private static int getSmallest(int num1, int num2, int num3) {

        if (num1 >= num2 && num1 >= num3) {
            return Math.min(num2, num3);
        } else if (num2 >= num1 && num2 >= num3) {
            return Math.min(num1, num3);
        } else  {//if (num3 >= num2 && num3 >= num1)
            return Math.min(num2, num1);
        }
    }
}
/*
1.	Smallest of Three Numbers
Write a method to print the smallest of three integer numbers. Use an appropriate name for the method.
 */