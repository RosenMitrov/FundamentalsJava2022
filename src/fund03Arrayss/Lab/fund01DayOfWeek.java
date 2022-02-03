package fund03Arrayss.Lab;

import java.util.Scanner;

//created by R.M.
public class fund01DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] daysOfWeekArray = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
        };
        int input = Integer.parseInt(scanner.nextLine());

        if (input >= 1 && input <= 7) {
            String outputDay = daysOfWeekArray[input - 1];
            System.out.println(outputDay);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
/*
1.	Day of Week
Enter a day number and print the day name (in English) or "Invalid day!".
Use an array of strings.

 */
