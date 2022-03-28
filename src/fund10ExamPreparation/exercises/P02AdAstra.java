package fund10ExamPreparation.exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P02AdAstra {
    static class Food {
        private String item;
        private String date;
        private int calories;

        public Food(String item, String date, int calories) {
            this.item = item;
            this.date = date;
            this.calories = calories;
        }

        public int getCalories() {
            return this.calories;
        }

        public String getPrintItem(){
            return String.format("Item: %s, Best before: %s, Nutrition: %d", this.item, this.date, this.calories);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String givenText = scanner.nextLine();
        String regex = "([|#])(?<item>[A-Za-z ]+)\\1(?<date>\\d{2}[\\/]\\d{2}[\\/]\\d{2})\\1(?<calories>\\d{1,4}|10000)\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(givenText);
        List<Food> foodList = new ArrayList<>();
        double test = 0.00;
        while (matcher.find()) {
            String item = matcher.group("item");
            String date = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            Food currentFood = new Food(item, date, calories);
            foodList.add(currentFood);
            test += calories;
        }
        int neededCalPerDay = 2000;
        int sumCalories = foodList.stream().mapToInt(Food::getCalories).sum();
        int foodForNumberOfDays = sumCalories / neededCalPerDay;

        System.out.printf("You have food to last you for: %d days!%n", foodForNumberOfDays);
        foodList.forEach(food -> System.out.println(food.getPrintItem()));
    }
}

/*
You are an astronaut who just embarked on a mission across the solar system.
Since you will be in space for a long time, you have packed a lot of food with you.
Create a program, which helps you identify how much food you have left and gives you information about its expiration date.
On the first line of the input, you will be given a text string. You must extract the information about the food and calculate the total calories.
First, you must extract the food info. It will always follow the same pattern rules:
•	It will be surrounded by "|" or "#" (only one of the two) in the following pattern:
#{item name}#{expiration date}#{calories}#   or
|{item name}|{expiration date}|{calories}|
•	The item name will contain only lowercase and uppercase letters and whitespace
•	The expiration date will always follow the pattern: "{day}/{month}/{year}",
where the day, month, and year will be exactly two digits long
•	The calories will be an integer between 0-10000
Calculate the total calories of all food items and then determine how many days you can last with the food you have. Keep in mind that you need 2000kcal a day.
Input / Constraints
•	You will receive a single string
Output
•	First, print the number of days you will be able to last with the food you have:
"You have food to last you for: {days} days!"
•	The output for each food item should look like this:
"Item: {item name}, Best before: {expiration date}, Nutrition: {calories}"

 */
