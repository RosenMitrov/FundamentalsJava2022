package fund03Arrays.Lab;

import java.util.Scanner;

//created by R.M.
public class Fund02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputsCount = Integer.parseInt(scanner.nextLine());

        int[] numbersArr = new int[inputsCount];
        for (int i = 0; i < inputsCount; i++) {
            numbersArr[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < numbersArr.length / 2; i++) {
            int last = numbersArr[numbersArr.length - 1 - i];
            int first = numbersArr[i];
            numbersArr[numbersArr.length - 1 - i] = first;
            numbersArr[i] = last;
        }

        for (int num : numbersArr) {
            System.out.printf("%d ", num);
        }
    }
}
/*
2.	Print Numbers in Reverse Order
Read n numbers and print them in reverse order.
 */
