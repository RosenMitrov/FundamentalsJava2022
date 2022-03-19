package examsFundamentals.finalExam05;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regexNumbers = "\\d";
        Pattern patternThreshold = Pattern.compile(regexNumbers);
        Matcher matcherThreshold = patternThreshold.matcher(input);

        long thresholdCool = 1;
        while (matcherThreshold.find()) {
            thresholdCool *= Integer.parseInt(matcherThreshold.group(0));
        }

        String regexEmoji = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        //  String regexEmoji = "(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))";

        Pattern patternEmoji = Pattern.compile(regexEmoji);
        Matcher matcherEmoji = patternEmoji.matcher(input);
        List<String> emojiList = new ArrayList<>();
        while (matcherEmoji.find()) {
            emojiList.add(matcherEmoji.group());
        }
        String onlyLettersRegex = "([^:*])";
        Pattern patternLetters = Pattern.compile(onlyLettersRegex);
        Map<String, Long> emojiAndValuesMap = new LinkedHashMap<>();
        for (String currentEmoji : emojiList) {
            Matcher matcherLetters = patternLetters.matcher(currentEmoji);
            long asciiLettersSum = 0L;
            while (matcherLetters.find()) {
                char symbol = matcherLetters.group(0).charAt(0);
                asciiLettersSum += symbol;
            }
            if (asciiLettersSum > thresholdCool) {
                emojiAndValuesMap.put(currentEmoji, asciiLettersSum);
            }

        }
        System.out.println("Cool threshold: " + thresholdCool);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojiList.size());
        for (Map.Entry<String, Long> entry : emojiAndValuesMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
/*
Your task is to write a program that extracts emojis from a text and find the threshold based on the input.
You have to get your cool threshold. It is obtained by multiplying all the digits found in the input.
The cool threshold could be a huge number, so be mindful.
An emoji is valid when:
•	It is surrounded by 2 characters, either "::" or "**"
•	It is at least 3 characters long (without the surrounding symbols)
•	It starts with a capital letter
•	Continues with lowercase letters only
Examples of valid emojis: ::Joy::, **Banana**, ::Wink::
Examples of invalid emojis: ::Joy**, ::fox:es:, **Monk3ys**, :Snak::Es::
You need to count all valid emojis in the text and calculate their coolness. The coolness of the emoji is determined by summing all the ASCII values of all letters in the emoji.
Examples: ::Joy:: - 306, **Banana** - 577, ::Wink:: - 409
You need to print the result of the cool threshold and, after that to take all emojis out of the text, count them and print only the cool ones on the console.
Input
•	On the single input, you will receive a piece of string.
Output
•	On the first line of the output, print the obtained Cool threshold in the format:
"Cool threshold: {coolThresholdSum}"
•	On the following line, print the count of all emojis found in the text in format:
"{countOfAllEmojis} emojis found in the text. The cool ones are:
{cool emoji 1}
{cool emoji 2}
…
{cool emoji N}"
Constraints
There will always be at least one digit in the text!

 */