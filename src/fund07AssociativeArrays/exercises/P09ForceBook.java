package fund07AssociativeArrays.exercises;

import java.util.*;

//created by R.M.
public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> sideUserMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {
                String[] data = input.split(" \\| ");
                String side = data[0];
                String user = data[1];

                sideUserMap.putIfAbsent(side, new ArrayList<>());
                boolean noneMatch = sideUserMap.entrySet()
                        .stream().noneMatch(entry -> entry.getValue().contains(user));
                if (noneMatch) {
                    sideUserMap.get(side).add(user);
                }
            } else if (input.contains("->")) {
                String[] data = input.split(" -> ");
                String user = data[0];
                String side = data[1];

                for (Map.Entry<String, List<String>> entry : sideUserMap.entrySet()) {
                    for (String currentUser : entry.getValue()) {
                        if (currentUser.equals(user)) {
                            entry.getValue().remove(currentUser);
                            break;
                        }
                    }
                }
//                sideUserMap.forEach((k, v) -> v.remove(user));
//                sideUserMap.putIfAbsent(side, new ArrayList<>());
//                sideUserMap.get(side).add(user);

                if (!sideUserMap.containsKey(side)) {
                    sideUserMap.put(side, new ArrayList<>());
                    sideUserMap.get(side).add(user);
                } else if (sideUserMap.containsKey(side) && !sideUserMap.get(side).contains(user)) {
                    sideUserMap.get(side).add(user);
                }
                System.out.printf("%s joins the %s side!%n", user, side);


            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : sideUserMap.entrySet()) {
            if (entry.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for (String member : entry.getValue()) {
                    System.out.printf("! %s%n", member);
                }
            }
        }
    }
}
/*
9.	*ForceBook
The force users are struggling to remember which side is the different forceUsers from because they switch them too often.
So you are tasked to create a web application to manage their profiles.
You will receive several input lines in one of the following formats:
"{force_side} | {force_user}"
"{force_user} -> {force_side}"
The "force_user" and "force_side" are strings, containing any character.
If you receive "force_side | force_user":
•	If there is no such force user and no such force side -> create a new force side and add the force user to the corresponding side.
•	Only if there is no such force user in any force side -> add the force user to the corresponding side.
•	If there is such force user already -> skip the command and continue to the next operation.
If you receive a "force_user -> force_side":
•	If there is such force user already -> change their side.
•	If there is no such force user in any force side -> add the force user to the corresponding force side.
•	If there is no such force user and no such force side -> create new force side and add the force user to the corresponding side.
•	Then you should print on the console: "{force_user} joins the {force_side} side!".
You should end your program when you receive the command "Lumpawaroo". At that point, you should print each force side. For each side, print the force users.
In case there are no force users on a side, you shouldn't print the side information.
Input / Constraints
•	The input comes in the form of commands in one of the formats specified above.
•	The input ends when you receive the command "Lumpawaroo".
Output
•	As output for each force side, you must print all the force users.
•	The output format is:
"Side: {forceSide}, Members: {forceUsers.Count}
! {forceUser}
! {forceUser}
! {forceUser}"
•	In case there are NO forceUsers, don't print this side.
 */