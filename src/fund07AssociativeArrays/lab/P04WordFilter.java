package fund07AssociativeArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

//created by R.M.
public class P04WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        for (String word : words) {
            System.out.println(word);
        }
    }
}
/*
II.	Stream API
4.	Word Filter
Read an array of strings, take only words which length is even. Print each word on a new line.

 */