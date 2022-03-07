package fund07AssociativeArrays.exercises;

import java.util.*;

//created by R.M.
public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> peoplePoints = new LinkedHashMap<>();
        Map<String, List<String>> languageNames = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("exam finished")) {
            String[] data = input.split("-");
            if (data.length == 3) {
                String name = data[0];
                String language = data[1];
                int points = Integer.parseInt(data[2]);
                peoplePoints.putIfAbsent(name, points);
                for (Map.Entry<String, Integer> entry : peoplePoints.entrySet()) {
                    if (entry.getValue() < points) {
                        peoplePoints.put(name, points);
                    }
                }

                languageNames.putIfAbsent(language, new ArrayList<>());
                languageNames.get(language).add(name);

            } else if (data.length == 2) {
                String name = data[0];
                peoplePoints.remove(name);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : peoplePoints.entrySet()) {
            System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, List<String>> entry : languageNames.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue().size());
        }
    }
}
/*
10.	*SoftUni Exam Results
Judge statistics on the last Programing Fundamentals exam were not working correctly,
so you have the task to take all the submissions and analyze them properly.
You should collect all the submissions and print the final results and statistics about each language that the participants submitted their solutions in.
You will be receiving lines in the following format: "{username}-{language}-{points}" until you receive "exam finished".
You should store each username and their submissions and points.
You can receive a command to ban a user for cheating in the following format: "{username}-banned". In that case,
you should remove the user from the contest but preserve his submissions in the total count of submissions for each language.
After receiving "exam finished", print each of the participants in the following format:
"Results:
{username} | {points}
{username2} | {points}
…
{usernameN} | {points}"
After that, print each language, used in the exam in the following format:
"Submissions:
{language1} - {submissions_count}
{language2} - {submissions_count}
…
{language3} - {submissions_count}"
Input / Constraints
Until you receive "exam finished", you will be receiving participant submissions in the following format: "{username}-{language}-{points}"
You can receive a ban command -> "{username}-banned".
The points of the participant will always be a valid integer in the range [0-100].
Output
•	Print the exam results for each participant.
•	After that, print each language in the format shown above.
•	Allowed working time / memory: 100ms / 16MB.

 */