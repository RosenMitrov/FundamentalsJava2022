package fund07AssociativeArrays.moreExercises;

import javax.swing.*;
import java.util.*;

//created by R.M.
public class P01Ranking {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contestsMap = new LinkedHashMap<>();
        String input = scanner.nextLine();

        while (!input.equals("end of contests")) {
            String[] data = input.split(":");
            String contest = data[0];
            String pass = data[1];
            contestsMap.put(contest, pass);
            input = scanner.nextLine();
        }

        Map<String, TreeMap<String, Integer>> userPointsContestMap = new TreeMap<>();

        input = scanner.nextLine();
        while (!input.equals("end of submissions")) {
            String[] data = input.split("=>");
            String contest = data[0];
            String pass = data[1];
            String username = data[2];
            int points = Integer.parseInt(data[3]);

            if (contestsMap.containsKey(contest)) {
                if (contestsMap.get(contest).equals(pass)) {
                    userPointsContestMap.putIfAbsent(username, new TreeMap<>());
                    userPointsContestMap.get(username).putIfAbsent(contest, points);

                    if (userPointsContestMap.get(username).get(contest) < points) {
                        userPointsContestMap.get(username).put(contest, points);
                    }
                }
            }
            input = scanner.nextLine();
        }

        int bestPoints = 0;
        String bestUser = "";

        for (Map.Entry<String, TreeMap<String, Integer>> entry : userPointsContestMap.entrySet()) {
            int sum = 0;
            for (Map.Entry<String, Integer> integerEntry : entry.getValue().entrySet()) {
                sum += integerEntry.getValue();
            }

            if (sum > bestPoints) {
                bestPoints = sum;
                bestUser = entry.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n", bestUser, bestPoints);
        System.out.println("Ranking:");

//        userPointsContestMap.forEach((key, value) -> {
//            System.out.printf("%s%n", key);
//            value.entrySet().stream().
//                    sorted((f, s) -> s.getValue() - f.getValue()).
//                    forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
//        });

        for (Map.Entry<String, TreeMap<String, Integer>> entry : userPointsContestMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());

            entry.getValue().entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(k -> System.out.printf("#  %s -> %d%n", k.getKey(), k.getValue()));

        }
    }
}
/*
1.	Ranking
Here comes the final and the most interesting part - the Final ranking of the candidate-interns.
The final ranking is determined by the points of the interview tasks and from the exams in SoftUni.
Here is your final task. You will receive some lines of input in the format "{contest}:{password for contest}" until you receive "end of contests". Save that data because you will need it later. After that, you will receive another type of inputs in the format "{contest}=>{password}=>{username}=>{points}" until you receive "end of submissions". Here is what you need to do:
•	Check if the contest is valid (if you received it in the first type of input);
•	Check if the password is correct for the given contest;
•	Save the user with the contest they take part in (a user can take part in many contests) and the points the user has in the given contest. If you receive the same contest and the same user, update the points only if the new ones are more than the older ones.
In the end, you have to print the info for the user with the most points in the format "Best candidate is {user} with total {total points} points.". After that print all students ordered by their names. For each user print each contest with the points in descending order. See the examples.
Input
•	Strings in format "{contest}:{password for contest}" until the "end of contests" command. There will be no case with two equal contests.
•	Strings in format "{contest}=>{password}=>{username}=>{points}" until the "end of submissions" command.
•	There will be no case with 2 or more users with the same total points!
Output
•	On the first line print the best user in a format:
"Best candidate is {user} with total {total points} points.".
•	Then print all students ordered as mentioned above in format:
"{user1 name}
#  {contest1} -> {points}
#  {contest2} -> {points}"
Constraints
•	The strings may contain any ASCII character except (:, =, >).
•	The numbers will be in the range [0 - 10000].
•	The second input is always valid.

 */