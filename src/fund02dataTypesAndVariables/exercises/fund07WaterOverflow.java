package fund02dataTypesAndVariables.exercises;

import java.util.Scanner;

//created by R.M.
public class Fund07WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacity = 255;
        int lines = Integer.parseInt(scanner.nextLine());

        int tank = 0;
        for (int i = 0; i < lines; i++) {
            int liters = Integer.parseInt(scanner.nextLine());

            if (tank + liters > capacity) {
                System.out.println("Insufficient capacity!");
                continue;
            }
            tank += liters;
        }
        System.out.println(tank);
    }
}
/*
7.	Water Overflow

You have a water tank with a capacity of 255 liters.
On the next n lines, you will receive liters of water,
which you have to pour into your tank.
If the capacity is not enough, print "Insufficient capacity!"
and continue reading the next line. On the last line, print the liters in the tank.

Input
The input will be on two lines:
•	On the first line, you will receive n – the number of lines, which will follow
•	On the next n lines – you receive quantities of water, which you have to pour into the tank
Output
Every time you do not have enough capacity in the tank to pour the given liters, print:
"Insufficient capacity!".
On the last line, print only the liters in the tank.

 */