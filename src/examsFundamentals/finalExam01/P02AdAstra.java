package examsFundamentals.finalExam01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P02AdAstra {
    static class Food {
        private String itemName;
        private String expirationDate;
        private int calories;

        public Food(String itemName, String expirationDate, int calories) {
            this.itemName = itemName;
            this.expirationDate = expirationDate;
            this.calories = calories;
        }

        public String getItemName() {
            return itemName;
        }

        public void setItemName(String itemName) {
            this.itemName = itemName;
        }

        public String getExpirationDate() {
            return expirationDate;
        }

        public void setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
        }

        public int getCalories() {
            return calories;
        }

        public void setCalories(int calories) {
            this.calories = calories;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "([|#])(?<item>[a-zA-Z\\s]+)\\1(?<expirationDate>\\d{2}[\\/]\\d{2}[\\/]\\d{2})\\1(?<calories>[\\d]{1,5})\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<Food> foodList = new ArrayList<>();
        int totalCalories = 0;
        while (matcher.find()) {
            String foodItem = matcher.group("item");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));
            Food currentFood = new Food(foodItem, expirationDate, calories);
            foodList.add(currentFood);
            totalCalories += calories;
        }

        System.out.printf("You have food to last you for: %d days!%n", totalCalories / 2000);

        foodList.forEach((f -> System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n", f.getItemName(), f.getExpirationDate(), f.getCalories())));
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
Calculate the total calories of all food items
and then determine how many days you can last with the food you have.
Keep in mind that you need 2000kcal a day.
Input / Constraints
•	You will receive a single string
Output
•	First, print the number of days you will be able to last with the food you have:
"You have food to last you for: {days} days!"
•	The output for each food item should look like this:
"Item: {item name}, Best before: {expiration date}, Nutrition: {calories}"

 */