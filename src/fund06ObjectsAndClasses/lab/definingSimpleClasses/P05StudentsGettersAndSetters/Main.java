package fund06ObjectsAndClasses.lab.definingSimpleClasses.P05StudentsGettersAndSetters;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static fund06ObjectsAndClasses.lab.definingSimpleClasses.P05StudentsGettersAndSetters.Student.printStudentsAsPerGivenCityName;

//created by R.M.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> studentsList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            String firstName = data[0];
            String lastName = data[1];
            int age = Integer.parseInt(data[2]);
            String city = data[3];

            Student currentStudent = new Student();
            currentStudent.setFirstName(firstName);
            currentStudent.setLastName(lastName);
            currentStudent.setAge(age);
            currentStudent.setCity(city);
            studentsList.add(currentStudent);
            input = scanner.nextLine();
        }
        String cityName = scanner.nextLine();
        printStudentsAsPerGivenCityName(studentsList, cityName);

    }
}
/*
Define a class Student, which holds the following information about students:
first name, last name, age, and hometown.
Read the list of students until you receive the "end" command.
After that, you will receive a city name.
Print only students which are from the given city,
in the following format: "{firstName} {lastName} is {age} years old".

 */