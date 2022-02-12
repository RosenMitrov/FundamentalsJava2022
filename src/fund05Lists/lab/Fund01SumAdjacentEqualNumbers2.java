package fund05Lists.lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund01SumAdjacentEqualNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Double::parseDouble).collect(Collectors.toList());

        List<Double> nextNumbers = sumAdjacentEqualNumbers(numbers);
        while (nextNumbers.size() != numbers.size()) {
            numbers = nextNumbers;
            nextNumbers = sumAdjacentEqualNumbers(numbers);

        }
        String output = joinElementsByDelimiter(numbers);
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(List<Double> numbers) {
        StringBuilder builderOutput = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for (Double number : numbers) {
            builderOutput.append(decimalFormat.format(number));
            builderOutput.append(" ");
        }
        return builderOutput.toString();
    }

    private static List<Double> sumAdjacentEqualNumbers(List<Double> numbers) {
        List<Double> nextNumbers = new ArrayList<>();
        int i = 0;
        while (i < numbers.size()) {
            if (i < numbers.size() - 1 && numbers.get(i).equals(numbers.get(i + 1))) {
                nextNumbers.add(numbers.get(i) + numbers.get(i + 1));
                i += 2;
            } else {
                nextNumbers.add(numbers.get(i));
                i++;
            }
        }
        return nextNumbers;
    }
}
/*
1.	Sum Adjacent Equal Numbers
Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.

	After two numbers are summed, the obtained result could be equal to some of its neighbors and should be summed as well (see the examples below).
	Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).

 */