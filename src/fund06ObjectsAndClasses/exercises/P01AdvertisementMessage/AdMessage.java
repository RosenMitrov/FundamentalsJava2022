package fund06ObjectsAndClasses.exercises.P01AdvertisementMessage;

import java.util.Random;

//created by R.M.
public class AdMessage {
    private String[] phrases = {"Excellent product."
            , "Such a great product."
            , "I always use that product."
            , "Best product of its category."
            , "Exceptional product."
            , "I can’t live without this product."};
    private String[] events = new String[]{"Now I feel good."
            , "I have succeeded with this product."
            , "Makes miracles. I am happy of the results!"
            , "I cannot believe but now I feel awesome."
            , "Try it yourself, I am very satisfied."
            , "I feel great!"};
    private String[] authors = new String[]{"Diana"
            , "Petya"
            , "Stella"
            , "Elena"
            , "Katya"
            , "Iva"
            , "Annie"
            , "Eva"};
    private String[] cities = new String[]{"Burgas"
            , "Sofia"
            , "Plovdiv"
            , "Varna"
            , "Ruse"};
    Random rd = new Random();

    public void printRandomMessage(int messages) {
        for (int i = 0; i < messages; i++) {
            System.out.printf("%s %s %s - %s%n",
                    this.phrases[rd.nextInt(this.phrases.length)],
                    this.events[rd.nextInt(this.events.length)],
                    this.authors[rd.nextInt(this.authors.length)],
                    this.cities[rd.nextInt(this.cities.length)]);
        }
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