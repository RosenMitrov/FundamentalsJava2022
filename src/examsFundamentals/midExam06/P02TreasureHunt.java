package examsFundamentals.midExam06;

import java.util.*;
import java.util.stream.Collectors;

//created by R.M.
public class P02TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lootList = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Yohoho!")) {
            String[] someInfo = input.split(" ");
            String command = someInfo[0];
            switch (command) {
                case "Loot":
                    for (int i = 1; i < someInfo.length; i++) {
                        String currentGood = someInfo[i];
                        if (!lootList.contains(currentGood)) {
                            lootList.add(0, currentGood);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(someInfo[1]);
                    if (isValidIndex(index, lootList)) {
                        String element = lootList.get(index);
                        lootList.remove(index);
                        lootList.add(element);
                    }
                    break;
                case "Steal":
                    int countStolenEl = Integer.parseInt(someInfo[1]);
                    List<String> stolenItems = new ArrayList<>();
                    if (!isGreater(countStolenEl, lootList)) {
                        for (int i = 0; i < countStolenEl; i++) {
                            String stolenItem = lootList.get(lootList.size() - 1);
                            stolenItems.add(stolenItem);
                            lootList.remove(lootList.size() - 1);
                        }
                    } else {
                        for (int i = 0; i < lootList.size(); i++) {
                            String stolenItem = lootList.get(lootList.size() - 1 - i);
                            stolenItems.add(stolenItem);
                        }

                        while (lootList.size() > 0) {
                            lootList.remove(0);
                        }
                    }
                    Collections.reverse(stolenItems);
                    System.out.println(String.join(", ", stolenItems));
                    while (stolenItems.size() > 0) {
                        stolenItems.remove(0);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        StringBuilder allElements = new StringBuilder();
        for (String el : lootList) {
            allElements.append(el);
        }
        String[] countLetters = allElements.toString().split("");
        if (lootList.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            double averageTreasureGain = countLetters.length * 1.0 / lootList.size();
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
        }
    }

    private static boolean isGreater(int countStolenEl, List<String> lootList) {
        return countStolenEl > lootList.size();
    }

    private static boolean isValidIndex(int index, List<String> lootList) {
        return index >= 0 && index <= lootList.size() - 1;
    }
}
/*
The pirates need to carry a treasure chest safely back to the ship, looting along the way.
Create a program that manages the state of the treasure chest along the way.
On the first line, you will receive the initial loot of the treasure chest, which is a string of items separated by a "|".
"{loot1}|{loot2}|{loot3} … {lootn}"
The following lines represent commands until "Yohoho!" which ends the treasure hunt:
•	"Loot {item1} {item2}…{itemn}":
o	Pick up treasure loot along the way. Insert the items at the beginning of the chest.
o	If an item is already contained, don't insert it.
•	"Drop {index}":
o	Remove the loot at the given position and add it at the end of the treasure chest.
o	If the index is invalid, skip the command.
•	"Steal {count}":
o	Someone steals the last count loot items. If there are fewer items than the given count, remove as much as there are.
o	Print the stolen items separated by ", ":
"{item1}, {item2}, {item3} … {itemn}"
In the end, output the average treasure gain,
which is the sum of all treasure items length divided by the count of all items inside the chest formatted to the second decimal point:
"Average treasure gain: {averageGain} pirate credits."
If the chest is empty, print the following message:
"Failed treasure hunt."
Input
•	On the 1st line, you are going to receive the initial treasure chest (loot separated by "|")
•	On the following lines, until "Yohoho!", you will be receiving commands.
Output
•	Print the output in the format described above.
Constraints
•	The loot items will be strings containing any ASCII code.
•	The indexes will be integers in the range [-200…200]
•	The count will be an integer in the range [1….100]

 */