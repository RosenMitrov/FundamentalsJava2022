package fund04Methods.lab;

import java.util.Scanner;

//created by R.M.
public class fund02Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        printCorrespondingGrade(grade);
    }

    public static void printCorrespondingGrade(double grade) {
        if (grade >= 2.00 && grade <= 2.99) {
            System.out.println("Fail");
        } else {
            if (grade >= 3.00 && grade <= 3.49) {
                System.out.println("Poor");
            } else {
                if (grade >= 3.50 && grade <= 4.49) {
                    System.out.println("Good");
                } else {
                    if (grade >= 4.50 && grade <= 5.49) {
                        System.out.println("Very good");
                    } else {
                        if (grade >= 5.50 && grade <= 6.00) {
                            System.out.println("Excellent");
                        }
                    }
                }
            }
        }
    }
}
/*
Write a method that receives a grade between 2.00 and 6.00 and prints the corresponding grade in words:
•	2.00 – 2.99 - "Fail"
•	3.00 – 3.49 - "Poor"
•	3.50 – 4.49 - "Good"
•	4.50 – 5.49 - "Very good"
•	5.50 – 6.00 - "Excellent"

 */