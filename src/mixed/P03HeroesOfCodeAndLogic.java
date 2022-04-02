package mixed;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03HeroesOfCodeAndLogic {
    static class Hero {
        private String name;
        private int hitPoints;
        private int manaPoints;

        public Hero(String name, int hitPoints, int manaPoints) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.manaPoints = manaPoints;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHitPoints() {
            return hitPoints;
        }

        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
        }

        public int getManaPoints() {
            return manaPoints;
        }

        public void setManaPoints(int manaPoints) {
            this.manaPoints = manaPoints;
        }

        @Override
        public String toString() {
            return String
                    .format("%s%n" +
                            "  HP: %d%n" +
                            "  MP: %d", this.name, this.hitPoints, this.manaPoints);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Hero> heroMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String heroName = data[0];
            int hitPoints = Integer.parseInt(data[1]);
            int manaPoints = Integer.parseInt(data[2]);
            Hero currentHero = new Hero(heroName, hitPoints, manaPoints);
            heroMap.put(heroName, currentHero);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" - ");
            String command = data[0];
            String heroName = data[1];

            switch (command) {
                case "CastSpell":
                    int neededMP = Integer.parseInt(data[2]);
                    String spellName = data[3];
                    printResultOfCastSpell(heroMap, heroName, neededMP, spellName);
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(data[2]);
                    String attacker = data[3];
                    printResultOfDamage(heroMap, heroName, damage, attacker);
                    break;
                case "Recharge":
                    int rechargingAmount = Integer.parseInt(data[2]);
                    printResultOfRecharging(heroMap, heroName, rechargingAmount);
                    break;
                case "Heal":
                    int healingAmount = Integer.parseInt(data[2]);
                    printResultOfHealing(heroMap, heroName, healingAmount);
                    break;
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Hero> hero : heroMap.entrySet()) {
            System.out.println(hero.getValue());
        }
    }

    private static void printResultOfCastSpell(Map<String, Hero> heroMap, String heroName, int neededMP, String spellName) {
        Hero hero = heroMap.get(heroName);
        int currentMP = hero.getManaPoints();
        if (currentMP >= neededMP) {
            hero.setManaPoints(currentMP - neededMP);
            currentMP = hero.getManaPoints();
            System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, currentMP);
        } else {
            System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
        }
    }

    private static void printResultOfDamage(Map<String, Hero> heroMap, String heroName, int damage, String attacker) {
        Hero hero = heroMap.get(heroName);
        int currentHP = hero.getHitPoints();
        if (currentHP > damage) {
            hero.setHitPoints(currentHP - damage);
            currentHP = hero.getHitPoints();
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentHP);
        } else {
            heroMap.remove(heroName);
            System.out.printf("%s has been killed by %s!%n", heroName, attacker);
        }
    }

    private static void printResultOfRecharging(Map<String, Hero> heroMap, String heroName, int rechargingAmount) {
        Hero hero = heroMap.get(heroName);
        int oldMP = hero.getManaPoints();
        int newMP = Math.min(oldMP + rechargingAmount, 200);
        hero.setManaPoints(newMP);
        System.out.printf("%s recharged for %d MP!%n", heroName, newMP - oldMP);
    }

    private static void printResultOfHealing(Map<String, Hero> heroMap, String heroName, int healingAmount) {
        Hero hero = heroMap.get(heroName);
        int oldHP = hero.getHitPoints();
        int newHP = Math.min(oldHP + healingAmount, 100);
        hero.setHitPoints(newHP);
        System.out.printf("%s healed for %d HP!%n", heroName, newHP - oldHP);
    }
}
