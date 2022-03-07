package fund07AssociativeArrays.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.m.
public class P03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> mainMaterialsMap = new LinkedHashMap<>();
        Map<String, Integer> junkMap = new LinkedHashMap<>();
        mainMaterialsMap.put("shards", 0);
        mainMaterialsMap.put("fragments", 0);
        mainMaterialsMap.put("motes", 0);
        boolean isWin = false;
        while (!isWin) {
            String[] data = scanner.nextLine().split(" ");
            String obtained = "";
            for (int index = 0; index < data.length - 1; index += 2) {
                int quantity = Integer.parseInt(data[index]);
                String material = data[index + 1].toLowerCase();
                switch (material) {
                    case "shards":
                    case "fragments":
                    case "motes":
                        mainMaterialsMap.put(material, mainMaterialsMap.get(material) + quantity);
                        if (mainMaterialsMap.get(material) >= 250) {
                            mainMaterialsMap.put(material, mainMaterialsMap.get(material) - 250);
                            isWin = true;
                            obtained = material;
                            break;
                        }
                        break;
                    default:
                        junkMap.putIfAbsent(material, 0);
                        junkMap.put(material, junkMap.get(material) + quantity);
                        break;
                }
                if (isWin) {
                    break;
                }
            }
            if (isWin) {
                switch (obtained) {
                    case "shards":
                        System.out.println("Shadowmourne obtained!");
                        break;
                    case "fragments":
                        System.out.println("Valanyr obtained!");
                        break;
                    case "motes":
                        System.out.println("Dragonwrath obtained!");
                        break;
                }
            }
        }

        for (Map.Entry<String, Integer> entry : mainMaterialsMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : junkMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }


    }
}
/*
3.	Legendary Farming
You are playing a game, and your goal is to win a legendary item - any legendary item will be good enough.
However, it's a tedious process, and it requires quite a bit of farming.

The possible items are:
•	"Shadowmourne" - requires 250 Shards
•	"Valanyr" - requires 250 Fragments
•	"Dragonwrath" - requires 250 Motes
"Shards", "Fragments", and "Motes" are the key materials 	(case-insensitive), and everything else is junk.
You will be given lines of input in the format:
"{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"

Keep track of the key materials - the first one that reaches 250, wins the race.
At that point, you have to print that the corresponding legendary item is obtained.

In the end, print the remaining shards, fragments, motes in the format:
"shards: {numberOfShards}
fragments: {numberOfFragments}
motes: {numberOfMotes}"

Finally, print the collected junk items in the order of appearance.
Input
•	Each line comes in the following format: "{quantity1} {material1} {quantity2} {material2} … {quantityN} {materialN}"
Output
•	On the first line, print the obtained item in the format: "{Legendary item} obtained!" .
•	On the next three lines, print the remaining key materials.
•	On the several final lines, print the junk items.
•	All materials should be printed in the format: "{material}: {quantity}".
•	The output should be lowercase, except for the first letter of the legendary.

 */