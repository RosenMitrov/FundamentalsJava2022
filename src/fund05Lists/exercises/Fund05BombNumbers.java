package fund05Lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String[] data = scanner.nextLine().split(" ");
        int bombNum = Integer.parseInt(data[0]);

        while (numbers.contains(bombNum)) {
            int bombIndex = numbers.indexOf(Integer.parseInt(data[0]));
            int power = Integer.parseInt(data[1]);
            int startIndex = bombIndex - power;
            int endIndex = bombIndex + power;
            if (startIndex < 0) {
                startIndex = 0;
            }
            if (endIndex > numbers.size() - 1) {
                endIndex = numbers.size() - 1;
            }

            numbers.subList(startIndex, endIndex + 1).clear();
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }
}
/*
5.	Bomb Numbers
Write a program that reads a sequence of numbers and a special bomb number with a certain power.
Your task is to detonate every occurrence of the special bomb number
and according to its power - his neighbors from left and right.
Detonations are performed from left to right and all detonated numbers disappear.
Finally, print the sum of the remaining elements in the sequence.

 */