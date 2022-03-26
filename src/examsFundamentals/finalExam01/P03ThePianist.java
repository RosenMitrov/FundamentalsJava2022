package examsFundamentals.finalExam01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//created by R.M.
public class P03ThePianist {
    static class Piece {
        private String pieceName;
        private String composer;
        private String key;

        public Piece(String piece, String composer, String key) {
            this.pieceName = piece;
            this.composer = composer;
            this.key = key;
        }

        public String getPieceName() {
            return this.pieceName;
        }

        public void setPieceName(String pieceName) {
            this.pieceName = pieceName;
        }

        public String getComposer() {
            return this.composer;
        }

        public void setComposer(String composer) {
            this.composer = composer;
        }

        public String getKey() {
            return this.key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nPieces = Integer.parseInt(scanner.nextLine());
        Map<String, Piece> pieceMap = new LinkedHashMap<>();
        for (int i = 0; i < nPieces; i++) {
            String[] data = scanner.nextLine().split("\\|");
            String piece = data[0];
            String composer = data[1];
            String key = data[2];
            Piece currentComposer = new Piece(piece, composer, key);
            pieceMap.put(piece, currentComposer);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] data = input.split("\\|");
            String command = data[0];
            String piece = data[1];
            switch (command) {
                case "Add":
                    String composer = data[2];
                    String key = data[3];
                    printTheResultOfAddition(piece, composer, key, pieceMap);
                    break;
                case "Remove":
                    printTheResultOfRemoval(piece, pieceMap);
                    break;
                case "ChangeKey":
                    String newKey = data[2];
                    printTheResultAfterTheChange(piece, newKey, pieceMap);
                    break;
            }
            input = scanner.nextLine();
        }
        pieceMap.forEach((k, v) -> System.out.printf("%s -> Composer: %s, Key: %s%n", k, v.getComposer(), v.getKey()));

    }

    private static void printTheResultAfterTheChange(String piece, String newKey, Map<String, Piece> pieceMap) {
        if (pieceMap.containsKey(piece)) {
            pieceMap.get(piece).setKey(newKey);
            System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
        } else {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
        }
    }


    private static void printTheResultOfRemoval(String piece, Map<String, Piece> pieceMap) {
        if (pieceMap.containsKey(piece)) {
            pieceMap.remove(piece);
            System.out.printf("Successfully removed %s!%n", piece);
        } else {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
        }
    }

    private static void printTheResultOfAddition(String piece, String composer, String key, Map<String, Piece> pieceMap) {
        if (!pieceMap.containsKey(piece)) {
            pieceMap.put(piece, new Piece(piece, composer, key));
            System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
        } else {
            System.out.printf("%s is already in the collection!%n", piece);
        }
    }
}

/*
You are a pianist, and you like to keep a list of your favorite piano pieces.
Create a program to help you organize it and add, change, remove pieces from it!
On the first line of the standard input,
you will receive an integer n – the number of pieces you will initially have.
On the next n lines, the pieces themselves will follow with their composer and key,
separated by "|" in the following format: "{piece}|{composer}|{key}".
Then, you will be receiving different commands, each on a new line, separated by "|", until the "Stop" command is given:
•	"Add|{piece}|{composer}|{key}":
o	You need to add the given piece with the information about it to the other pieces and print:
"{piece} by {composer} in {key} added to the collection!"
o	If the piece is already in the collection, print:
"{piece} is already in the collection!"
•	"Remove|{piece}":
o	If the piece is in the collection, remove it and print:
"Successfully removed {piece}!"
o	Otherwise, print:
"Invalid operation! {piece} does not exist in the collection."
•	"ChangeKey|{piece}|{new key}":
o	If the piece is in the collection, change its key with the given one and print:
"Changed the key of {piece} to {new key}!"
o	Otherwise, print:
"Invalid operation! {piece} does not exist in the collection."
Upon receiving the "Stop" command, you need to print all pieces in your collection in the following format:
"{Piece} -> Composer: {composer}, Key: {key}"
Input/Constraints
•	You will receive a single integer at first – the initial number of pieces in the collection
•	For each piece, you will receive a single line of text with information about it.
•	Then you will receive multiple commands in the way described above until the command "Stop".
Output
•	All the output messages with the appropriate formats are described in the problem description.


 */
