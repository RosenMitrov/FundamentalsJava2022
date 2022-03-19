package fund09RegularExpressions.exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameRegex = "[A-Za-z]+";
        Pattern patternName = Pattern.compile(nameRegex);
        String digitRegex = "[0-9]";
        Pattern distancePattern = Pattern.compile(digitRegex);

        String[] participants = scanner.nextLine().split(", ");
        Map<String, Integer> participantsMap = new LinkedHashMap<>();
        for (String participant : participants) {
            participantsMap.putIfAbsent(participant, 0);
        }

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {
            Matcher nameMatcher = patternName.matcher(input);

            StringBuilder name = new StringBuilder();
            while (nameMatcher.find()) {
                name.append(nameMatcher.group(0));
            }


            if (participantsMap.containsKey(name.toString())) {

                Matcher distanceMatcher = distancePattern.matcher(input);
                while (distanceMatcher.find()) {
                    int digit = Integer.parseInt(distanceMatcher.group(0));
                    participantsMap.put(name.toString(), participantsMap.get(name.toString()) + digit);
                }
            }
            input = scanner.nextLine();
        }
        List<String> winners = new ArrayList<>();
        participantsMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(3).forEach(v -> winners.add(v.getKey()));
        System.out.println();
        for (int i = 0; i < winners.size(); i++) {
            if (i == 0) {
                System.out.printf("1st place: %s%n", winners.get(i));
            }
            if (i == 1) {
                System.out.printf("2nd place: %s%n", winners.get(i));
            }
            if (i == 2) {
                System.out.printf("3rd place: %s%n", winners.get(i));
                break;
            }
        }
    }
}
/*
2.	Race
Write a program that processes information about a race.
On the first line, you will be given a list of participants separated by ", ".
On the next few lines until you receive a line "end of race"
you will be given some info which will be some alphanumeric characters.
In between them, you could have some extra characters which you should ignore.
For example: "G!32e%o7r#32g$235@!2e". The letters are the name of the person and the sum of the digits is the distance he ran.
So here we have George who ran 29 km.
Store the information about the person only if the list of racers contains the name of the person.
If you receive the same person more than once just add the distance to his old distance.
At the end print the top 3 racers in the format:
"1st place: {first racer}
2nd place: {second racer}
3rd place: {third racer}"

 */

/*
Rick, Negan, Lucille, Peter, Stamat, George
R****i22c00k199!!!
N***&^e989ga(*&^&^&n323)))
*^%%Pe8787t&&^er87#$(%)
L&^%u9754cille*&^&%^234
R**%^&%i11c104k123!^&!!
R&&%^&%ic10^$@k123!^&!!
*^%Peter8675
*^%Geo$12#%112r^$ge23!(@^)
!!22!P23!e!t!e!r!85
end of race

 */