package fund05Lists.moreExercises;

import java.util.*;
import java.util.stream.Collectors;

//created by R.M.
public class Fund04MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOne = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listTwo = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int minSizeList = Math.min(listOne.size(), listTwo.size());

        List<Integer> combinedList = new ArrayList<>();

        for (int index = 0; index < minSizeList; index++) {
            combinedList.add(listOne.get(index));
            combinedList.add(listTwo.get(listTwo.size() - 1 - index));
        }
        for (int index = 0; index < minSizeList; index++) {
            listOne.remove(0);
            listTwo.remove(listTwo.size() - 1);
        }
        Collections.sort(combinedList);

        if (listOne.size() > listTwo.size()) {
            Collections.sort(listOne);

            for (int num : combinedList) {
                if (listOne.get(0) < num && listOne.get(1) > num) {
                    System.out.printf("%d ", num);
                }
            }
        } else {
            Collections.sort(listTwo);

            for (int num : combinedList) {
                if (listTwo.get(0) < num && listTwo.get(1) > num) {
                    System.out.printf("%d ", num);
                }
            }
        }

    }


}
/*
Write a program that mixes up two lists by some rules.
You will receive two lines of input, each one being a list of numbers. The mixing rules are:
•	Start from the beginning of the first list and the ending of the second.
•	Add element from the first and element from the second.
•	In the end, there will always be a list in which there are 2 elements remaining.
•	These elements will be the range of the elements you need to print.
•	Loop through the result list and take only the elements that fulfill the condition.
•	Print the elements ordered in ascending order and separated by a space.

 */