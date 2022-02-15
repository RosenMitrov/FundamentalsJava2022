package fund05Lists.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund07AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> numbersAsString = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(numbersAsString);
        // System.out.println(numbers.toString().replaceAll("[\\[\\],]", "").replaceAll("\\s+", " ").trim());
        String text = "";
        for (int i = 0; i < numbersAsString.size(); i++) {
            text += numbersAsString.get(i);
            text += " ";
        }
        text = text.trim();
        List<Integer> numbers = Arrays.stream(text.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        for (int num : numbers) {
            System.out.printf("%d ", num);
        }
    }
}
/*
7.	Append Arrays
Write a program to append several arrays of numbers.
	Arrays are separated by "|".
	Values are separated by spaces (" ", one or several).
	Order the arrays from the last to the first, and their values from left to right.

 */