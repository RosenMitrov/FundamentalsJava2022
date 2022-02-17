package examsFundamentals.MidExam03;

import java.util.Scanner;

//created by R.M.
public class P02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLineOfNumbers = scanner.nextLine();
        int[] sequenceOfNumbers = getIntArray(inputLineOfNumbers, " ");

        String input = scanner.nextLine();
        int shotTarget = 0;
        while (!input.equals("End")) {
            int currentIndex = Integer.parseInt(input);
            if (isValidIndex(currentIndex, sequenceOfNumbers)) {
                int currentInt = sequenceOfNumbers[currentIndex];
                if (currentInt != -1) {
                    sequenceOfNumbers[currentIndex] = -1;
                    shotTarget++;
                }
                gerModifiedSequenceOfIntegers(currentInt, sequenceOfNumbers);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", shotTarget);
        printArray(sequenceOfNumbers);
    }

    private static void printArray(int[] sequenceOfIntegers) {
        for (int index = 0; index < sequenceOfIntegers.length; index++) {
            System.out.printf("%d ", sequenceOfIntegers[index]);
        }
    }


    private static void gerModifiedSequenceOfIntegers(int currentInt, int[] sequenceOfIntegers) {
        for (int index = 0; index < sequenceOfIntegers.length; index++) {
            int currentTarget = sequenceOfIntegers[index];
            if (currentTarget != -1) {
                if (currentTarget > currentInt) {
                    sequenceOfIntegers[index] = currentTarget - currentInt;
                } else {
                    sequenceOfIntegers[index] = currentTarget + currentInt;
                }
            }
        }
    }

    private static boolean isValidIndex(int index, int[] integers) {
        return index >= 0 && index < integers.length;
    }

    public static int[] getIntArray(String input, String delimiter) {
        String[] numbersAsArray = input.split(delimiter);
        int[] numbersArr = new int[numbersAsArray.length];

        for (int index = 0; index < numbersAsArray.length; index++) {
            numbersArr[index] = Integer.parseInt(numbersAsArray[index]);
        }

        return numbersArr;
    }
}
/*
Write a program that helps you keep track of your shot targets.
You will receive a sequence with integers, separated by a single space,
representing targets and their value. Afterward, you will be receiving indices until the "End" command is given,
and you need to print the targets and the count of shot targets.
Every time you receive an index, you need to shoot the target on that index, if it is possible.
Every time you shoot a target, its value becomes -1, and it is considered shot. Along with that, you also need to:
•	Reduce all the other targets, which have greater values than your current target, with its value.
•	Increase all the other targets, which have less than or equal value to the shot target, with its value.
Keep in mind that you can't shoot a target, which is already shot. You also can't increase or reduce a target, which is considered shot.
When you receive the "End" command, print the targets in their current state and the count of shot targets in the following format:
"Shot targets: {count} -> {target1} {target2}… {target n}"
Input / Constraints
•	On the first line of input, you will receive a sequence of integers, separated by a single space – the targets sequence.
•	On the following lines, until the "End" command, you be receiving integers each on a single line – the index of the target to be shot.
Output
•	The format of the output is described above in the problem description.

 */