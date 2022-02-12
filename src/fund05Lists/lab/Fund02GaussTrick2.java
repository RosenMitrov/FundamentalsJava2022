package fund05Lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund02GaussTrick2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int initialSize = numbers.size();

        for (int i = 0; i < initialSize / 2; i++) {
            int first = numbers.get(i);
            int last = numbers.get(numbers.size() - 1);
            numbers.set(i, first + last);
            numbers.remove(numbers.size() - 1);
        }

        numbers.forEach(el -> System.out.printf("%d ", el));
    }
}
/*
2.	Gauss' Trick
Write a program that sum all numbers in a list in the following order:
first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.

 */