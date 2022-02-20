package examsFundamentals.MidExam01;

import java.util.Scanner;

//created by R.M.
public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int[] lift = getLiftArr(input);

        int capacity = 4;
        boolean isEnough = false;
        boolean isFull = false;

        for (int index = 0; index < lift.length; index++) {

            while (lift[index] != capacity) {
                lift[index] += 1;
                people--;
                if (people == 0) {
                    isEnough = true;
                    if (lift[index] == capacity && index == lift.length - 1) {
                        isFull = true;
                    }
                    break;
                }
            }
            if (isEnough) {
                break;
            }
        }
        if (isEnough && !isFull) {
            System.out.println("The lift has empty spots!");
            printArray(lift);

        }
        if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
            printArray(lift);
        }
        if (isFull) {
            printArray(lift);
        }
    }

    private static void printArray(int[] lift) {
        for (int i : lift) {
            System.out.printf("%d ", i);
        }
    }

    private static int[] getLiftArr(String input) {
        String[] numbersAsArr = input.split(" ");
        int[] lift = new int[numbersAsArr.length];
        for (int index = 0; index < numbersAsArr.length; index++) {
            lift[index] = Integer.parseInt(numbersAsArr[index]);
        }
        return lift;
    }
}
/*
Write a program that finds a place for the tourist on a lift.
Every wagon should have a maximum of 4 people on it. If a wagon is full, you should direct the people to the next one with space available.
Input
•	On the first line, you will receive how many people are waiting to get on the lift
•	On the second line, you will receive the current state of the lift separated by a single space: " ".
Output
When there is no more available space left on the lift, or there are no more people in the queue,
you should print on the console the final state of the lift's wagons separated by " " and one of the following messages:
•	If there are no more people and the lift have empty spots, you should print:
"The lift has empty spots!
{wagons separated by ' '}"
•	If there are still people in the queue and no more available space, you should print:
"There isn't enough space! {people} people in a queue!
{wagons separated by ' '}"
•	If the lift is full and there are no more people in the queue, you should print only the wagons separated by " "

 */