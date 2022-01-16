package basicSyntaxConditionalStatementsLoops.lab;
//created by R.M
import java.util.Scanner;

public class Fun04BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int hoursInMin = hour * 60;
        int allTime = hoursInMin + minutes + 30;

        int hourAfterThirtyMin = allTime / 60;
        int minutesAfterThirtyMin = allTime % 60;

        if (minutesAfterThirtyMin < 10 && hourAfterThirtyMin < 23) {
            System.out.printf("%d:%02d", hourAfterThirtyMin, minutesAfterThirtyMin);
        } else if (hourAfterThirtyMin > 23) {
            System.out.printf("0:%02d", minutesAfterThirtyMin);
        } else {
            System.out.printf("%d:%d", hourAfterThirtyMin, minutesAfterThirtyMin);
        }
    }
}
