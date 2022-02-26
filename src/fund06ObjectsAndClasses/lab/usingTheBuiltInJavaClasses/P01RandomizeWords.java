package fund06ObjectsAndClasses.lab.usingTheBuiltInJavaClasses;

import java.util.Random;
import java.util.Scanner;

//created by R.M.
public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        Random random = new Random();

        for (int i = 0; i < words.length; i++) {
            int first = random.nextInt(words.length);
            int second = random.nextInt(words.length);
            String oldFirst = words[first];
            words[first] = words[second];
            words[second] = oldFirst;
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
/*
1.	Randomize Words
You are given a list of words in one line. Randomize their order and print each word on a separate line.

 */