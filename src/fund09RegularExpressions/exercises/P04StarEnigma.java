package fund09RegularExpressions.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String regexForDecrypted = "@(?<planet>[A-Za-z]+)[^@\\-!:]*:(?<population>\\d+)[^@\\-!:]*!(?<typeAttack>[AD])![^@\\-!:]*->(?<soldiers>\\d+)";
        Pattern pattern = Pattern.compile(regexForDecrypted);
        List<String> attackedList = new ArrayList<>();
        List<String> destroyedList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String encryptedMessage = scanner.nextLine();
            int countSsTtAaRr = getCountOfTheseLetters(encryptedMessage);
            String decryptedMessage = getDecryptedMessage(encryptedMessage, countSsTtAaRr);
            Matcher matcher = pattern.matcher(decryptedMessage);
            while (matcher.find()) {
                String planet = matcher.group("planet");
                char typeAttack = matcher.group("typeAttack").charAt(0);

                if (typeAttack == 'A') {
                    attackedList.add(planet);
                } else if (typeAttack == 'D') {
                    destroyedList.add(planet);
                }
            }
        }
        Collections.sort(attackedList);
        System.out.printf("Attacked planets: %d%n", attackedList.size());
        attackedList.forEach(p -> System.out.printf("-> %s%n", p));
        Collections.sort(destroyedList);
        System.out.printf("Destroyed planets: %d%n", destroyedList.size());
        destroyedList.forEach(p -> System.out.printf("-> %s%n", p));
    }

    private static String getDecryptedMessage(String encryptedMessage, int countSsTtAaRr) {
        StringBuilder decryptedMessage = new StringBuilder();
        for (char symbol : encryptedMessage.toCharArray()) {
            decryptedMessage.append((char) (symbol - countSsTtAaRr));
        }
        return decryptedMessage.toString();
    }

    private static int getCountOfTheseLetters(String encryptedMessage) {
        String regexLetters = "[SsTtAaRr]";
        Pattern pattern = Pattern.compile(regexLetters);
        Matcher matchLetter = pattern.matcher(encryptedMessage);
        int count = 0;
        while (matchLetter.find()) {
            count++;
        }
        return count;
    }
}
/*
4.	*Star Enigma
The war is at its peak, but you, young Padawan, can turn the tides with your programming skills.
You are tasked to create a program to decrypt the messages of The Order and prevent the death of hundreds of lives.
You will receive several messages, which are encrypted using the legendary star enigma. You should decrypt the messages, following these rules:
To properly decrypt a message, you should count all the letters [s, t, a, r] – case insensitive and remove the count from the current ASCII value of each symbol of the encrypted message.
After decryption:
Each message should have a planet name, population, attack type ('A', as an attack or 'D', as destruction), and soldier count.
The planet name starts after '@' and contains only letters from the Latin alphabet.
The planet population starts after ':' and is an Integer;
The attack type may be "A"(attack) or "D"(destruction) and must be surrounded by "!" (Exclamation mark).
The soldier count starts after "->" and should be an Integer.
The order in the message should be: planet name -> planet population -> attack type -> soldier count. Each part can be separated from the others by any character except: '@', '-', '!', ':' and '>'.

 */