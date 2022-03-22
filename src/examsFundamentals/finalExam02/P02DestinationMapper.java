package examsFundamentals.finalExam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "([\\/]|[=])(?<destinations>[A-Z][a-zA-Z]{2,})\\1";
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinations = new ArrayList<>();
        int travelPoints = 0;
        while (matcher.find()) {
            String matchedDestination = matcher.group("destinations");
            travelPoints += matchedDestination.length();
            destinations.add(matchedDestination);
        }
        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinations));
        System.out.printf("Travel Points: %d", travelPoints);

    }
}
/*
Now that you have planned out your tour, you are ready to go! Your next task is to mark all the points on the map that you are going to visit.
You will be given a string representing some places on the map. You have to filter only the valid ones. A valid location is:
•	Surrounded by "=" or "/" on both sides (the first and the last symbols must match)
•	After the first "=" or "/" there should be only letters (the first must be upper-case, other letters could be upper or lower-case)
•	The letters must be at least 3
Example: In the string "=Hawai=/Cyprus/=Invalid/invalid==i5valid=/I5valid/=i=" only the first two locations are valid.
After you have matched all the valid locations, you have to calculate travel points.
They are calculated by summing the lengths of all the valid destinations that you have found on the map.
In the end, on the first line, print: "Destinations: {destinations joined by ', '}".
On the second line, print "Travel Points: {travel_points}".
Input / Constraints
•	You will receive a string representing the locations on the map
•	JavaScript: you will receive a single parameter: string
Output
•	Print the messages described above

 */