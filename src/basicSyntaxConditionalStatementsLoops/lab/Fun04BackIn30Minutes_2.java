package basicSyntaxConditionalStatementsLoops.lab;
// created by R.M
import java.util.Scanner;

public class Fun04BackIn30Minutes_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine()) + 30;

        if (minutes > 59) {
            hour++;
            minutes -= 60;
        }
        if (hour > 23) {
            hour = 0;
        }
        System.out.printf("%d:%02d", hour, minutes);
    }
}
