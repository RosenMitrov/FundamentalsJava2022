package fund05Lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String commandMain = data[0];
            switch (commandMain) {
                case "Delete":
                    removeAll(data, numbers);
                    break;
                case "Insert":
                    insertElementAtIndex(data, numbers);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void insertElementAtIndex(String[] data, List<Integer> numbers) {
        int numberElement = Integer.parseInt(data[1]);
        int index = Integer.parseInt(data[2]);
        numbers.add(index, numberElement);
    }

    private static void removeAll(String[] data, List<Integer> numbers) {
        int numberElement = Integer.parseInt(data[1]);
        int index = 0;
        while (index != numbers.size()) {
            int currentNumber = numbers.get(index);
            int numToRemove = Integer.parseInt(data[1]);
            if (currentNumber == numToRemove) {
                numbers.remove(index);
            } else {
                index++;
            }
        }
    }
}
/*
2.	Change List
Write a program, which reads a list of integers from the console and receives commands,
which manipulate the list. Your program may receive the following commands:

•	Delete {element} - delete all elements in the array, which are equal to the given element
•	Insert {element} {position} - insert element at the given position
You should stop the program when you receive the command "end". Print all numbers in the array separated with a single whitespace.

 */