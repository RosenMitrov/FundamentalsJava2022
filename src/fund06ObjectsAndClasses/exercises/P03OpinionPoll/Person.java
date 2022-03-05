package fund06ObjectsAndClasses.exercises.P03OpinionPoll;

import java.util.List;

//created by R.M.
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void printPeopleGreaterThan30(List<Person> peopleList) {
        for (Person person : peopleList) {
            if (person.getAge() > 30) {
                System.out.printf("%s - %d%n", person.getName(), person.getAge());
            }
        }
    }
}
/*
3.	Opinion Poll
Using the Person class,
write a program that reads from the console N lines of personal information
and then prints all people whose age is more than 30 years, sorted in alphabetical order.
Note: you can use stream() to filter people.

 */