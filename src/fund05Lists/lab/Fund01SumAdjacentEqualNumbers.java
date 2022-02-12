package fund05Lists.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//created by R.M.
public class Fund01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        List<Double> numbers = new ArrayList<>();

        for (String stringAsNUmber : inputArr) {
            numbers.add(Double.parseDouble(stringAsNUmber));
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentNum = numbers.get(i);
            double nextNum = numbers.get(i + 1);
            if (currentNum == nextNum) {
                numbers.set(i, currentNum + nextNum);
                numbers.remove(i + 1);
                i = -1;
            }
        }
        String output = joinElementsByDelimiter(numbers);
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(List<Double> numbers) {
        StringBuilder output = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double number : numbers) {
            output.append(decimalFormat.format(number));
            output.append(" ");
        }
        return output.toString();
    }
}
/*
1.	Sum Adjacent Equal Numbers
Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.

	After two numbers are summed, the obtained result could be equal to some of its neighbors and should be summed as well (see the examples below).
	Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).

 */