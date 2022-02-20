package algorithms;

import java.util.Scanner;

public class InsertElementAtGivenIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArray = new int[]{100, 200, 300, 400, 500, 600};
        //There is no validation check in this code, and it must always be valid!


        System.out.print("Enter a valid index: ");
        int givenIndex = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter an insert value : ");
        int numberToInsert = Integer.parseInt(scanner.nextLine());
        System.out.print("Print the original Array: ");
        printArray(numbersArray);
        numbersArray = getArrayWithRemovedLastElement(numbersArray, givenIndex, numberToInsert);
        System.out.print("Print the modified array: ");
        printArray(numbersArray);
    }

    private static int[] getArrayWithRemovedLastElement(int[] numbersArray, int givenIndex, int numberToInsert) {
        int[] tempArray = new int[numbersArray.length + 1];
        int check = 0;
        for (int index = 0; index < tempArray.length; index++) {
            if (index != givenIndex) {
                tempArray[index] = numbersArray[index - check];
            }
            if (index == givenIndex) {
                check++;

            }
            if (check == 1) {
                tempArray[givenIndex] = numberToInsert;

            }

        }
        return tempArray;
    }

    private static void printArray(int[] numbersArray) {
        for (int num : numbersArray) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
