package fund06ObjectsAndClasses.lab.definingSimpleClasses.P05StudentsGettersAndSetters;

import java.util.List;

//created by R.M.
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String city;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCity(String city) {
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

    public static void printStudentsAsPerGivenCityName(List<Student> studentsList, String command) {
        for (Student student : studentsList) {
            if (command.equals(student.getCity())) {
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