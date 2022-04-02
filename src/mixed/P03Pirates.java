package mixed;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

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

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public int getGold() {
            return gold;
        }

        public void setGold(int gold) {
            this.gold = gold;
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
            if (targetMap.containsKey(city)) {
                Target currentTarget = targetMap.get(city);
                currentTarget.setPopulation(currentTarget.getPopulation() + population);
                currentTarget.setGold(currentTarget.getGold() + gold);
            } else {
                targetMap.put(city, new Target(city, population, gold));
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] events = input.split("=>");
            String command = events[0];
            switch (command) {
                case "Plunder":
                    String city = events[1];
                    int people = Integer.parseInt(events[2]);
                    int gold = Integer.parseInt(events[3]);
                    printResultAfterPlundering(targetMap, city, people, gold);
                    break;
                case "Prosper":
                    city = events[1];
                    gold = Integer.parseInt(events[2]);
                    printResultAfterProspering(targetMap, city, gold);
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

    private static void printResultAfterPlundering(Map<String, Target> targetMap, String city, int people, int gold) {
        Target target = targetMap.get(city);
        int oldPopulation = target.getPopulation();
        target.setPopulation(oldPopulation - people);
        int oldGold = target.getGold();
        target.setGold(oldGold - gold);
        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", city, gold, people);
        if (target.getGold() == 0 || target.getPopulation() == 0) {
            targetMap.remove(city);
            System.out.printf("%s has been wiped off the map!%n", city);
        }
    }

    private static void printResultAfterProspering(Map<String, Target> targetMap, String city, int gold) {
        Target target = targetMap.get(city);
        if (gold < 0) {
            System.out.println("Gold added cannot be a negative number!");
        } else {
            int oldGold = target.getGold();
            target.setGold(oldGold + gold);
            int newGold = target.getGold();
            System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", gold, city, newGold);
        }
    }
}
