package fund06ObjectsAndClasses.exercises.P01AdvertisementMessage;

import java.util.Scanner;

//created by R.M.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scanner.nextLine());
        AdMessage adMessage = new AdMessage();
        adMessage.printRandomMessage(numberOfMessages);
    }
}
/*
1.	Advertisement Message
Write a program that generates random fake advertisement message to extol some product.
The messages must consist of 4 parts: laudatory phrase + event + author + city. Use the following predefined parts:

•	Phrases – {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."}
•	Events – {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"}
•	Authors – {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"}
•	Cities – {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"}

The format of the output message is: {phrase} {event} {author} – {city}.
As an input, you take the number of messages to be generated. Print each random message on a separate line.

 */