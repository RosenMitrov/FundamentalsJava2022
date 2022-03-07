package fund07AssociativeArrays.exercises;

import java.util.*;

//created by R.M.
public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentsInfoMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsInfoMap.containsKey(name)) {
                studentsInfoMap.put(name, new ArrayList<>());
            }
            studentsInfoMap.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentsInfoMap.entrySet()) {
            double currentSumGrades = 0.00;
            for (Double grade : entry.getValue()) {
                currentSumGrades += grade;
            }
            int countGrades = entry.getValue().size();
            double averageGrade = currentSumGrades / countGrades;
            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), averageGrade);
            }
        }
    }
}
/*
7.	Student Academy
Write a program, which keeps the information about students and their grades.
On the first line, you will receive number n.
After that, you will receive n pair of rows.
First, you will receive the student's name,
after that, you will receive his grade.
Check if the student already exists and if not - add him.
Keep track of all grades for each student.
When you finish reading data, keep students with an average grade higher or equal to 4.50.
Print the students and their average grade in the format:
"{name} –> {averageGrade}"
Format the average grade to the 2nd decimal place.

 */