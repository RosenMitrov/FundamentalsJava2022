package fund07AssociativeArrays.exercises;

import java.util.*;

//created by R.M.
public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> studentsInfoMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] currentStudent = input.split(" : ");
            String courseName = currentStudent[0];
            String name = currentStudent[1];

            if (!studentsInfoMap.containsKey(courseName)) {
                studentsInfoMap.put(courseName, new ArrayList<>());
            }
            studentsInfoMap.get(courseName).add(name);

            input = scanner.nextLine();
        }
        studentsInfoMap.forEach((k, v) -> {
            System.out.printf("%s: %d%n", k, v.size());
            for (String st : v) {
                System.out.printf("-- %s%n", st);
            }
        });
    }
}
/*
6.	Courses
Write a program, which keeps the information about courses.
Each course has a name and registered students.
You will receive the course name and student name until you receive the command "end".
Check if such a course already exists and if not - add the course.
Register the user into the course.
When you do receive the command "end", print the courses with their names and total registered users.
For each contest, print the registered users.
Input
•	Until you receive "end", the input come in the format: "{courseName} : {studentName}".
•	The product data is always delimited by " : ".
Output
•	Print information about each course, following the format:
"{courseName}: {registeredStudents}"
•	Print information about each student, following the format:
"-- {studentName}"

 */