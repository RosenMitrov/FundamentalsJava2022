package examsFundamentals.midExam04;

import java.util.Scanner;

//created by R.M.
public class P01GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFood = Double.parseDouble(scanner.nextLine()) ;
        double quantityHay = Double.parseDouble(scanner.nextLine()) ;
        double quantityCover = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());

        int counterDays = 0;
        while (quantityFood > 0 && quantityHay > 0 && quantityCover > 0) {
            counterDays++;

            quantityFood -= 0.300;

            if (counterDays % 2 == 0) {
                quantityHay -= (0.05 * quantityFood);
            }

            if (counterDays % 3 == 0) {
                quantityCover -= (weight / 3);
            }
            if (counterDays == 30) {
                break;
            }
        }

        if (quantityFood > 0 && quantityHay > 0 && quantityCover > 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFood, quantityHay, quantityCover);
        } else {
            System.out.println("Merry must go to the pet store!");
        }
    }
}
/*
Merry has a guinea pig named Puppy, that she loves very much.
Every month she goes to the nearest pet store and buys him everything he needs – food, hay, and cover.
On the first three lines,
you will receive the quantity of food, hay, and cover,
which Merry buys for a month (30 days). On the fourth line,
you will receive the guinea pig's weight.
Every day Puppy eats 300 gr of food.
Every second day Merry first feeds the pet, then gives it a certain amount of hay equal to 5% of the rest of the food.
On every third day, Merry puts Puppy cover with a quantity of 1/3 of its weight.
Calculate whether the quantity of food, hay, and cover, will be enough for a month.
If Merry runs out of food, hay, or cover, stop the program!
Input
•	On the first line – quantity food in kilograms - a floating-point number in the range [0.0 – 10000.0]
•	On the second line – quantity hay in kilograms - a floating-point number in the range [0.0 – 10000.0]
•	On the third line – quantity cover in kilograms - a floating-point number in the range [0.0 – 10000.0]
•	On the fourth line – guinea's weight in kilograms - a floating-point number in the range [0.0 – 10000.0]
Output
•	If the food, the hay, and the cover are enough, print:
o	"Everything is fine! Puppy is happy! Food: {excessFood}, Hay: {excessHay}, Cover: {excessCover}."
•	If one of the things is not enough, print:
o	"Merry must go to the pet store!"
The output values must be formatted to the second decimal place!


 */
