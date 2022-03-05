package fund06ObjectsAndClasses.exercises.P05Students;

//created by R.M.
public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public double getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return String.format("%s %s: %.2f", this.firstName, this.lastName, this.grade);
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