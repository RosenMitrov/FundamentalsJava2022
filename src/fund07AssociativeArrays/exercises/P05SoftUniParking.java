package fund07AssociativeArrays.exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.M.
public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkingMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];
            String name = data[1];
            switch (command) {
                case "register":
                    String licensePlate = data[2];
                    if (parkingMap.containsKey(name)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlate);
                    } else {
                        parkingMap.put(name, licensePlate);
                        System.out.printf("%s registered %s successfully%n", name, licensePlate);
                    }
                    break;
                case "unregister":
                    if (parkingMap.containsKey(name)) {
                        parkingMap.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", name);
                    }
                    break;
            }
        }
        parkingMap.forEach((k, v) -> System.out.printf("%s => %s%n", k, v));
    }
}
/*
5.	SoftUni Parking
SoftUni just got a new parking lot.
It's so fancy, it even has online parking validation.
Except, the online service doesn't work.
It can only receive users' data but doesn't know what to do with it.
Good thing you're on the dev team and know how to fix it, right?
Write a program, which validates parking for an online service.
Users can register to park and unregister to leave.

The program receives 2 commands:
•	"register {username} {licensePlateNumber}":
o	The system only supports one car per user at the moment, so if a user tries to register another license plate, using the same username, the system should print:
"ERROR: already registered with plate number {licensePlateNumber}"
o	If the aforementioned checks pass successfully, the plate can be registered, so the system should print:
 "{username} registered {licensePlateNumber} successfully"

•	"unregister {username}":
o	If the user is not present in the database, the system should print:
"ERROR: user {username} not found"
o	If the aforementioned check passes successfully, the system should print:
"{username} unregistered successfully"

After you execute all the commands, print all the currently registered users and their license plates in the format:
•	"{username} => {licensePlateNumber}"
Input
•	First line: n - number of commands – integer.
•	Next n lines: commands in one of two possible formats:
o	Register: "register {username} {licensePlateNumber}"
o	Unregister: "unregister {username}"
The input will always be valid, and you do not need to check it explicitly.

 */