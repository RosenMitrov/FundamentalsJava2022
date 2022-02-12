package fund05Lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersFirst = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numbersSecond = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> mergedList = new ArrayList<>();

        int minListSize = Integer.min(numbersFirst.size(), numbersSecond.size());

        getNumbersToMinSizeList(minListSize, mergedList, numbersFirst, numbersSecond);

        int maxListSize = Integer.max(numbersFirst.size(), numbersSecond.size());

        getRestOfTheList(minListSize, maxListSize, mergedList, numbersFirst, numbersSecond);

        mergedList.forEach(el -> System.out.printf("%d ", el));

    }

    private static void getNumbersToMinSizeList(int minListSize, List<Integer> mergedList, List<Integer> numbersFirst, List<Integer> numbersSecond) {
        for (int i = 0; i < minListSize; i++) {
            mergedList.add(numbersFirst.get(i));
            mergedList.add(numbersSecond.get(i));
        }
    }

    public static void getRestOfTheList(int minListSize, int maxListSize, List<Integer> mergedList, List<Integer> numbersFirst, List<Integer> numbersSecond) {
        for (int i = minListSize; i < maxListSize; i++) {
            if (numbersFirst.size() >= numbersSecond.size()) {
                mergedList.add(numbersFirst.get(i));
            } else {
                mergedList.add(numbersSecond.get(i));
            }
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