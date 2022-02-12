package fund05Lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfIntegers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        for (int i = 0; i < listOfIntegers.size(); i++) {
            int currentNum = listOfIntegers.get(i);
            if (currentNum < 0) {
                listOfIntegers.remove(Integer.valueOf(currentNum));
                i--;
            }
        }
        if (listOfIntegers.isEmpty()){
            System.out.println("empty");
        }else {
            for (int i = listOfIntegers.size() - 1; i >= 0; i--) {
                System.out.printf("%d ", listOfIntegers.get(i));
            }
        }
    }
}
/*
6.	Remove Negatives and Reverse
Read a list of integers,
remove all negative numbers from it and print the remaining elements in reversed order.
In case of no elements left in the list, print "empty".

 */