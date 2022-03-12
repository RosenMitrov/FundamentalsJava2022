package fund08TextProcessing.lab;

import java.util.Scanner;

public class P03SubstringSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToRemove = scanner.nextLine();
        String text = scanner.nextLine();

        int removeIndex = text.indexOf(wordToRemove);
        while (removeIndex != -1) {
            String firstPart = text.substring(0, removeIndex);
            String secondPart = text.substring(removeIndex + wordToRemove.length());
            text = firstPart + secondPart;
            removeIndex = text.indexOf(wordToRemove);
        }

        System.out.println(text);
    }
}
