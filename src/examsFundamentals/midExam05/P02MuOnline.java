package examsFundamentals.midExam05;

import java.util.Scanner;

//created by R.M.
public class P02MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|");

        int health = 100;
        int initialBitcoins = 0;
        int bestRoom = 0;
        boolean isDead = false;

        for (int i = 0; i < rooms.length; i++) {
            bestRoom++;
            String[] tokens = rooms[i].split(" ");
            String command = tokens[0];
            switch (command) {
                case "potion":
                    int givenHealth = Integer.parseInt(tokens[1]);
                    if (health + givenHealth > 100) {
                        givenHealth = 100 - health;
                    }
                    health += givenHealth;
                    System.out.printf("You healed for %d hp.%n", givenHealth);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    int bitcoinsFound = Integer.parseInt(tokens[1]);
                    initialBitcoins += bitcoinsFound;
                    System.out.printf("You found %d bitcoins.%n", bitcoinsFound);
                    break;
                default:
                    //monster
                    int damageFromAttack = Integer.parseInt(tokens[1]);
                    health -= damageFromAttack;
                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", command);
                    } else {
                        System.out.printf("You died! Killed by %s.%n", command);
                        isDead = true;
                    }


                    break;
            }
            if (isDead) {
                break;
            }

        }
        if (isDead) {
            System.out.printf("Best room: %d", bestRoom);
        } else {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", initialBitcoins);
            System.out.printf("Health: %d%n", health);
        }
    }
}
/*
You have initial health 100 and initial bitcoins 0. You will be given a string representing the dungeon's rooms. Each room is separated with '|' (vertical bar): "room1|room2|room3…"
Each room contains a command and a number, separated by space. The command can be:
•	"potion"
o	You are healed with the number in the second part. But your health cannot exceed your initial health (100).
o	First print: "You healed for {amount} hp."
o	After that, print your current health: "Current health: {health} hp."
•	"chest"
o	You've found some bitcoins, the number in the second part.
o	Print: "You found {amount} bitcoins."
•	In any other case, you are facing a monster, which you will fight. The second part of the room contains the attack of the monster. You should remove the monster's attack from your health.
o	If you are not dead (health <= 0), you've slain the monster, and you should print: "You slayed {monster}."
o	If you've died, print "You died! Killed by {monster}." and your quest is over. Print the best room you've manage to reach: "Best room: {room}"
If you managed to go through all the rooms in the dungeon, print on the following three lines:
"You've made it!"
"Bitcoins: {bitcoins}"
"Health: {health}"
Input / Constraints
You receive a string representing the dungeon's rooms, separated with '|' (vertical bar): "room1|room2|room3…".
Output
Print the corresponding messages described above

 */