package fund05Lists.moreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//created by R.M.
public class Fund01Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();

        String text = "";

        for (int index = 0; index < listOfNumbers.size(); index++) {
            int sumOfDigits = getSumOfDigits(listOfNumbers, index);

            int indexOfInput = 0;
            int counter = 0;
            char letter = ' ';
            if (sumOfDigits > input.length()) {
                indexOfInput = sumOfDigits - input.length();
                letter = input.charAt(indexOfInput);
                text += letter;
            } else {
                for (int i = 0; i < input.length()- 1; i++) {
                    letter = input.charAt(i + 1);
                    counter++;
                    if (counter == sumOfDigits) {
                        text += letter;


                    }
                }
            }
            StringBuilder remove = new StringBuilder(input);
            remove.deleteCharAt(indexOfInput);
            input = remove.toString();
        }
        System.out.println(text);
    }

    private static int getSumOfDigits(List<Integer> listOfNumbers, int index) {
        int num = listOfNumbers.get(index);
        int sum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }
}
/*
1.	Messaging
You will be given a list of numbers and a string.
For each element of the list, you have to take the sum of its digits and take the element corresponding to that index from the text.
If the index is greater than the length of the text, start counting from the beginning (so that you always have a valid index).
After getting the element from the text,
you have to remove the character you have taken from it (so for the next index, the text will be with one characterless).

 */