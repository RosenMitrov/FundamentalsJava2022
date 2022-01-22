package fund01basicSyntaxConditionalStatementsLoops.lab;
//created by R.M
import java.util.Scanner;

public class Fun07TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfTheDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        boolean isAgeValid = true;
        int price = 0;

        switch (typeOfTheDay) {
            case "Weekday":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                    price = 12;
                } else {
                    if (18 < age && age <= 64) {
                        price = 18;
                    } else {
                        isAgeValid = false;
                    }
                }
                break;
            case "Weekend":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)) {
                    price = 15;
                } else {
                    if (18 < age && age <= 64) {
                        price = 20;
                    } else {
                        isAgeValid = false;
                    }
                }
                break;
            case "Holiday":
                if ((0 <= age && age <= 18)) {
                    price = 5;
                } else {
                    if (18 < age && age <= 64) {
                        price = 12;
                    } else {
                        if ((64 < age && age <= 122)) {
                            price = 10;
                        } else {
                            isAgeValid = false;
                        }
                    }
                }
                break;
            default:
        }
        if (!isAgeValid) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }
    }
}
