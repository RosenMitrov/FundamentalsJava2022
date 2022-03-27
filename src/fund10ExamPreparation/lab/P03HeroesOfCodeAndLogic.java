package fund10ExamPreparation.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.M.
public class P03HeroesOfCodeAndLogic {
    static class Hero {
        private String heroName;
        private int hitPoints;
        private int manaPoints;

        public Hero(String heroName, int hitPoints, int manaPoints) {
            this.heroName = heroName;
            this.hitPoints = hitPoints;
            this.manaPoints = manaPoints;
        }

        public String getHeroName() {
            return this.heroName;
        }

        public void setHeroName(String heroName) {
            this.heroName = heroName;
        }

        public int getHitPoints() {
            return this.hitPoints;
        }

        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
        }

        public int getManaPoints() {
            return this.manaPoints;
        }

        public void setManaPoints(int manaPoints) {
            this.manaPoints = manaPoints;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countHeroes = Integer.parseInt(scanner.nextLine());
        Map<String, Hero> heroMap = new LinkedHashMap<>();

        for (int i = 0; i < countHeroes; i++) {
            String[] data = scanner.nextLine().split(" ");
            String heroName = data[0];
            int hitPoints = Integer.parseInt(data[1]);
            int manaPoints = Integer.parseInt(data[2]);
            if (!heroMap.containsKey(heroName)) {
                Hero hero = new Hero(heroName, hitPoints, manaPoints);
                heroMap.put(heroName, hero);
            }
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
                    castSpell(heroMap, heroName, neededMP, spellName);
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(data[2]);
                    String attacker = data[3];
                    takeDamage(heroMap, heroName, damage, attacker);
                    break;
                case "Recharge":
                    int rechargingAmount = Integer.parseInt(data[2]);
                    rechargeMp(heroMap, heroName, rechargingAmount);
                    break;
                case "Heal":
                    int healingAmount = Integer.parseInt(data[2]);
                    healingHp(heroMap, heroName, healingAmount);
                    break;
            }
            input = scanner.nextLine();
        }

        heroMap.forEach((key, value) -> System.out.printf("%s%n" +
                "  HP: %d%n" +
                "  MP: %d%n", key, value.getHitPoints(), value.getManaPoints()));

    }

    private static void castSpell(Map<String, Hero> heroMap, String heroName, int neededMP, String spellName) {
        Hero hero = heroMap.get(heroName);
        int currentMP = hero.getManaPoints();
        if (neededMP <= currentMP) {
            hero.setManaPoints(currentMP - neededMP);
            currentMP = hero.getManaPoints();
            System.out.printf("%s has successfully cast %s and now has %s MP!%n", heroName, spellName, currentMP);
        } else {
            System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
        }
    }

    private static void takeDamage(Map<String, Hero> heroMap, String heroName, int damage, String attacker) {
        Hero hero = heroMap.get(heroName);
        int currentMP = hero.getHitPoints();
        if (currentMP > damage) {
            hero.setHitPoints(currentMP - damage);
            currentMP = hero.getHitPoints();
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, currentMP);
        } else {
            heroMap.remove(heroName);
            System.out.printf("%s has been killed by %s!%n", heroName, attacker);
        }
    }

    private static void rechargeMp(Map<String, Hero> heroMap, String heroName, int rechargingAmount) {
        Hero hero = heroMap.get(heroName);
        int oldMP = hero.getManaPoints();
        int newMP = Math.min(hero.getManaPoints() + rechargingAmount, 200);
        hero.setManaPoints(newMP);
        System.out.printf("%s recharged for %d MP!%n", heroName, newMP - oldMP);
    }

    private static void healingHp(Map<String, Hero> heroMap, String heroName, int healingAmount) {
        Hero hero = heroMap.get(heroName);
        int oldHP = hero.getHitPoints();
        int newHP = Math.min(hero.getHitPoints() + healingAmount, 100);
        hero.setHitPoints(newHP);
        int recoveredAmount = newHP - oldHP;
        System.out.printf("%s healed for %d HP!%n", heroName, recoveredAmount);
    }
}
/*
You got your hands on the most recent update on the best MMORPG of all time – Heroes of Code and Logic. You want to play it all day long! So cancel all other arrangements and create your party!
On the first line of the standard input, you will receive an integer n – the number of heroes that you can choose for your party. On the next n lines, the heroes themselves will follow with their hit points and mana points separated by a single space in the following format:
"{hero name} {HP} {MP}"
•	HP stands for hit points and MP for mana points
•	a hero can have a maximum of 100 HP and 200 MP
After you have successfully picked your heroes, you can start playing the game. You will be receiving different commands, each on a new line, separated by " – ", until the "End" command is given.
There are several actions that the heroes can perform:
"CastSpell – {hero name} – {MP needed} – {spell name}"
•	If the hero has the required MP, he casts the spell, thus reducing his MP. Print this message:
o	"{hero name} has successfully cast {spell name} and now has {mana points left} MP!"
•	If the hero is unable to cast the spell print:
o	"{hero name} does not have enough MP to cast {spell name}!"
"TakeDamage – {hero name} – {damage} – {attacker}"
•	Reduce the hero HP by the given damage amount. If the hero is still alive (his HP is greater than 0) print:
o	"{hero name} was hit for {damage} HP by {attacker} and now has {current HP} HP left!"
•	If the hero has died, remove him from your party and print:
o	"{hero name} has been killed by {attacker}!"
"Recharge – {hero name} – {amount}"
•	The hero increases his MP. If it brings the MP of the hero above the maximum value (200), MP is increased to 200. (the MP can't go over the maximum value).
•	 Print the following message:
o	"{hero name} recharged for {amount recovered} MP!"
"Heal – {hero name} – {amount}"
•	The hero increases his HP. If a command is given that would bring the HP of the hero above the maximum value (100), HP is increased to 100 (the HP can't go over the maximum value).
•	 Print the following message:
o	"{hero name} healed for {amount recovered} HP!"
Input
•	On the first line of the standard input, you will receive an integer n
•	On the following n lines, the heroes themselves will follow with their hit points and mana points separated by a space in the following format
•	You will be receiving different commands, each on a new line, separated by " – ", until the "End" command is given
Output
•	Print all members of your party who are still alive in the following format (their HP/MP need to be indented 2 spaces):
"{hero name}
  HP: {current HP}
  MP: {current MP}"
Constraints
•	The starting HP/MP of the heroes will be valid, 32-bit integers will never be negative or exceed the respective limits.
•	The HP/MP amounts in the commands will never be negative.
•	The hero names in the commands will always be valid members of your party. No need to check that explicitly.

 */