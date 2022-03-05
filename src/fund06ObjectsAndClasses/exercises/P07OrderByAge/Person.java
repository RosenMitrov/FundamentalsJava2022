package fund06ObjectsAndClasses.exercises.P07OrderByAge;

//created by R.M.
public class Person {
    private String name;
    private int ID;
    private int age;

    public Person(String name, int ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.ID;
    }

    public int getAge() {
        return this.age;
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