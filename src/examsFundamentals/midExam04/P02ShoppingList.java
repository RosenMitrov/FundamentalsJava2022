package examsFundamentals.midExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class P02ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> groceries = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {
            String[] commands = input.split(" ");
            String mainCommand = commands[0];

            switch (mainCommand) {
                case "Urgent":
                    String addItemAtIndexZero = commands[1];
                    if (!groceries.contains(addItemAtIndexZero)) {
                        groceries.add(0, addItemAtIndexZero);
                    }
                    break;
                case "Unnecessary":
                    String unnecessaryItem = commands[1];
                    groceries.remove(unnecessaryItem);
                    break;
                case "Correct":
                    String oldItem = commands[1];
                    String newItem = commands[2];
                    if (groceries.contains(oldItem)) {
                        int indexForCorrect = groceries.indexOf(oldItem);
                        groceries.set(indexForCorrect, newItem);
                    }
                    break;
                case "Rearrange":
                    String itemToRearrange = commands[1];
                    if (groceries.contains(itemToRearrange)) {
                        int indexItemToRearrange = groceries.indexOf(itemToRearrange);
                        String gotItem = groceries.get(indexItemToRearrange);
                        groceries.remove(itemToRearrange);
                        groceries.add(gotItem);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", groceries));
    }
}
/*
It's the end of the week, and it is time for you to go shopping, so you need to create a shopping list first.
Input
You will receive an initial list with groceries separated by an exclamation mark "!".
After that, you will be receiving 4 types of commands until you receive "Go Shopping!".
•	"Urgent {item}" - add the item at the start of the list.  If the item already exists, skip this command.
•	"Unnecessary {item}" - remove the item with the given name, only if it exists in the list. Otherwise, skip this command.
•	"Correct {oldItem} {newItem}" - if the item with the given old name exists, change its name with the new one. Otherwise, skip this command.
•	"Rearrange {item}" - if the grocery exists in the list, remove it from its current position and add it at the end of the list. Otherwise, skip this command.
Constraints
•	There won't be any duplicate items in the initial list
Output
•	Print the list with all the groceries, joined by ", ":
"{firstGrocery}, {secondGrocery}, … {nthGrocery}"

 */