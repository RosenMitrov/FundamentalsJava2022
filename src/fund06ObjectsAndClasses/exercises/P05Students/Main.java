package fund06ObjectsAndClasses.exercises.P05Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//created by R.M.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] personalInfo = scanner.nextLine().split(" ");
            String firstName = personalInfo[0];
            String lastName = personalInfo[1];
            double grade = Double.parseDouble(personalInfo[2]);
            Student currentStudent = new Student(firstName, lastName, grade);
            studentsList.add(currentStudent);
        }
        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : studentsList) {
            System.out.println(student);
        }
    }
}
/*
5.	Students
Write a program that receives n count of students and orders them by grade (in descending).
Each student should have firstname (string), lastname (string) and grade (floating-point number).
Input
•	First line will be a number n
•	Next n lines you will get a student info in the format "{first name} {second name} {grade}"
Output
•	Print each student in the following format "{first name} {second name}: {grade}"

 */