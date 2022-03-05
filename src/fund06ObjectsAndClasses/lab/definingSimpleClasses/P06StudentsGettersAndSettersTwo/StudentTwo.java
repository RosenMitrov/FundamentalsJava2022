package fund06ObjectsAndClasses.lab.definingSimpleClasses.P06StudentsGettersAndSettersTwo;

import java.util.List;

//created by R.M.
public class StudentTwo {
    private String firstName;
    private String lastName;
    private int age;
    String city;

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

    public static void printInfoAsPerGivenCity(List<StudentTwo> studentTwoList, String givenCity) {
        for (StudentTwo st : studentTwoList) {
            if (st.getCity().equals(givenCity)) {
                System.out.printf("%s %s is %d years old%n", st.getFirstName(), st.getLastName(), st.getAge());
            }
        }
    }

    public static StudentTwo getStudent(List<StudentTwo> studentTwoList, String firstName, String lastName) {
        StudentTwo existingStudent = null;
        for (StudentTwo st : studentTwoList) {
            if (st.getFirstName().equals(firstName) && st.getLastName().equals(lastName)) {
                existingStudent = st;
            }
        }
        return existingStudent;
    }

    public static boolean isStudentExisting(List<StudentTwo> studentTwoList, String firstName, String lastName) {
        for (StudentTwo st : studentTwoList) {
            if (st.getFirstName().equals(firstName) && st.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
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
