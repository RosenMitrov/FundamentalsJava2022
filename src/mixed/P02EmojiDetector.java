package mixed;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regexDigits = "\\d";
        Pattern patternDigits = Pattern.compile(regexDigits);
        Matcher matcherDigit = patternDigits.matcher(input);
        long thresholdCool = 1;
        while (matcherDigit.find()) {
            int currentDigit = Integer.parseInt(matcherDigit.group());
            thresholdCool *= currentDigit;
        }

        String regexEmoji = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})\\1";
        Pattern patternEmoji = Pattern.compile(regexEmoji);
        Matcher matcherEmoji = patternEmoji.matcher(input);
        List<String> emojis = new ArrayList<>();
        Map<String, Long> emojiAndValueMap = new LinkedHashMap<>();
        while (matcherEmoji.find()) {
            String emoji = matcherEmoji.group("emoji");
            long emojiCoolness = takeEmojiCoolness(emoji);
            emojis.add(emoji);
            if (emojiCoolness > thresholdCool) {
                emojiAndValueMap.put(matcherEmoji.group(0), emojiCoolness);
            }
        }

        System.out.printf("Cool threshold: %d%n", thresholdCool);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", emojis.size());

        for (Map.Entry<String, Long> entry : emojiAndValueMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
        }
    }

    private static long takeEmojiCoolness(String emoji) {
        long coolness = 0;
        for (char letter : emoji.toCharArray()) {
            coolness += letter;
        }
        return coolness;
    }
}
