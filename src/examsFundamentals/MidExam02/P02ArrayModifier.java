package examsFundamentals.MidExam02;

import java.util.Scanner;

//created by R.M.
public class P02ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String linesForArr = scanner.nextLine();
        int[] numbersArray = getArray(linesForArr);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String command = data[0];
            switch (command) {
                case "swap":
                    int swapIndexOne = Integer.parseInt(data[1]);
                    int swapIndexTwo = Integer.parseInt(data[2]);
                    int tempSwapOne = numbersArray[swapIndexOne];
                    numbersArray[swapIndexOne] = numbersArray[swapIndexTwo];
                    numbersArray[swapIndexTwo] = tempSwapOne;
                    break;
                case "multiply":
                    int multiplyIndexOne = Integer.parseInt(data[1]);
                    int multiplyIndexTwo = Integer.parseInt(data[2]);
                    int valuesMultiplied = numbersArray[multiplyIndexOne] * numbersArray[multiplyIndexTwo];
                    numbersArray[multiplyIndexOne] = valuesMultiplied;
                    break;
                case "decrease":
                    for (int index = 0; index < numbersArray.length; index++) {
                        numbersArray[index] = numbersArray[index] - 1;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        printArray(numbersArray);
    }

    private static void printArray(int[] numbersArray) {
        for (int index = 0; index < numbersArray.length; index++) {
            if (index == numbersArray.length - 1) {
                System.out.println(numbersArray[index]);
                break;
            }
            System.out.printf("%d, ", numbersArray[index]);
        }
    }

    private static int[] getArray(String linesForArr) {
        String[] numbersAsString = linesForArr.split(" ");
        int[] numbersArray = new int[numbersAsString.length];
        for (int index = 0; index < numbersAsString.length; index++) {
            numbersArray[index] = Integer.parseInt(numbersAsString[index]);
        }
        return numbersArray;
    }
}
/*
You are given an array with integers. Write a program to modify the elements after receiving the following commands:
•	"swap {index1} {index2}" takes two elements and swap their places.
•	"multiply {index1} {index2}" takes element at the 1st index and multiply it with the element at 2nd index. Save the product at the 1st index.
•	"decrease" decreases all elements in the array with 1.
Input
On the first input line, you will be given the initial array values separated by a single space.
On the next lines you will receive commands until you receive the command "end". The commands are as follow:
•	"swap {index1} {index2}"
•	"multiply {index1} {index2}"
•	"decrease"
Output
The output should be printed on the console and consist of elements of the modified array – separated by a comma and a single space ", ".
Constraints
•	Elements of the array will be integer numbers in the range [-231...231]
•	Count of the array elements will be in the range [2...100]
•	Indexes will be always in the range of the array

 */