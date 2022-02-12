package fund05Lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        numbers = getSummedList(numbers);

        numbers.forEach(el -> System.out.printf("%d ", el));
    }

    private static List<Integer> getSummedList(List<Integer> numbers) {
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < numbers.size() / 2; i++) {
            temp.add(numbers.get(i) + numbers.get(numbers.size() - 1 - i));
        }
        if (numbers.size() % 2 != 0) {
            temp.add(numbers.get((numbers.size() / 2)));
        }
        return temp;
    }
}
/*
2.	Gauss' Trick
Write a program that sum all numbers in a list in the following order:
first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.

 */
/*
while (numbers.size() != tempList.size()) {
}
 */