package examsFundamentals.finalExam04;

import java.rmi.MarshalledObject;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.M.
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
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Hero> heroMap = new LinkedHashMap<>();
        int countHeroes = Integer.parseInt(scanner.nextLine());

        for (int count = 0; count < countHeroes; count++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            int hitPoints = Integer.parseInt(data[1]);
            int manaPoints = Integer.parseInt(data[2]);
            heroMap.put(name, new Hero(name, hitPoints, manaPoints));
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
                    if (heroMap.get(heroName).getManaPoints() - neededMP < 0) {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    } else {
                        int oldManaPoints = heroMap.get(heroName).getManaPoints();
                        heroMap.get(heroName).setManaPoints(oldManaPoints - neededMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, heroMap.get(heroName).getManaPoints());
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(data[2]);
                    String attacker = data[3];
                    if (heroMap.get(heroName).getHitPoints() - damage > 0) {
                        int oldHitPoints = heroMap.get(heroName).getHitPoints();
                        heroMap.get(heroName).setHitPoints(oldHitPoints - damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, heroMap.get(heroName).getHitPoints());
                    } else {
                        heroMap.remove(heroName);
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                    }
                    break;
                case "Recharge":
                    int givenMana = Integer.parseInt(data[2]);
                    //-	a hero can have a maximum of 100 HP and 200 MP
                    int oldMana = heroMap.get(heroName).getManaPoints();
                    if (oldMana + givenMana > 200) {
                        heroMap.get(heroName).setManaPoints(200);
                        System.out.printf("%s recharged for %d MP!%n", heroName, 200 - oldMana);
                    } else {
                        heroMap.get(heroName).setManaPoints(oldMana + givenMana);
                        int newMana = heroMap.get(heroName).getManaPoints();
                        System.out.printf("%s recharged for %d MP!%n", heroName, newMana - oldMana);
                    }
                    break;
                case "Heal":
                    int givenHitPoints = Integer.parseInt(data[2]);
                    int oldHitPoints = heroMap.get(heroName).getHitPoints();
                    if (oldHitPoints + givenHitPoints > 100) {
                        heroMap.get(heroName).setHitPoints(100);
                        System.out.printf("%s healed for %d HP!%n", heroName, 100 - oldHitPoints);
                    } else {
                        heroMap.get(heroName).setHitPoints(oldHitPoints + givenHitPoints);
                        int newHitPoints = heroMap.get(heroName).getHitPoints();
                        System.out.printf("%s healed for %d HP!%n", heroName, newHitPoints - oldHitPoints);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Hero> entry : heroMap.entrySet()) {
            System.out.printf("%s%n  HP: %d%n  MP: %d%n", entry.getValue().getName(), entry.getValue().getHitPoints(), entry.getValue().getManaPoints());
        }
    }
}
