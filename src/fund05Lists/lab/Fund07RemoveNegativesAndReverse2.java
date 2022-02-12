package fund05Lists.lab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fund07RemoveNegativesAndReverse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfIntegers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        listOfIntegers.removeIf(num -> num < 0);
        Collections.reverse(listOfIntegers);
        if (listOfIntegers.isEmpty()) {
            System.out.println("empty");
        } else {
            listOfIntegers.forEach(num -> System.out.printf("%d ", num));
            //another way to print the List
//            System.out.println(listOfIntegers.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
