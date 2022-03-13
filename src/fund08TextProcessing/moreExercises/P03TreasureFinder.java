package fund08TextProcessing.moreExercises;

import java.util.Scanner;

//created by R.M.
public class P03TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] key = scanner.nextLine().split(" ");

        String input = scanner.nextLine();

        while (!input.equals("find")) {
            StringBuilder encrypted = new StringBuilder(input);
            StringBuilder decrypted = new StringBuilder();
            for (int index = 0; index < encrypted.length(); index++) {
                char symbol = encrypted.charAt(index);
                int value = Integer.parseInt(key[index % key.length]);
                char symbolToAdd = (char) (symbol - value);
                decrypted.append(symbolToAdd);
            }
            int typeFirst = decrypted.toString().indexOf("&");
            int typeLast = decrypted.toString().lastIndexOf("&");
            String type = decrypted.substring(typeFirst + 1, typeLast);

            int coordinatesFirst = decrypted.toString().indexOf("<");
            int coordinatesLast = decrypted.toString().indexOf(">");
            String coordinates = decrypted.substring(coordinatesFirst + 1, coordinatesLast);

            System.out.printf("Found %s at %s%n", type, coordinates);
            input = scanner.nextLine();
        }
    }
}
/*
3.	**Treasure Finder
Write a program that decrypts a message by a given key and gathers information about hidden treasure type and its coordinates.
On the first line, you will receive a key (sequence of numbers).
On the next few lines until you receive "find" you will get lines of strings.
You have to loop through every string and decrease the ASCII code of each character with a corresponding number of the key sequence.
The way you choose a key number from the sequence is by just looping through it.
If the length of the key sequence is less than the string sequence, you start looping from the beginning of the key.
For more clarification see the example below. After decrypting the message you will get a type of treasure and its coordinates.
The type will be between the symbol "&" and the coordinates will be between the symbols "<" and ">".
For each line print the type and the coordinates in format "Found {type} at {coordinates}".

 */