package fund02dataTypesAndVariables.MoreExercises;

import java.util.Scanner;

//created by R.M.
public class fund05DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < lines; i++) {
            char letter = scanner.nextLine().charAt(0);
            System.out.printf("%c", letter + key);
        }
    }
}
/*
5. Decrypting Messages
You will receive a key (integer) and n characters afterward.
Add the key to each of the characters and append them to the message.
At the end print the message, which you decrypted.
Input
•	On the first line, you will receive the key
•	On the second line, you will receive n – the number of lines, which will follow
•	On the next n lines – you will receive lower and uppercase characters from the Latin alphabet
Output
Print the decrypted message.

 */