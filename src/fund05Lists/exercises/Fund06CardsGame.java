package fund05Lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int index = 0;
        while (firstDeck.size() > 0 && secondDeck.size() > 0) {
            int cardFirstDeck = firstDeck.get(index);
            int cardSecondDeck = secondDeck.get(index);
            firstDeck.remove(0);
            secondDeck.remove(0);

            if (cardFirstDeck > cardSecondDeck) {
                firstDeck.add(cardFirstDeck);
                firstDeck.add(cardSecondDeck);
            } else if (cardFirstDeck < cardSecondDeck) {
                secondDeck.add(cardSecondDeck);
                secondDeck.add(cardFirstDeck);
            }
            index--;
            index++;
        }
        printWinnerAndResult(firstDeck, secondDeck);
    }

    private static void printWinnerAndResult(List<Integer> firstDeck, List<Integer> secondDeck) {
        int sum = 0;
        if (firstDeck.size() > secondDeck.size()) {
            for (int card : firstDeck) {
                sum += card;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (firstDeck.size() < secondDeck.size()) {//firstDeck.size() > secondDeck.size()
            for (int card : secondDeck) {
                sum += card;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }
}
/*
6.	Cards Game
You will be given two hands of cards, which will be integer numbers.
Assume that you have two players. You have to find out the winning deck and respectively the winner.
You start from the beginning of both hands.
Compare the cards from the first deck to the cards from the second deck.
The player, who has a bigger card, takes both cards
and puts them at the back of his hand - the second player's card is last,
and the first person's card (the winning one) is before it (second to last)
and the player with the smaller card must remove the card from his deck.
If both players' cards have the same values - no one wins,
and the two cards must be removed from the decks.
The game is over when one of the decks is left without any cards.
You have to print the winner on the console and the sum of the left cards:
"{First/Second} player wins! Sum: {sum}".

 */