package examsFundamentals.MidExam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//created by R.M.
public class P03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int[] numbersArray = getArray(line);
        int sumOfAllNumbers = getSumOfAllNumbers(numbersArray);
        double averageValue = sumOfAllNumbers * 1.0 / numbersArray.length;
        getListInDescendingOrder(numbersArray);
        List<Integer> topNumbers = getTopNumbers(numbersArray, averageValue);
        if (topNumbers.size() > 0) {
            printTopNumbers(topNumbers);
        } else {
            System.out.println("No");
        }
    }

    private static void printTopNumbers(List<Integer> topNumbers) {
        for (int i = 0; i < topNumbers.size(); i++) {
            System.out.printf("%d ", topNumbers.get(i));
        }
    }

    private static void getListInDescendingOrder(int[] numbersArray) {
        for (int index = 0; index < numbersArray.length - 1; index++) {
            int first = numbersArray[index];
            int second = numbersArray[index + 1];
            if (first < second) {
                numbersArray[index] = second;
                numbersArray[index + 1] = first;
                index = -1;
            }
        }
    }

    private static List<Integer> getTopNumbers(int[] numbersArray, double averageValue) {

        List<Integer> currentList = new ArrayList<>();
        for (int index = 0; index < numbersArray.length; index++) {
            if (averageValue < numbersArray[index]) {
                currentList.add(numbersArray[index]);
                if (currentList.size() == 5) {
                    break;
                }
            }
        }
        return currentList;
    }

    private static int getSumOfAllNumbers(int[] numbersArray) {
        int sumOfAllNum = 0;
        for (int index = 0; index < numbersArray.length; index++) {
            sumOfAllNum += numbersArray[index];
        }
        return sumOfAllNum;
    }

    private static int[] getArray(String line) {
        String[] numbersAsString = line.split(" ");
        int[] numbersArray = new int[numbersAsString.length];
        for (int index = 0; index < numbersAsString.length; index++) {
            numbersArray[index] = Integer.parseInt(numbersAsString[index]);
        }
        return numbersArray;
    }
}
/*
Write a program to read a sequence of integers and find and print the top 5 numbers greater than the average value in the sequence, sorted in descending order.
Input
•	Read from the console a single line holding space-separated integers.
Output
•	Print the above-described numbers on a single line, space-separated.
•	If less than 5 numbers hold the property mentioned above, print less than 5 numbers.
•	Print "No" if no numbers hold the above property.
Constraints
•	All input numbers are integers in the range [-1 000 000 … 1 000 000].
•	The count of numbers is in the range [1…10 000].

 */