package fund05Lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund03MergingLists2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersFirst = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbersSecond = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int minSizeList = Integer.min(numbersFirst.size(), numbersSecond.size());
        int maxSizeList = Integer.max(numbersFirst.size(), numbersSecond.size());
        List<Integer> mergedList = new ArrayList<>();
        getNumbersToMinSizeList(minSizeList, numbersFirst, numbersSecond, mergedList);
        getNumbersFromMinToMaxSize(minSizeList, maxSizeList, mergedList, numbersFirst, numbersSecond);

        printMergedList(mergedList);
    }

    private static void printMergedList(List<Integer> mergedList) {
        for (Integer num : mergedList) {
            System.out.printf("%d ", num);
        }
    }

    private static void getNumbersFromMinToMaxSize(int minSizeList, int maxSizeList, List<Integer> mergedList, List<Integer> numbersFirst, List<Integer> numbersSecond) {
        if (numbersFirst.size() >= numbersSecond.size()) {
            mergedList.addAll(numbersFirst.subList(minSizeList, maxSizeList));
        } else {
            mergedList.addAll(numbersSecond.subList(minSizeList, maxSizeList));
        }
    }

    private static void getNumbersToMinSizeList(int minSizeList, List<Integer> numbersFirst, List<Integer> numbersSecond, List<Integer> mergedList) {
        for (int i = 0; i < minSizeList; i++) {
            mergedList.add(numbersFirst.get(i));
            mergedList.add(numbersSecond.get(i));
        }
    }
}
/*
3.	Merging Lists
You are going to receive two lists with numbers.
Create a result list that contains the numbers from both of the lists.
The first element should be from the first list,
the second from the second list, and so on.
If the length of the two lists is not equal,
just add the remaining elements at the end of the list.
 */