package basicSyntaxConditionalStatementsLoops.exercises;
// created by R.M.

import java.util.Scanner;

public class Fun01Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int babyAge = Integer.parseInt(scanner.nextLine());
        String ageGroup = "";

        if (0 <= babyAge && babyAge <= 2) {
            ageGroup = "baby";
        } else {
            if (3 <= babyAge && babyAge <= 13) {
                ageGroup = "child";
            } else {
                if (14 <= babyAge && babyAge <= 19) {
                    ageGroup = "teenager";
                } else {
                    if (20 <= babyAge && babyAge <= 65) {
                        ageGroup = "adult";
                    } else {// ages >= 66
                        ageGroup = "elder";
                    }
                }
            }
        }
        System.out.println(ageGroup);
    }
}
