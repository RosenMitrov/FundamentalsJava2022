package examsFundamentals.finalExam02;

import java.util.Scanner;

//created by R.M.
public class P01WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] data = input.split(":");
            String command = data[0];

            switch (command) {
                case "Add Stop":
                    int stopIndex = Integer.parseInt(data[1]);
                    String stringForAdd = data[2];
                    stops.insert(stopIndex, stringForAdd);
                    System.out.println(stops);
                    break;
                case "Remove Stop":
                    int startIndexForRemove = Integer.parseInt(data[1]);
                    int endIndexForRemove = Integer.parseInt(data[2]);

                    if (isValidIndex(startIndexForRemove, endIndexForRemove, stops)) {
                        stops.delete(startIndexForRemove, endIndexForRemove + 1);
                    }
                    System.out.println(stops);

                    break;
                case "Switch":
                    String oldString = data[1];
                    String newString = data[2];
                    stops = new StringBuilder(stops.toString().replace(oldString, newString));
                    System.out.println(stops);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }

    private static boolean isValidIndex(int startIndexForRemove, int endIndexForRemove, StringBuilder stops) {
        if (startIndexForRemove > endIndexForRemove) {
            int oldStart = startIndexForRemove;
            startIndexForRemove = endIndexForRemove;
            endIndexForRemove = oldStart;
        }
        return startIndexForRemove >= 0 && startIndexForRemove < stops.length() && endIndexForRemove < stops.length();


    }
}
/*
You are a world traveler, and your next goal is to make a world tour.
To do that, you have to plan out everything first. To start with, you would like to plan out all of your stops where you will have a break.
On the first line, you will be given a string containing all of your stops.
Until you receive the command "Travel", you will be given some commands to manipulate that initial string. The commands can be:
•	"Add Stop:{index}:{string}":
o	Insert the given string at that index only if the index is valid
•	"Remove Stop:{start_index}:{end_index}":
o	Remove the elements of the string from the starting index to the end index (inclusive) if both indices are valid
•	"Switch:{old_string}:{new_string}":
o	If the old string is in the initial string, replace it with the new one (all occurrences)
Note: After each command, print the current state of the string
After the "Travel" command, print the following: "Ready for world tour! Planned stops: {string}"
Input / Constraints
•	JavaScript: you will receive a list of strings
•	An index is valid if it is between the first and the last element index (inclusive) in the sequence.
Output
•	Print the proper output messages in the proper cases as described in the problem description

 */