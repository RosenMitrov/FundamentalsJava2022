package fund07AssociativeArrays.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.M.
public class P01CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> countCharsMap = new LinkedHashMap<>();

        for (int index = 0; index < input.length(); index++) {
            char symbol = input.charAt(index);
            if (symbol != ' ') {
                if (!countCharsMap.containsKey(symbol)) {
                    countCharsMap.put(symbol, 0);
                }
                countCharsMap.put(symbol, countCharsMap.get(symbol) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : countCharsMap.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
/*
1.	Count Chars in a String
Write a program, which counts all characters in a string except space (' ').
Print all occurrences in the following format:
{char} -> {occurrences}

 */