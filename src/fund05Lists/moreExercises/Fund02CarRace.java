package fund05Lists.moreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund02CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> track = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        double left = 0;
        for (int i = 0; i < track.size() / 2; i++) {
            int current = track.get(i);
            left += current;
            if (current == 0) {
                left = left * 0.8;
            }
        }
        double right = 0;
        for (int i = 0; i < track.size() / 2; i++) {
            int current = track.get(track.size() - 1 - i);
            right += current;
            if (current == 0) {
                right = right * 0.8;
            }
        }
        if (left > right) {
            System.out.printf("The winner is right with total time: %.1f", right);
        } else if (right > left) {
            System.out.printf("The winner is left with total time: %.1f", left);
        }
    }
}
/*
2.	Car Race
Write a program to calculate the winner of a car race.
You will receive an array of numbers.
Each element of the array represents the time needed to pass through that step (the index).
There are going to be two cars. One of them starts from the left side and the other one starts from the right side.
The middle index of the array is the finish line. (The number of elements of the array will always be odd).
Calculate the total time for each racer to reach the finish (the middle of the array) and print the winner with his total time. (The racer with less time).
If you have a zero in the array, you have to reduce the time of the racer that reached it by 20% (from the time so far).
Print the result in the following format "The winner is {left/right} with total time: {total time}",
formatted with one digit after the decimal point.

 */