package fund07AssociativeArrays.moreExercises;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

//created by R.M.
public class P02Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //  contest     user     points
        Map<String, Map<String, Integer>> userContestPointMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        //"{username} -> {contest} -> {points}"
        Map<String, Integer> userPointsMap = new HashMap<>();

        while (!input.equals("no more time")) {
            String[] data = input.split(" -> ");
            String userName = data[0];
            String contest = data[1];
            int points = Integer.parseInt(data[2]);

            userContestPointMap.putIfAbsent(contest, new HashMap<>());
            userContestPointMap.get(contest).putIfAbsent(userName, points);

//            for (Map.Entry<String, Integer> entry : userContestPointMap.get(contest).entrySet()) {
//                if (entry.getValue() < points) {
//                    userContestPointMap.get(contest).put(userName, points);
//                }
//            }


            if (userPointsMap.containsKey(userName)) {
                int currentPoints = userPointsMap.get(userName);
                userPointsMap.put(userName, Math.max(currentPoints,points));
            } else {
                userPointsMap.putIfAbsent(userName, points);

            }

            input = scanner.nextLine();
        }

        AtomicInteger num = new AtomicInteger();
        for (Map.Entry<String, Map<String, Integer>> entry : userContestPointMap.entrySet()) {
            System.out.printf("%s: %d participants%n", entry.getKey(), entry.getValue().size());

            num.set(1);
            entry.getValue().entrySet().stream().sorted((k, v) -> v.getValue().compareTo(k.getValue()))
                    .forEach(k -> {

                        System.out.printf("%d. %s <::> %d%n",num.getAndIncrement(), k.getKey(), k.getValue());
                    });
        }
        System.out.println("Individual standings:");
        num.set(1);
        userPointsMap.entrySet().stream().sorted((k, v) -> v.getValue().compareTo(k.getValue()))
                .forEach(k -> {


                    System.out.printf("%d. %s -> %d%n",num.getAndIncrement(), k.getKey(), k.getValue());
                });

    }


}
