package examsFundamentals.MidExam01;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementsList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        int moves = 0;

        while (!input.equals("end")) {
            moves++;
            int[] data = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
            int indexOne = data[0];
            int indexTwo = data[1];

            if (indexOne == indexTwo || !isValidIndex(indexOne, indexTwo, elementsList)) {
                String movesFormat = String.format("-%da", moves);
                elementsList.add(elementsList.size() / 2, movesFormat);
                elementsList.add((elementsList.size() / 2) + 1, movesFormat);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                String elementOne = elementsList.get(indexOne);
                String elementTwo = elementsList.get(indexTwo);
                if (elementOne.equals(elementTwo)) {
                    if (indexOne > indexTwo) {
                        elementsList.remove(indexOne);
                        elementsList.remove(indexTwo);
                    } else {
                        elementsList.remove(indexTwo);
                        elementsList.remove(indexOne);
                    }

                    System.out.printf("Congrats! You have found matching elements - %s!%n", elementOne);
                    if (elementsList.isEmpty()) {
                        System.out.printf("You have won in %d turns!", moves);
                        break;
                    }
                } else {
                    System.out.println("Try again!");
                }
            }
            input = scanner.nextLine();
        }
        if (!elementsList.isEmpty()) {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", elementsList));
        }
    }

    private static boolean isValidIndex(int indexOne, int indexTwo, List<String> elementsList) {
        return (indexOne >= 0 && indexOne < elementsList.size()) && (indexTwo >= 0 && indexTwo < elementsList.size());
    }
}
/*
Write a program that recreates the Memory game.
On the first line, you will receive a sequence of elements.
Each element in the sequence will have a twin.
Until the player receives "end" from the console,
you will receive strings with two integers separated by a space,
representing the indexes of elements in the sequence.
If the player tries to cheat and enters two equal indexes or indexes which are out of bounds of the sequence,
you should add two matching elements at the middle of the sequence in the following format:
"-{number of moves until now}a"
Then print this message on the console:
"Invalid input! Adding additional elements to the board"
Input
•	On the first line, you will receive a sequence of elements
•	On the following lines, you will receive integers until the command "end"
Output
•	Every time the player hit two matching elements, you should remove them from the sequence and print on the console the following message:
"Congrats! You have found matching elements - ${element}!"
•	If the player hit two different elements, you should print on the console the following message:
"Try again!"
•	If the player hit all matching elements before he receives "end" from the console, you should print on the console the following message:
"You have won in {number of moves until now} turns!"
•	If the player receives "end" before he hits all matching elements, you should print on the console the following message:
"Sorry you lose :(
{the current sequence's state}"
Constraints
•	All elements in the sequence will always have a matching element.

 */