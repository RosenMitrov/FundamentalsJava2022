package fund08TextProcessing.moreExercises;

import java.util.Scanner;

public class P04MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] codeMorse = scanner.nextLine().split("\\|");
        StringBuilder codeEnglish = new StringBuilder();
        for (String morseWord : codeMorse) {
            String[] morseLetters = morseWord.split(" ");

            for (String letter : morseLetters) {
                char currentLetter = ' ';
                switch (letter) {
                    case ".-":
                        currentLetter = 'A';
                        break;
                    case "-...":
                        currentLetter = 'B';
                        break;
                    case "-.-.":
                        currentLetter = 'C';
                        break;
                    case "-..":
                        currentLetter = 'D';
                        break;
                    case ".":
                        currentLetter = 'E';
                        break;
                    case "..-.":
                        currentLetter = 'F';
                        break;
                    case "--.":
                        currentLetter = 'G';
                        break;
                    case "....":
                        currentLetter = 'H';
                        break;
                    case "..":
                        currentLetter = 'I';
                        break;
                    case ".---":
                        currentLetter = 'J';
                        break;
                    case "-.-":
                        currentLetter = 'K';
                        break;
                    case ".-..":
                        currentLetter = 'L';
                        break;
                    case "--":
                        currentLetter = 'M';
                        break;
                    case "-.":
                        currentLetter = 'N';
                        break;
                    case "---":
                        currentLetter = 'O';
                        break;
                    case ".--.":
                        currentLetter = 'P';
                        break;
                    case "--.-":
                        currentLetter = 'Q';
                        break;
                    case ".-.":
                        currentLetter = 'R';
                        break;
                    case "...":
                        currentLetter = 'S';
                        break;
                    case "-":
                        currentLetter = 'T';
                        break;
                    case "..-":
                        currentLetter = 'U';
                        break;
                    case "...-":
                        currentLetter = 'V';
                        break;
                    case ".--":
                        currentLetter = 'W';
                        break;
                    case "-..-":
                        currentLetter = 'X';
                        break;
                    case "-.--":
                        currentLetter = 'Y';
                        break;
                    case "--..":
                        currentLetter = 'Z';
                        break;
                }
                codeEnglish.append(currentLetter);

            }
        }
        System.out.println(codeEnglish);

    }
}
/*
4.	*Morse Code Translator
Write a program that translates messages from Morse code to English (capital letters).
 Use this page to help you (without the numbers).
 The words will be separated by a space (' '). There will be a "|" character which you should replace with ' ' (space).

 */