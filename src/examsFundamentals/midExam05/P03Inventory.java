package examsFundamentals.midExam05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class P03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> itemsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Craft!")) {
            String[] data = input.split(" - ");
            String command = data[0];
            switch (command) {
                case "Collect":
                    String itemToCollect = data[1];
                    if (!itemsList.contains(itemToCollect)) {
                        itemsList.add(itemToCollect);
                    }
                    break;
                case "Drop":
                    String itemToRemove = data[1];
                    itemsList.remove(itemToRemove);
                    break;
                case "Combine Items":
                    String[] oldAndNeItems = data[1].split(":");
                    String oldItem = oldAndNeItems[0];
                    String newItem = oldAndNeItems[1];
                    if (itemsList.contains(oldItem)) {
                        int getIndexOfOldItem = itemsList.indexOf(oldItem);
                        itemsList.add(getIndexOfOldItem + 1, newItem);
                    }
                    break;
                case "Renew":
                    String itemToMove = data[1];
                    if (itemsList.contains(itemToMove)) {
                        itemsList.remove(itemToMove);
                        itemsList.add(itemToMove);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(String.join(", ", itemsList));
    }
}
/*
As a young traveler, you gather items and craft new items.
Input / Constraints
You will receive a journal with some collecting items, separated with a comma and a space (", ").
After that, until receiving "Craft!" you will be receiving different commands split by " - ":

•	"Collect - {item}" - you should add the given item to your inventory. If the item already exists, you should skip this line.
•	"Drop - {item}" - you should remove the item from your inventory if it exists.
•	"Combine Items - {old_item}:{new_item}" - you should check if the old item exists. If so, add the new item after the old one. Otherwise, ignore the command.
•	"Renew – {item}" – if the given item exists, you should change its position and put it last in your inventory.
Output
After receiving "Craft!" print the items in your inventory, separated by ", ".

 */