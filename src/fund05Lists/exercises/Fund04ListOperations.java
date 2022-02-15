package fund05Lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String command = data[0];
            switch (command) {
                case "Add":
                    int numberToAdd = Integer.parseInt(data[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(data[1]);
                    int indexToInsert = Integer.parseInt(data[2]);
                    if (isValidIndex(indexToInsert, numbers)) {
                        numbers.add(indexToInsert, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int removeIndex = Integer.parseInt(data[1]);
                    if (isValidIndex(removeIndex, numbers)) {
                        numbers.remove(removeIndex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String leftOrRight = data[1];
                    int countTimes = Integer.parseInt(data[2]);
                    if (leftOrRight.equals("left")) {
                        leftShifts(countTimes, numbers);
                    } else if (leftOrRight.equals("right")) {
                        rightShifts(countTimes, numbers);
                    }
                    break;

            }

            input = scanner.nextLine();
        }
        for (int num : numbers) {
            System.out.printf("%d ", num);
        }
    }

    private static boolean isValidIndex(int index, List<Integer> numbers) {
        return index >= 0 && index < numbers.size();
    }

    private static void rightShifts(int countTimes, List<Integer> numbers) {
        while (countTimes > 0) {
            numbers.add(0, numbers.get(numbers.size() - 1));
            numbers.remove(numbers.size() - 1);
            countTimes--;
        }
    }

    private static void leftShifts(int countTimes, List<Integer> numbers) {
        while (countTimes > 0) {
            numbers.add(numbers.get(0));
            numbers.remove(0);
            countTimes--;
        }
    }
}
/*
4.	List Operations
You will be given numbers (list of integers) on the first input line.
Until you receive "End" you will be given operations you have to apply on the list.

The possible commands are:
•	Add {number} - add number at the end
•	Insert {number} {index} - insert number at given index
•	Remove {index} - remove that index
•	Shift left {count} - first number becomes last 'count' times
•	Shift right {count} - last number becomes first 'count' times

Note: The index given may be outside the bounds of the array. In that case print "Invalid index".

 */