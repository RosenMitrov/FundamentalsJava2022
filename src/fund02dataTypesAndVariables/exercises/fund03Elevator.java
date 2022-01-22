package fund02dataTypesAndVariables.exercises;

import java.util.Scanner;

//created by R.M.
public class fund03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(people / capacity);

        if (courses % 2 == 0 && people > capacity) {
            System.out.printf("%.0f", courses);
        } else {
            System.out.printf("%.0f", courses + 1);
        }
    }
}
/*
Calculate how many courses will be needed to elevate n persons by using an elevator with a capacity of p persons.
The input holds two lines: the number of people n and the capacity p of the elevator.
 */