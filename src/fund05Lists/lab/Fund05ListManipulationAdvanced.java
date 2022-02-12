package fund05Lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String mainCommand = tokens[0];
            switch (mainCommand) {
                case "Contains":
                    doesItContentSuchNumber(listOfNumbers, tokens);
                    break;
                case "Print":
                    String evenOrOdd = tokens[1];
                    if (evenOrOdd.equals("even")) {
                        printEvenNumbers(listOfNumbers);
                    } else if (evenOrOdd.equals("odd")) {
                        printOddNumbers(listOfNumbers);
                    }
                    break;
                case "Get":
                    printSumOfAllNumbers(tokens, listOfNumbers);
                    break;
                case "Filter":
                    printNumbersAfterGivenCondition(tokens, listOfNumbers);
                    break;
            }
            input = scanner.nextLine();
        }

    }

    private static void printNumbersAfterGivenCondition(String[] tokens, List<Integer> listOfNumbers) {
        List<Integer> listForPrint = new ArrayList<>();
        String condition = tokens[1];
        int number = Integer.parseInt(tokens[2]);
        switch (condition) {
            case "<":
                for (int numberInList : listOfNumbers) {
                    if (numberInList < number) {
                        listForPrint.add(numberInList);
                    }
                }
                break;
            case ">":
                for (int numberInList : listOfNumbers) {
                    if (numberInList > number) {
                        listForPrint.add(numberInList);
                    }
                }
                break;
            case "<=":
                for (int numberInList : listOfNumbers) {
                    if (numberInList <= number) {
                        listForPrint.add(numberInList);
                    }
                }
                break;
            case ">=":
                for (int numberInList : listOfNumbers) {
                    if (numberInList >= number) {
                        listForPrint.add(numberInList);
                    }
                }
                break;
        }
        listForPrint.forEach(num -> System.out.printf("%d ", num));
        System.out.println();

    }

    private static void printSumOfAllNumbers(String[] tokens, List<Integer> listOfNumbers) {
        int sum = 0;
        for (int num : listOfNumbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    private static void printOddNumbers(List<Integer> listOfNumbers) {
        List<Integer> evenList = new ArrayList<>();
        for (int number : listOfNumbers) {
            if (number % 2 != 0) {
                evenList.add(number);
            }
        }
        for (int evenNumber : evenList) {
            System.out.printf("%d ", evenNumber);
        }
        System.out.println();
    }

    private static void printEvenNumbers(List<Integer> listOfNumbers) {
        List<Integer> evenList = new ArrayList<>();
        for (int number : listOfNumbers) {
            if (number % 2 == 0) {
                evenList.add(number);
            }
        }
        for (int evenNumber : evenList) {
            System.out.printf("%d ", evenNumber);
        }
        System.out.println();

    }

    private static void doesItContentSuchNumber(List<Integer> listOfNumbers, String[] tokens) {
        int number = Integer.parseInt(tokens[1]);
        if (listOfNumbers.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }
}
/*
5.	List Manipulation Advanced
Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
Contains {number} – check if the list contains the number. If yes print "Yes", otherwise print "No such number"
Print even – print all the numbers that are even separated by a space
Print odd – print all the numbers that are oddly separated by a space
Get sum – print the sum of all the numbers
Filter {condition} {number} – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="

 */