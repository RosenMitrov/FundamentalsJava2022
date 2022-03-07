package fund07AssociativeArrays.exercises;

import java.util.*;

//created by R.M.
public class P08CompanyUsers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companiesMap = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            String company = data[0];
            String employeeId = data[1];
            if (!companiesMap.containsKey(company)) {
                companiesMap.put(company, new ArrayList<>());
            }

            if (companiesMap.containsKey(company) && !companiesMap.get(company).contains(employeeId)){
                companiesMap.get(company).add(employeeId);
            }

        //second solution
//            if (companiesMap.get(company).isEmpty()) {
//                companiesMap.get(company).add(employeeId);
//            } else {
//                List<String> currentList = new ArrayList<>();
//                boolean isEquals = false;
//                for (String id : companiesMap.get(company)) {
//                    if (id.equals(employeeId)) {
//                        isEquals = true;
//                        break;
//                    }
//                }
//                if (!isEquals) {
//                    currentList.add(employeeId);
//                }
//                for (String id : currentList) {
//                    companiesMap.get(company).add(id);
//                }
//            }
            input = scanner.nextLine();
        }

        companiesMap.forEach((k, v) -> {
            System.out.println(k);
            for (String id : v) {
                System.out.printf("-- %s%n", id);
            }
        });
    }
}
/*
8.	Company Users
Write a program which keeps the information about companies and their employees.
You will be receiving company names and an employees' id until you receive the command "End" command.
Add each employee to the given company.
Keep in mind that a company cannot have two employees with the same id.
Print the company name and each employee's id in the following format:
"{company_name}
-- {id1}
-- {id2}
…
-- {idN}"
Input / Constraints
•	Until you receive "End", the input come in the format: "{companyName} -> {employeeId}".
•	The input always will be valid.

 */
