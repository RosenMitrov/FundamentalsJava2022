package fund06ObjectsAndClasses.lab.definingSimpleClasses.P05StudentsConstructor;

import java.util.List;

//created by R.M.
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    Student(String firstName, String lastName, int age, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getCity() {
        return this.city;
    }

    public static void printStudentAsPerGivenCity(List<Student> studentsList, String givenCity) {
        for (Student student : studentsList) {
            if (givenCity.equals(student.getCity())) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
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
