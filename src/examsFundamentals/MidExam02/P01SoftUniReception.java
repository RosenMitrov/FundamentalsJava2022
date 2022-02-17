package examsFundamentals.MidExam02;

import java.util.Scanner;

//created by R.M.
public class P01SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int thirdEmployee = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = firstEmployee + secondEmployee + thirdEmployee;

        int studentsCount = Integer.parseInt(scanner.nextLine());
        int hours = 0;

        while (studentsCount > 0) {
            hours++;

            if (hours % 4 != 0) {
                studentsCount -= studentsPerHour;
            }
        }
        System.out.printf("Time needed: %dh.", hours);
    }
}
/*
Every day, thousands of students pass by the reception at SoftUni with different questions to ask.
The employees have to help everyone by providing all the information and answering all the questions.
Three employees are working on the reception all day. Each of them can handle a different number of students per hour.
Your task is to calculate how much time it will take to answer all the questions of a given number of students.
First, you will receive 3 lines with integers, representing the number of students that each employee can help per hour.
On the following line, you will receive students count as a single integer.
Every fourth hour, all employees have a break, so they don't work for an hour.
It is the only break for the employees, because they don't need to rest, nor have a personal life.
Calculate the time needed to answer all the student's questions and print it in the following format:
"Time needed: {time}h."

Input / Constraints
•	On the first three lines -  each employee efficiency -  integer in the range [1 - 100]
•	On the fourth line - students count – integer in the range [0 – 10000]
•	Input will always be valid and in the range specified
Output
•	Print a single line: "Time needed: {time}h."
•	Allowed working time / memory: 100ms / 16 MB
 */