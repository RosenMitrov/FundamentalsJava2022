package fund08TextProcessing.exercises;

import java.util.Scanner;

//created by R.M.
public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decryptedText = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < decryptedText.length(); i++) {
            char symbol = (char) (decryptedText.charAt(i) + 3);
            encryptedText.append(symbol);
        }
        System.out.println(encryptedText);
    }
}
/*
4.	Caesar Cipher
Write a program that returns an encrypted version of the same text.
Encrypt the text by shifting each character with three positions forward.
For example, A would be replaced by D, B would become E, and so on. Print the encrypted text.

 */