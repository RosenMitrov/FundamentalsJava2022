package fund06ObjectsAndClasses.exercises.P07OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//created by R.M.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> listOfPeople = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] personalInformation = input.split(" ");
            String name = personalInformation[0];
            int ID = Integer.parseInt(personalInformation[1]);
            int age = Integer.parseInt(personalInformation[2]);

            Person currentPerson = new Person(name, ID, age);
            listOfPeople.add(currentPerson);
            input = scanner.nextLine();
        }
        listOfPeople.sort(Comparator.comparing(Person::getAge));
        for (Person person : listOfPeople) {
            System.out.printf("%s with ID: %d is %d years old.%n", person.getName(), person.getID(), person.getAge());
        }
    }
}
/*
7.	Order by Age
You will receive an unknown number of lines.
On each line, you will receive an array with 3 elements.
The first element will be string and represents the name of the person.
The second element will be a string and will represent the ID of the person.
The last element will be an integer which represents the age of the person.
When you receive the command "End", stop taking input and print all the people, ordered by age.

 */