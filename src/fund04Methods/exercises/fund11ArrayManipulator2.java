package fund04Methods.exercises;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class Fund11ArrayManipulator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            String mainCommand = commands[0];
            switch (mainCommand) {
                case "exchange":
                    int index = Integer.parseInt(commands[1]);
                    if (isValidIndex(index, array)) {
                        exchangedArray(index, array);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    String oddOrEvenMax = commands[1];
                    if (oddOrEvenMax.equals("even")) {
                        printMaxEvenIndex(array);
                    } else if (oddOrEvenMax.equals("odd")) {
                        printMaxOddIndex(array);
                    }
                    break;
                case "min":
                    String oddOrEvenMin = commands[1];
                    if (oddOrEvenMin.equals("even")) {
                        printMinEvenIndex(array);
                    } else if (oddOrEvenMin.equals("odd")) {
                        printMinOddIndex(array);
                    }
                    break;
                case "first":
                    int countFirst = Integer.parseInt(commands[1]);
                    String oddOrEvenFirst = commands[2];
                    if (oddOrEvenFirst.equals("even")) {
                        printFirstEven(countFirst, array);
                    } else if (oddOrEvenFirst.equals("odd")) {
                        printFirstOdd(countFirst, array);
                    }
                    break;
                case "last":
                    int countLast = Integer.parseInt(commands[1]);
                    String oddOrEvenLast = commands[2];
                    if (oddOrEvenLast.equals("even")) {
                        printLastEven(countLast, array);
                    } else if (oddOrEvenLast.equals("odd")) {
                        printLastOdd(countLast, array);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        printEndArray(array);
    }

    public static void printEndArray(int[] currentArray) {
        System.out.println(Arrays.toString(currentArray));
    }

    public static boolean isValidIndex(int index, int[] currentArray) {
        return 0 <= index && index <= currentArray.length - 1;
    }

    public static void exchangedArray(int index, int[] currentArray) {
        int[] bufferArrOne = new int[index + 1];
        int[] bufferArrTwo = new int[currentArray.length - index - 1];

        for (int i = 0; i < bufferArrOne.length; i++) {
            bufferArrOne[i] = currentArray[i];
        }
        for (int i = 0; i < bufferArrTwo.length; i++) {
            bufferArrTwo[i] = currentArray[index + 1 + i];
        }

        for (int i = 0; i < bufferArrTwo.length; i++) {
            currentArray[i] = bufferArrTwo[i];
        }
        for (int i = 0; i < bufferArrOne.length; i++) {
            currentArray[bufferArrTwo.length + i] = bufferArrOne[i];
        }
    }

    public static void printMaxEvenIndex(int[] currentArray) {
        int maxNum = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < currentArray.length; i++) {
            int currentNumber = currentArray[i];
            if (currentNumber % 2 == 0 && currentNumber >= maxNum) {
                maxNum = currentNumber;
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void printMaxOddIndex(int[] currentArray) {
        int maxNum = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < currentArray.length; i++) {
            int currentNumber = currentArray[i];
            if (currentNumber % 2 != 0 && currentNumber >= maxNum) {
                maxNum = currentNumber;
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void printMinEvenIndex(int[] currentArray) {
        int minNum = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < currentArray.length; i++) {
            int currentNumber = currentArray[i];
            if (currentNumber % 2 == 0 && currentNumber <= minNum) {
                minNum = currentNumber;
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void printMinOddIndex(int[] currentArray) {
        int minNum = Integer.MAX_VALUE;
        int index = -1;
        for (int i = 0; i < currentArray.length; i++) {
            int currentNumber = currentArray[i];
            if (currentNumber % 2 != 0 && currentNumber <= minNum) {
                minNum = currentNumber;
                index = i;
            }
        }
        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void printFirstEven(int firstCount, int[] currentArray) {
        if (firstCount > currentArray.length) {
            System.out.println("Invalid count");
        } else {
            StringBuilder firstCountEvenElements = new StringBuilder();
            int checkCount = 0;
            for (int i = 0; i < currentArray.length; i++) {
                int currentNumber = currentArray[i];
                if (currentNumber % 2 == 0) {
                    checkCount++;
                    if (firstCount == 0) {
                        break;
                    }
                    firstCountEvenElements.append(currentNumber);
                    if (checkCount == firstCount) {
                        break;
                    }
                    firstCountEvenElements.append(" ");

                }
            }
            String[] tempArr = firstCountEvenElements.toString().split(" ");
            System.out.println(Arrays.toString(tempArr));

        }
    }

    public static void printFirstOdd(int firstCount, int[] currentArray) {
        if (firstCount > currentArray.length) {
            System.out.println("Invalid count");
        } else {
            StringBuilder firstCountOddElements = new StringBuilder();
            int checkCount = 0;
            for (int i = 0; i < currentArray.length; i++) {
                int currentNumber = currentArray[i];
                if (currentNumber % 2 != 0) {
                    checkCount++;
                    if (firstCount == 0) {
                        break;
                    }
                    firstCountOddElements.append(currentNumber);
                    if (checkCount == firstCount) {
                        break;
                    }
                    firstCountOddElements.append(" ");

                }
            }
            String[] tempArr = firstCountOddElements.toString().split(" ");
            System.out.println(Arrays.toString(tempArr));
        }
    }

    public static void printLastEven(int lastCount, int[] currentArray) {
        if (lastCount > currentArray.length) {
            System.out.println("Invalid count");
        } else {
            StringBuilder lastCountEvenElements = new StringBuilder();
            int checkCount = 0;
            for (int i = currentArray.length - 1; i >= 0; i--) {
                int currentNumber = currentArray[i];
                if (currentNumber % 2 == 0) {
                    checkCount++;
                    if (lastCount == 0) {
                        break;
                    }
                    lastCountEvenElements.append(currentNumber);
                    if (checkCount == lastCount) {
                        break;
                    }
                    lastCountEvenElements.append(" ");

                }
            }
            String[] tempArr = lastCountEvenElements.toString().split(" ");
            for (int i = 0; i < tempArr.length / 2; i++) {
                String temp = tempArr[i];
                tempArr[i] = tempArr[tempArr.length - 1 - i];
                tempArr[tempArr.length - 1 - i] = temp;
            }
            System.out.println(Arrays.toString(tempArr));
        }
    }

    public static void printLastOdd(int lastCount, int[] currentArray) {
        if (lastCount > currentArray.length) {
            System.out.println("Invalid count");
        } else {
            StringBuilder lastCountOddElements = new StringBuilder();
            int checkCount = 0;
            for (int i = currentArray.length - 1; i >= 0; i--) {
                int currentNumber = currentArray[i];
                if (currentNumber % 2 != 0) {
                    checkCount++;
                    if (lastCount == 0) {
                        break;
                    }
                    lastCountOddElements.append(currentNumber);
                    if (checkCount == lastCount) {
                        break;
                    }
                    lastCountOddElements.append(" ");
                }
            }
            String[] tempArr = lastCountOddElements.toString().split(" ");
            for (int i = 0; i < tempArr.length / 2; i++) {
                String temp = tempArr[i];
                tempArr[i] = tempArr[tempArr.length - 1 - i];
                tempArr[tempArr.length - 1 - i] = temp;
            }
            System.out.println(Arrays.toString(tempArr));
        }
    }
}
/*
11.	*Array Manipulator
Trifon has finally become a junior developer and has received his first task.
It's about manipulating an array of integers. He is not quite happy about it,
since he hates manipulating arrays. They are going to pay him a lot of money,
though, and he is willing to give somebody half of it if to help him do his job.
You, on the other hand, love arrays (and money) so you decide to try your luck.
The array may be manipulated by one of the following commands:
•	exchange {index} – splits the array after the given index and exchanges the places of the two resulting subarrays. E.g. [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
o	If the index is outside the boundaries of the array, print "Invalid index".
•	max even/odd – returns the INDEX of the max even/odd element -> [1, 4, 8, 2, 3] -> max odd -> print 4
•	min even/odd – returns the INDEX of the min even/odd element -> [1, 4, 8, 2, 3] -> min even > print 3
o	If there are two or more equal min/max elements, return the index of the rightmost one.
o	If a min/max even/odd element cannot be found, print "No matches".
•	first {count} even/odd – returns the first {count} elements -> [1, 8, 2, 3] -> first 2 even -> print [8, 2]
•	last {count} even/odd – returns the last {count} elements -> [1, 8, 2, 3] -> last 2 odd -> print [1, 3]
o	If the count is greater than the array length, print "Invalid count".
o	If there are not enough elements to satisfy the count, print as many as you can. If there are zero even/odd elements, print an empty array "[]".
•	end – stop taking input and print the final state of the array.
Input
•	The input data should be read from the console.
•	On the first line, the initial array is received as a line of integers, separated by a single space.
•	On the next lines, until the command "end" is received, you will receive the array manipulation commands.
•	The input data will always be valid and in the format described. There is no need to check it explicitly.
Output
•	The output should be printed on the console.
•	On a separate line, print the output of the corresponding command.
•	On the last line, print the final array in square brackets with its elements separated by a comma and a space.
•	See the examples below to get a better understanding of your task.
Constraints
•	The number of input lines will be in the range [2 … 50].
•	The array elements will be integers in the range [0 … 1000].
•	The number of elements will be in the range [1 ... 50].
•	The split index will be an integer in the range [-231 … 231 – 1].
•	The first/last count will be an integer in the range [1 … 231 – 1].
•	There will not be redundant whitespace anywhere in the input.
•	Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.

 */