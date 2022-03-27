package fund06ObjectsAndClasses.moreExercises;

import java.util.*;

//created vy R.M.
public class P01CompanyRoster {
    static class Employee {
        private String name;
        private double salary;
        private String position;
        private String department;

        private String email;
        private int age;

        public Employee(String name, double salary, String position, String department, String email, int age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Employee>> departmentMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];
            String email = "n/a";
            int age = -1;
            if (data.length == 5) {
                String check = data[4];
                if (check.contains("@")) {
                    email = check;
                } else {
                    age = Integer.parseInt(data[4]);
                }
            } else if (data.length == 6) {
                String check = data[4];

                if (check.contains("@")) {
                    email = check;
                    age = Integer.parseInt(data[5]);
                } else {
                    email = data[5];
                    age = Integer.parseInt(check);
                }
            }
            Employee employee = new Employee(name, salary, position, department, email, age);
            if (!departmentMap.containsKey(department)) {
                departmentMap.put(department, new ArrayList<>());
            }
            departmentMap.get(department).add(employee);
        }

        departmentMap.entrySet().stream().sorted((a, b) -> {
            double sumFirst = a.getValue().stream().mapToDouble(Employee::getSalary).sum();
            double avrFirst = sumFirst / a.getValue().size();
            double sumSecond = b.getValue().stream().mapToDouble(Employee::getSalary).sum();
            double avrSecond = sumSecond / b.getValue().size();
//            double avrFirst = a.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(0.00);
//            double avrSecond = b.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(0.00);
            return Double.compare(avrSecond, avrFirst);
        }).limit(1).forEach(e -> {
            System.out.printf("Highest Average Salary: %s%n", e.getKey());
            e.getValue().stream().sorted((a, b) -> Double.compare(b.getSalary(), a.getSalary())).forEach(employee ->
                    System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge()));
        });
    }
}
