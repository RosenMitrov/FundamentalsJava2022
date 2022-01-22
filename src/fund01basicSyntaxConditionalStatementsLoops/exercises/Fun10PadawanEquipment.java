package fund01basicSyntaxConditionalStatementsLoops.exercises;
//created by R.M.

import java.util.Scanner;

public class Fun10PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double priceOfSaber = Double.parseDouble(scanner.nextLine());
        double priceOfRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());

        double totalPriceSabers = priceOfSaber * Math.ceil(studentsCount * 1.10);

        double totalPriceRobes = priceOfRobe * studentsCount;
        double totalPriceBelts = priceOfBelt * studentsCount;
        int freeBelts = studentsCount / 6;
        totalPriceBelts = totalPriceBelts - (freeBelts * priceOfBelt);

        double totalPriceEquipment = totalPriceSabers + totalPriceRobes + totalPriceBelts;

        if (money >= totalPriceEquipment) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalPriceEquipment);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", Math.abs(totalPriceEquipment - money));
        }
    }
}
