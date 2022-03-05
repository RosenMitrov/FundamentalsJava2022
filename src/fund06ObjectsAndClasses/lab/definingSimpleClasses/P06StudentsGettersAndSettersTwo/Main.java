package fund06ObjectsAndClasses.lab.definingSimpleClasses.P06StudentsGettersAndSettersTwo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static fund06ObjectsAndClasses.lab.definingSimpleClasses.P06StudentsGettersAndSettersTwo.StudentTwo.*;

//created by R.M.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<StudentTwo> studentTwoList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] data = input.split(" ");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String city = data[3];
            StudentTwo currentStudent = new StudentTwo();

            if (isStudentExisting(studentTwoList, firstName, lastName)) {
                currentStudent = getStudent(studentTwoList, firstName, lastName);
                currentStudent.setFirstName(firstName);
                currentStudent.setLastName(lastName);
                currentStudent.setAge(age);
                currentStudent.setCity(city);
            } else {
                currentStudent.setFirstName(firstName);
                currentStudent.setLastName(lastName);
                currentStudent.setAge(age);
                currentStudent.setCity(city);
                studentTwoList.add(currentStudent);
            }

            input = scanner.nextLine();
        }
        String givenCity = scanner.nextLine();

        printInfoAsPerGivenCity(studentTwoList, givenCity);
    }
}
/*
Define a class Student, which holds the following information about students:
first name, last name, age and hometown.
Read list of students until you receive "end" command.
After that, you will receive a city name.
Print only students which are from the given city, in the following format:
"{firstName} {lastName} is {age} years old".

6.	Students 2.0
Use the class from the previous problem.
If you receive a student which already exists (first name and last name should be unique) overwrite the information.

 */
