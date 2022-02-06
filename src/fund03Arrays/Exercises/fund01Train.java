package fund03Arrays.Exercises;

import java.util.Scanner;

//created by R.M.
public class Fund01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int[] train = new int[wagonsCount];

        int peopleSum = 0;
        for (int wagon = 0; wagon < wagonsCount; wagon++) {
            int currentWagon = Integer.parseInt(scanner.nextLine());
            train[wagon] = currentWagon;
            peopleSum += currentWagon;
            System.out.printf("%d ", train[wagon]);
        }
        System.out.printf("%n%d", peopleSum);
    }
}
/*
1.	Train
You will be given a count of wagons in a train n. On the next n lines,
you will receive how many people are going to get on that wagon.
At the end print the whole train and after that the sum of the people on the train.
 */