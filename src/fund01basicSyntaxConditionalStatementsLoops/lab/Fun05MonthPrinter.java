package fund01basicSyntaxConditionalStatementsLoops.lab;
//created by R.M

import java.util.Scanner;

public class Fun05MonthPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayOfMonth = Integer.parseInt(scanner.nextLine());
        String nameOfMonth = "";

        switch (dayOfMonth) {
            case 1:
                nameOfMonth = "January";
                break;
            case 2:
                nameOfMonth = "February";
                break;
            case 3:
                nameOfMonth = "March";
                break;
            case 4:
                nameOfMonth = "April";
                break;
            case 5:
                nameOfMonth = "May";
                break;
            case 6:
                nameOfMonth = "June";
                break;
            case 7:
                nameOfMonth = "July";
                break;
            case 8:
                nameOfMonth = "August";
                break;
            case 9:
                nameOfMonth = "September";
                break;
            case 10:
                nameOfMonth = "October";
                break;
            case 11:
                nameOfMonth = "November";
                break;
            case 12:
                nameOfMonth = "December";
                break;
            default:
                nameOfMonth = "Error!";
                break;
        }
        System.out.println(nameOfMonth);
    }
}
