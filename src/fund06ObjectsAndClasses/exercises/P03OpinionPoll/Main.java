package fund06ObjectsAndClasses.exercises.P03OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static fund06ObjectsAndClasses.exercises.P03OpinionPoll.Person.printPeopleGreaterThan30;

//created by R.M.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> peopleList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] personalInformation = scanner.nextLine().split(" ");
            String name = personalInformation[0];
            int age = Integer.parseInt(personalInformation[1]);
            Person currentPerson = new Person(name, age);
            peopleList.add(currentPerson);
        }
        //  peopleList.stream().sorted(Comparator.comparing(Person::getName)).filter(person -> person.getAge() > 30).forEach(p -> System.out.printf("%s - %d%n", p.getName(), p.getAge()));
        peopleList.sort(Comparator.comparing(Person::getName));
        printPeopleGreaterThan30(peopleList);
    }
}
/*
3.	Opinion Poll
Using the Person class,
write a program that reads from the console N lines of personal information
and then prints all people whose age is more than 30 years, sorted in alphabetical order.
Note: you can use stream() to filter people.

 */