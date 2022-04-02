package mixed;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([@#])(?<left>[A-Za-z]{3,})\\1{2}(?<right>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> allValidList = new ArrayList<>();
        Map<String, String> mirrorMap = new LinkedHashMap<>();
        while (matcher.find()) {
            String left = matcher.group("left");
            StringBuilder right = new StringBuilder(matcher.group("right")).reverse();
            allValidList.add(matcher.group(0));
            if (left.equals(right.toString())) {
                right.reverse();
                mirrorMap.put(left, right.toString());
            }
        }
        if (allValidList.size() > 0) {
            System.out.printf("%d word pairs found!%n", allValidList.size());
        } else {
            System.out.println("No word pairs found!");
        }
        if (!mirrorMap.isEmpty()) {
            System.out.println("The mirror words are:");
            int count = 0;
            for (Map.Entry<String, String> entry : mirrorMap.entrySet()) {
                count++;
                if (count == mirrorMap.size()) {
                    System.out.printf("%s <=> %s ", entry.getKey(), entry.getValue());
                } else {
                    System.out.printf("%s <=> %s, ", entry.getKey(), entry.getValue());
                }
            }
        } else {
            System.out.println("No mirror words!");
        }


    }
}
