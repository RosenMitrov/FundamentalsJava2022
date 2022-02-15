package fund05Lists.exercises;

import java.util.*;
import java.util.stream.Collectors;

//created by R.M.
public class Fund08AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> virusList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> mergedList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("3:1")) {
            String[] data = input.split(" ");
            String commandMain = data[0];
            switch (commandMain) {
                case "merge":
                    //Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
                    int startIndex = Integer.parseInt(data[1]);
                    int endIndex = Integer.parseInt(data[2]);
                    if (startIndex < 0) {
                        startIndex = 0;
                    }
                    if (endIndex > virusList.size() - 1) {
                        endIndex = virusList.size() - 1;
                    }
                    if (isValid(startIndex, endIndex, virusList)) {
                        StringBuilder tempMerge = new StringBuilder();

                        for (int i = startIndex; i <= endIndex; i++) {
                            tempMerge.append(virusList.get(i));
                        }

                        for (int i = startIndex; i <= endIndex; i++) {
                            virusList.remove(startIndex);
                        }
                        virusList.add(startIndex, tempMerge.toString());

                    }
                    break;
                case "divide":
                    int index = Integer.parseInt(data[1]);
                    int partitions = Integer.parseInt(data[2]);

                    String allPartsAsString = virusList.get(index);
                    virusList.remove(index);

                    int length = allPartsAsString.length();
                    int parts = length / partitions;
                    int begin = 0;
                    for (int i = 1; i < partitions; i++) {
                        virusList.add(index,allPartsAsString.substring(begin, begin + parts));
                        index++;
                        begin += parts;
                    }
                    virusList.add(index, allPartsAsString.substring(begin));
                    break;
            }
            input = scanner.nextLine();
        }
        for (String s : virusList) {
            System.out.printf("%s ", s);
        }


    }

    private static boolean isValid(int startIndex, int endIndex, List<String> virusList) {
       // return startIndex >= 0 && endIndex <= virusList.size() - 1 && startIndex <= virusList.size();
        return (startIndex >= 0 && startIndex <= virusList.size() - 1) && (endIndex >= 0 && endIndex <= virusList.size() - 1);
    }
}
/*
8.	*Anonymous Threat
Anonymous has created a cyber-hyper virus that steals data from the CIA.
You, as the lead security developer in the CIA, have been tasked to analyze the software of the virus
and observe its actions on the data.
The virus is known for its innovative and unbelievably clever technique of merging and dividing data into partitions.
You will receive a single input line containing STRINGS separated by spaces.
The strings may contain any ASCII character except whitespace.
You will then begin receiving commands in one of the following formats:
•	merge {startIndex} {endIndex}
•	divide {index} {partitions}
Every time you receive the merge command, you must merge all elements from the startIndex till the endIndex. In other words, you should concatenate them.
Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
If any of the given indexes is out of the array, you must take ONLY the range that is INSIDE the array and merge it.
Every time you receive the divide command, you must DIVIDE the element at the given index into several small substrings with equal length. The count of the substrings should be equal to the given partitions.
Example: {abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl}
If the string CANNOT be exactly divided into the given partitions, make all partitions except the LAST with EQUAL LENGTHS, and make the LAST one – the LONGEST.
Example: {abcd, efgh, ijkl} -> divide 0 3 -> {a, b, cd, efgh, ijkl}
The input ends when you receive the command "3:1". At that point you must print the resulting elements, joined by a space.
Input
•	The first input line will contain the array of data.
•	On the next several input lines you will receive commands in the format specified above.
•	The input ends when you receive the command "3:1".
Output
•	As output, you must print a single line containing the elements of the array, joined by a space.

 */