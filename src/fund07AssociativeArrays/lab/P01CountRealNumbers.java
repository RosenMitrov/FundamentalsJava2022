package fund07AssociativeArrays.lab;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

//created by R.M.
public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> countsMap = new TreeMap<>();

        for (Double num : numbers) {
            if (!countsMap.containsKey(num)) {
                countsMap.put(num, 0);
            }
            countsMap.put(num, countsMap.get(num) + 1);
        }

        for (Map.Entry<Double, Integer> entry : countsMap.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }
    }
}
/*
1.	Count Real Numbers
Read a list of real numbers and print them in ascending order along with their number of occurrences.

 */