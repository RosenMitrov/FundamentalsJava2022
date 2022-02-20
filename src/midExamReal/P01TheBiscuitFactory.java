package midExamReal;

import java.util.Scanner;

public class P01TheBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBiscuits = Integer.parseInt(scanner.nextLine());// per day
        int workersCount = Integer.parseInt(scanner.nextLine());
        int numberOfBiscuits = Integer.parseInt(scanner.nextLine());

        int days = 0;
        double totalBiscuits = 0.00;

        while (days < 30) {
            days++;
            if (days % 3 == 0) {
                double seventyFive = countBiscuits * 0.75;
                totalBiscuits += Math.floor(seventyFive * workersCount);
            } else {
                totalBiscuits += (countBiscuits * workersCount);
            }
        }

        System.out.printf("You have produced %.0f biscuits for the past month.%n", totalBiscuits);

        if (totalBiscuits > numberOfBiscuits) {
            double diff = totalBiscuits - numberOfBiscuits;
            System.out.printf("You produce %.2f percent more biscuits.", (diff / numberOfBiscuits) * 100);
        } else if (numberOfBiscuits > totalBiscuits) {
            double diff = numberOfBiscuits - totalBiscuits;
            System.out.printf("You produce %.2f percent less biscuits.", (diff / numberOfBiscuits) * 100);
        }
    }
}