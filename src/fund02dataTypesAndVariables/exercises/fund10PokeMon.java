package fund02dataTypesAndVariables.exercises;

import java.util.Scanner;

public class Fund10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());
        int distance = Integer.parseInt(scanner.nextLine());
        int exhaustion = Integer.parseInt(scanner.nextLine());

        int countPokes = 0;
        int initialPower = power;

        while (power >= distance) {
            power -= distance;
            countPokes++;
            if ((power == initialPower / 2) && exhaustion != 0) {
                power /= exhaustion;
            }
        }
        System.out.println(power);
        System.out.println(countPokes);
    }
}
/*

N POWER
M DISTANCE
Y EXHAUSTION

10.	*Poke Mon
A Poke Mon is a special type of pokemon which likes to Poke others. But at the end of the day,
the Poke Mon wants to keep statistics, about how many pokes it has managed to make.

The Poke Mon pokes his target and then proceeds to poke another target. The distance between his targets reduces his poke power.
You will be given the poke power the Poke Mon has, N POWER– an integer.
Then you will be given the distance between the poke targets, M DISTANCE– an integer.
Then you will be given the exhaustionFactor Y EXHAUSTION – an integer.

Your task is to start subtracting M DISTANCE from N POWER until N POWER becomes less than M DISTANCE,
i.e. the Poke Mon does not have enough power to reach the next target.
Every time you subtract M DISTANCE from N POWER that means you’ve reached a target
and poked it successfully. COUNT how many targets you’ve poked – you’ll need that count.
The Poke Mon becomes gradually more exhausted.
IF N POWER becomes equal to EXACTLY 50 % of its original value, you must divide N POWER by Y EXHAUSTION, if it is POSSIBLE.
This DIVISION is between integers.
If a division is not possible, you should NOT do it. Instead, you should continue subtracting.
After dividing, you should continue subtracting from N POWER, until it becomes less than M DISTANCE.
When N POWER becomes less than M DISTANCE, you must take what has remained of N POWER and the count of targets you’ve poked, and print them as output.

NOTE: When you are calculating percentages, you should be PRECISE at maximum.
Example: 505 is NOT EXACTLY 50 % from 1000, its 50.5 %.
Input
•	The input consists of 3 lines.
•	On the first line, you will receive N  POWER – an integer.
•	On the second line, you will receive M DISTANCE – an integer.
•	On the third line, you will receive Y EXHAUSTION – an integer.
Output
•	The output consists of 2 lines.
•	On the first line, print what has remained of N, after subtracting from it.
•	On the second line, print the count of targets, you’ve managed to poke.

 */