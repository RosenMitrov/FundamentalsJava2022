package fund07AssociativeArrays.lab;

import java.util.*;

//created by R.M.
public class P02WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> wordsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            if (!wordsMap.containsKey(word)) {
                wordsMap.put(word, new ArrayList<>());
            }
            wordsMap.get(word).add(synonym);
        }
        wordsMap.forEach((k, v) -> System.out.printf("%s - %s%n", k, String.join(", ", v)));
    }
}
/*
2.	Word Synonyms
Write a program that keeps a map with synonyms.
The key of the map will be the word.
The value will be a list of all the synonyms of that word.
You will be given a number n. On the next 2 * n lines you will be given a word and a synonym each on a separate line like this:
•	{word}
•	{synonym}
If you get the same word for the second time, just add the new synonym to the list.
Print the words in the following format:
{word} - {synonym1, synonym2… synonymN}

 */