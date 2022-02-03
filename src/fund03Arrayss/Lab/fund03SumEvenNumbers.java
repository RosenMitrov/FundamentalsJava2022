package fund03Arrayss.Lab;

import java.util.Scanner;

//created by R.M.
public class fund03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersAsString = scanner.nextLine().split(" ");

        int sumEven = 0;
        for (int index = 0; index < numbersAsString.length; index++) {
            int number = Integer.parseInt(numbersAsString[index]);
            if (number % 2 == 0) {
                sumEven += number;
            }
        }
        System.out.println(sumEven);
    }
}
/*
3.	Sum Even Numbers
Read an array from the console and sum only the even numbers.
 */