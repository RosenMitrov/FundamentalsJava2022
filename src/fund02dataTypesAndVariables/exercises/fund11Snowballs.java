package fund02dataTypesAndVariables.exercises;

import java.util.Scanner;

//created by R.M.
public class Fund11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double maxSnowballValue = Double.MIN_VALUE;

        int snowballSnowMax = 0;
        int snowballTimeMax = 0;
        int snowballQualityMax = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());
            double currentSnowballValue = Math.pow((snowballSnow * 1.0 / snowballTime), snowballQuality);
            if (currentSnowballValue > maxSnowballValue) {
                maxSnowballValue = currentSnowballValue;
                snowballSnowMax = snowballSnow;
                snowballTimeMax = snowballTime;
                snowballQualityMax = snowballQuality;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", snowballSnowMax, snowballTimeMax, maxSnowballValue, snowballQualityMax);
    }
}
/*
11.	*Snowballs
Tony and Andi love playing in the snow and having snowball fights,
but they always argue about which makes the best snowballs.
They have decided to involve you in their fray,
by making you write a program that calculates snowball data and outputs the best snowball value.

You will receive N – an integer, the number of snowballs being made by Tony and Andi.

For each snowball you will receive 3 input lines:
•	On the first line, you will get the snowballSnow – an integer.
•	On the second line, you will get the snowballTime – an integer.
•	On the third line, you will get the snowballQuality – an integer.

For each snowball you must calculate its snowballValue by the following formula:
(snowballSnow / snowballTime) ^ snowballQuality
In the end, you must print the highest calculated snowballValue.
Input
•	On the first input line, you will receive N – the number of snowballs.
•	On the next N * 3 input lines you will be receiving data about snowballs.
Output
•	As output, you must print the highest calculated snowballValue, by the formula, specified above.
•	The output format is:
"{snowballSnow} : {snowballTime} = {snowballValue} ({snowballQuality})"

 */