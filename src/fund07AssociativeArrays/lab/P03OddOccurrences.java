package fund07AssociativeArrays.lab;

import java.util.*;

//created by R.M.
public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringsArr = scanner.nextLine().split(" ");

        Map<String, Integer> counts = new LinkedHashMap<>();

        for (String string : stringsArr) {
            String lowerCaseStr = string.toLowerCase();
            counts.putIfAbsent(lowerCaseStr, 0);
            counts.put(lowerCaseStr, counts.get(lowerCaseStr) + 1);
        }
        List<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            System.out.printf("%s", odds.get(i));
            if (i < odds.size() - 1) {
                System.out.print(", ");
            }
        }

    }
}
/*
3.	Odd Occurrences
Write a program that extracts from a given sequence of words all elements
that are present in it an odd number of times (case-insensitive).
•	Words are given in a single line, space-separated.
•	Print the result elements in lowercase in their order of appearance.

 */