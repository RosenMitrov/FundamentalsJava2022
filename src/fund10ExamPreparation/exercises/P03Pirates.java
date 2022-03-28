package fund10ExamPreparation.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.M.
public class P03Pirates {
    static class Target {
        private String city;
        private int population;
        private int gold;

        public Target(String city, int population, int gold) {
            this.city = city;
            this.population = population;
            this.gold = gold;
        }

        public int getGold() {
            return this.gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
        }

        public int getPopulation() {
            return this.population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Target> targetMap = new LinkedHashMap<>();

        while (!input.equals("Sail")) {
            String[] data = input.split("[|]{2}");
            String city = data[0];
            int population = Integer.parseInt(data[1]);
            int gold = Integer.parseInt(data[2]);
            if (!targetMap.containsKey(city)) {
                targetMap.put(city, new Target(city, population, gold));
            } else {
                Target target = targetMap.get(city);
                target.setGold(target.getGold() + gold);
                target.setPopulation(target.getPopulation() + population);
                targetMap.put(city, target);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] data = input.split("=>");
            String command = data[0];
            String city = data[1];
            switch (command) {
                case "Plunder":
                    int people = Integer.parseInt(data[2]);
                    int gold = Integer.parseInt(data[3]);
                    printResultOfPlundering(targetMap, city, people, gold);
                    break;
                case "Prosper":
                    gold = Integer.parseInt(data[2]);
                    printResultOfProspering(targetMap, city, gold);
                    break;
            }
            input = scanner.nextLine();
        }
        if (!targetMap.isEmpty()) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", targetMap.size());
            targetMap.forEach((key, value) -> System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", key, value.getPopulation(), value.getGold()));
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }

    private static void printResultOfPlundering(Map<String, Target> targetMap, String city, int killedPeople, int stolenGold) {
        Target target = targetMap.get(city);
        if (target.getGold() <= stolenGold || target.getPopulation() <= killedPeople) {
            targetMap.remove(city);
            System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, stolenGold, killedPeople);
            System.out.printf("%s has been wiped off the map!%n", city);
        } else {
            target.setPopulation(target.getPopulation() - killedPeople);
            target.setGold(target.getGold() - stolenGold);
            System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, stolenGold, killedPeople);
        }
    }

    private static void printResultOfProspering(Map<String, Target> targetMap, String city, int gold) {
        Target target = targetMap.get(city);
        if (gold >= 0) {
            target.setGold(target.getGold() + gold);
            System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, city, target.getGold());
        } else {
            System.out.println("Gold added cannot be a negative number!");
        }
    }
}

/*
Anno 1681. The Caribbean. The golden age of piracy. You are a well-known pirate captain by the name of Jack Daniels. Together with your comrades Jim (Beam) and Johnny (Walker), you have been roaming the seas, looking for gold and treasure… and the occasional killing, of course. Go ahead, target some wealthy settlements and show them the pirate's way!
Until the "Sail" command is given, you will be receiving:
•	You and your crew have targeted cities, with their population and gold, separated by "||".
•	If you receive a city that has already been received, you have to increase the population and gold with the given values.
After the "Sail" command, you will start receiving lines of text representing events until the "End" command is given.
Events will be in the following format:
•	"Plunder=>{town}=>{people}=>{gold}"
o	You have successfully attacked and plundered the town, killing the given number of people and stealing the respective amount of gold.
o	For every town you attack print this message: "{town} plundered! {gold} gold stolen, {people} citizens killed."
o	If any of those two values (population or gold) reaches zero, the town is disbanded.
	You need to remove it from your collection of targeted cities and print the following message: "{town} has been wiped off the map!"
o	There will be no case of receiving more people or gold than there is in the city.
•	"Prosper=>{town}=>{gold}"
o	There has been dramatic economic growth in the given city, increasing its treasury by the given amount of gold.
o	The gold amount can be a negative number, so be careful. If a negative amount of gold is given, print: "Gold added cannot be a negative number!" and ignore the command.
o	If the given gold is a valid amount, increase the town's gold reserves by the respective amount and print the following message:
"{gold added} gold added to the city treasury. {town} now has {total gold} gold."
Input
•	On the first lines, until the "Sail" command, you will be receiving strings representing the cities with their gold and population, separated by "||".
•	On the following lines, until the "End" command, you will be receiving strings representing the actions described above, separated by "=>".
Output
•	After receiving the "End" command, if there are any existing settlements on your list of targets, you need to print all of them in the following format:
"Ahoy, Captain! There are {count} wealthy settlements to go to:
{town1} -> Population: {people} citizens, Gold: {gold} kg
{town2} -> Population: {people} citizens, Gold: {gold} kg
   …
{town…n} -> Population: {people} citizens, Gold: {gold} kg"
•	If there are no settlements left to plunder, print:
"Ahoy, Captain! All targets have been plundered and destroyed!"
Constraints
•	The initial population and gold of the settlements will be valid 32-bit integers, never negative, or exceed the respective limits.
•	The town names in the events will always be valid towns that should be on your list.

 */
