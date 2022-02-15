package fund05Lists.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//created by R.M.
public class Fund03HouseParty2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commandsCount = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();
        while (commandsCount > 0) {
            String input = scanner.nextLine();
            String[] data = input.split(" ");
            String name = data[0];
            if (!name.equals("not") && data.length == 3) {
                if (isContain(name, names)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    names.add(name);
                }
            } else if (data[2].equals("not") && data.length == 4) {
                if (isContain(name, names)) {
                    names.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
            commandsCount--;
        }
        printAllPeople(names);
    }

    private static void printAllPeople(List<String> names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    private static boolean isContain(String dataName, List<String> names) {
        for (String currentName : names) {
            if (currentName.equals(dataName)) {
                return true;
            }
        }
        return false;
    }
}
/*
3.	House Party
Write a program that keeps track of the guests that are going to a house party.
On the first input line, you are going to receive how many commands you are going to have.

On the next lines you are going to receive any of the following inputs:
•	"{name} is going!"
•	"{name} is not going!"

If you receive the first type of input,
you have to add the person if he/she is not on the list.
(If he/she is in the list print on the console: "{name} is already in the list!").

If you receive the second type of input,
you have to remove the person if he/she is on the list.
(If not print: "{name} is not in the list!"). At the end print all guests.

 */