package examsFundamentals.midExam06;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class P03ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> piratesShipList = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warshipList = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());

        int maxHealthCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        boolean isSunken = false;
        while (!input.equals("Retire")) {
            String[] data = input.split(" ");
            String commandMain = data[0];


            switch (commandMain) {
                case "Fire":
                    int indexWarship = Integer.parseInt(data[1]);
                    int damageToWarship = Integer.parseInt(data[2]);
                    if (isValidWarshipIndex(indexWarship, warshipList)) {
                        warshipList.set(indexWarship, warshipList.get(indexWarship) - damageToWarship);

                        if (warshipList.get(indexWarship) <= 0) {
                            isSunken = true;
                            System.out.println("You won! The enemy ship has sunken.");
                            break;
                        }
                    }
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    int damageToPirates = Integer.parseInt(data[3]);
                    if (isValidPirateIndex(startIndex, endIndex, piratesShipList)) {
                        for (int range = startIndex; range <= endIndex; range++) {
                            piratesShipList.set(range, piratesShipList.get(range) - damageToPirates);
                            if (piratesShipList.get(range) <= 0) {
                                isSunken = true;
                                System.out.println("You lost! The pirate ship has sunken.");
                                break;
                            }
                        }
                    }

                    break;
                case "Repair":
                    int indexForRepair = Integer.parseInt(data[1]);
                    int health = Integer.parseInt(data[2]);
                    if (isValidIndex(indexForRepair, piratesShipList)) {
                        if (piratesShipList.get(indexForRepair) + health > maxHealthCapacity) {
                            piratesShipList.set(indexForRepair, maxHealthCapacity);
                        } else {
                            piratesShipList.set(indexForRepair, piratesShipList.get(indexForRepair) + health);
                        }
                    }
                    break;
                case "Status":
                    double check = maxHealthCapacity * 0.20;
                    int repairCount = 0;
                    for (int i : piratesShipList) {
                        if (i < check) {
                            repairCount++;
                        }
                    }
                    System.out.printf("%d sections need repair.%n", repairCount);
                    break;
            }

            if (isSunken) {
                break;
            }
            input = scanner.nextLine();
        }
        if (!isSunken) {
            int sumPirate = 0;
            int sumWarship = 0;
            for (int i = 0; i < piratesShipList.size(); i++) {
                sumPirate += piratesShipList.get(i);
            }
            for (int i = 0; i < warshipList.size(); i++) {
                sumWarship += warshipList.get(i);
            }

            System.out.printf("Pirate ship status: %d%n", sumPirate);
            System.out.printf("Warship status: %d%n", sumWarship);

        }


    }

    private static boolean isValidIndex(int indexForRepair, List<Integer> piratesShipList) {
        return indexForRepair >= 0 && indexForRepair <= piratesShipList.size() - 1;
    }

    private static boolean isValidPirateIndex(int startIndex, int endIndex, List<Integer> piratesShipList) {
        return (startIndex >= 0 && startIndex <= piratesShipList.size() - 1) && (endIndex >= 0 && endIndex <= piratesShipList.size() - 1) && (startIndex < endIndex);
    }

    private static boolean isValidWarshipIndex(int index, List<Integer> warshipList) {
        return index >= 0 && index <= warshipList.size() - 1;
    }
}
/*
The pirates encounter a huge Man-O-War at sea.
Create a program that tracks the battle and either chooses a winner or prints a stalemate.
On the first line, you will receive the status of the pirate ship,
which is a string representing integer sections separated by ">".
On the second line, you will receive the same type of status, but for the warship:
"{section1}>{section2}>{section3}… {section}"
On the third line, you will receive the maximum health capacity a section of the ship can reach.
The following lines represent commands until "Retire":
•	"Fire {index} {damage}" - the pirate ship attacks the warship with the given damage at that section.
Check if the index is valid and if not, skip the command.
If the section breaks (health <= 0) the warship sinks, print the following and stop the program: "You won! The enemy ship has sunken."
•	"Defend {startIndex} {endIndex} {damage}" - the warship attacks the pirate ship with the given damage at that range (indexes are inclusive).
Check if both indexes are valid and if not, skip the command.
If the section breaks (health <= 0) the pirate ship sinks,
print the following and stop the program:
"You lost! The pirate ship has sunken."
•	"Repair {index} {health}" - the crew repairs a section of the pirate ship with the given health.
Check if the index is valid and if not, skip the command.
The health of the section cannot exceed the maximum health capacity.
•	"Status" - prints the count of all sections of the pirate ship that need repair soon,
which are all sections that are lower than 20% of the maximum health capacity.
Print the following:
"{count} sections need repair."
In the end, if a stalemate occurs, print the status of both ships,
which is the sum of their individual sections, in the following format:
"Pirate ship status: {pirateShipSum}
Warship status: {warshipSum}"
Input
•	On the 1st line, you are going to receive the status of the pirate ship (integers separated by '>')
•	On the 2nd line, you are going to receive the status of the warship
•	On the 3rd line, you will receive the maximum health a section of a ship can reach.
•	On the following lines, until "Retire", you will be receiving commands.
Output
•	Print the output in the format described above.
Constraints
•	The section numbers will be integers in the range [1….1000]
•	The indexes will be integers [-200….200]
•	The damage will be an integer in the range [1….1000]
•	The health will be an integer in the range [1….1000]

 */