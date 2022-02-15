package fund05Lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund02ChangeList2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String commandMain = data[0];
            switch (commandMain) {
                case "Delete":
                    int numberToDel = Integer.parseInt(data[1]);
                    numbers.removeIf(num -> (num == numberToDel));
                    break;
                case "Insert":
                    int numberAsElement = Integer.parseInt(data[1]);
                    int index = Integer.parseInt(data[2]);
                    numbers.add(index, numberAsElement);
                    break;
            }

            input = scanner.nextLine();
        }
        numbers.forEach(num -> System.out.printf("%d ", num));
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
