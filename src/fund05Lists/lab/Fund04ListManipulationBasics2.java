package fund05Lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund04ListManipulationBasics2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            String mainCommand = data[0];
            switch (mainCommand) {
                case "Add":
                    listOfNumbers = addedNumberAtTheEnd(listOfNumbers, data);
                    break;
                case "Remove":
                    listOfNumbers = removeValueOfTheList(listOfNumbers, data);
                    break;
                case "RemoveAt":
                    listOfNumbers = removeNumbersAtIndex(listOfNumbers, data);
                    break;
                case "Insert":
                    listOfNumbers = insertNumberAtIndex(listOfNumbers, data);
                    break;
            }

            input = scanner.nextLine();
        }
        System.out.println(listOfNumbers.toString().replaceAll("[\\[\\],]", ""));
    }

    private static List<Integer> insertNumberAtIndex(List<Integer> listOfNumbers, String[] data) {
        List<Integer> tempList;
        tempList = listOfNumbers;
        int numberToInsert = Integer.parseInt(data[1]);
        int insertAtIndex = Integer.parseInt(data[2]);
        tempList.add(insertAtIndex, numberToInsert);
        return tempList;
    }

    private static List<Integer> removeNumbersAtIndex(List<Integer> listOfNumbers, String[] data) {
        List<Integer> tempList;
        tempList = listOfNumbers;
        int removeNumberAtIndex = Integer.parseInt(data[1]);
        tempList.remove(removeNumberAtIndex);
        return tempList;
    }

    private static List<Integer> removeValueOfTheList(List<Integer> listOfNumbers, String[] data) {
        List<Integer> tempList;
        tempList = listOfNumbers;
        int numberToRemove = Integer.parseInt(data[1]);
        tempList.remove(Integer.valueOf(numberToRemove));
        return tempList;
    }

    public static List<Integer> addedNumberAtTheEnd(List<Integer> listOfNumbers, String[] data) {
        List<Integer> tempList;
        tempList = listOfNumbers;
        int numberToAdd = Integer.parseInt(data[1]);
        tempList.add(numberToAdd);
        return tempList;
    }
}
/*
4.	List Manipulation Basics
Write a program that reads a list of integers.
Then until you receive "end", you will be given different commands:

Add {number}: add a number to the end of the list
Remove {number}: remove a number from the list
RemoveAt {index}: remove a number at a given index
Insert {number} {index}: insert a number at a given index
Note: All the indices will be valid!
When you receive the "end" command print the final state of the list (separated by spaces).

 */