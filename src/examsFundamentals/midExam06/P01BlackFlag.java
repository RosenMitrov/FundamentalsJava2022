package examsFundamentals.midExam06;

import java.util.Scanner;

//created by R.M.
public class P01BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double gainedPlunder = 0;
        int counterDays = 0;

        while (days > 0) {
            counterDays++;
            gainedPlunder += dailyPlunder;
            if (counterDays % 3 == 0) {
                gainedPlunder += (dailyPlunder * 0.50);
            }
            if (counterDays % 5 == 0) {
                gainedPlunder -= (gainedPlunder * 0.30);
            }
            days--;
        }

        if (gainedPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", gainedPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", (gainedPlunder / expectedPlunder) * 100);
        }
    }
}
/*
Pirates are invading the sea, and you're tasked to help them plunder
Create a program that checks if target plunder is reached.
First, you will receive how many days the pirating lasts.
Then you will receive how much the pirates plunder for a day.
Last you will receive the expected plunder at the end.
Calculate how much plunder the pirates manage to gather.
Each day they gather the plunder.
Keep in mind that they attack more ships every third day and add additional plunder to their total gain,
which is 50% of the daily plunder. Every fifth day the pirates encounter a warship,
and after the battle, they lose 30% of their total plunder.
If the gained plunder is more or equal to the target, print the following:
"Ahoy! {totalPlunder} plunder gained."
If the gained plunder is less than the target. Calculate the percentage left and print the following:
"Collected only {percentage}% of the plunder."
Both numbers should be formatted to the 2nd decimal place.
Input
•	On the 1st line, you will receive the days of the plunder – an integer number in the range [0…100000]
•	On the 2nd line, you will receive the daily plunder – an integer number in the range [0…50]
•	On the 3rd line, you will receive the expected plunder – a real number in the range [0.0…10000.0]
Output
•	 In the end, print whether the plunder was successful or not, following the format described above.

 */