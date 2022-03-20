package examsFundamentals.finalExam03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//created by R.M.
public class P03NeedForSpeed {
    static class Car {
        private String carName;
        private int mileage;
        private int fuel;

        public Car(String carName, int mileage, int fuel) {
            this.carName = carName;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getCarName() {
            return this.carName;
        }

        public void setCarName(String carName) {
            this.carName = carName;
        }

        public int getMileage() {
            return this.mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return this.fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("([\\\\|])");
            String carName = data[0];
            int mileage = Integer.parseInt(data[1]);
            int fuel = Integer.parseInt(data[2]);
            carMap.put(carName, new Car(carName, mileage, fuel));
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] data = input.split("( : )");
            String command = data[0];
            String carName = data[1];
            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(data[2]);
                    int givenFuel = Integer.parseInt(data[3]);

                    if (carMap.get(carName).getFuel() - givenFuel < 0) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        int oldMileage = carMap.get(carName).getMileage();
                        carMap.get(carName).setMileage(oldMileage + distance);
                        int oldFuel = carMap.get(carName).getFuel();
                        carMap.get(carName).setFuel(oldFuel - givenFuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carName, distance, givenFuel);
                    }
                    if (carMap.get(carName).getMileage() >= 100000) {
                        carMap.remove(carName);
                        System.out.printf("Time to sell the %s!%n", carName);
                    }
                    break;
                case "Refuel":
                    givenFuel = Integer.parseInt(data[2]);
                    int oldFuel = carMap.get(carName).getFuel();

                    if (carMap.get(carName).getFuel() + givenFuel > 75) {
                        carMap.get(carName).setFuel(75);
                        System.out.printf("%s refueled with %d liters%n", carName, 75 - oldFuel);
                    } else {
                        carMap.get(carName).setFuel(oldFuel + givenFuel);
                        int newFuel = carMap.get(carName).getFuel();
                        System.out.printf("%s refueled with %d liters%n", carName, newFuel - oldFuel);
                    }
                    break;
                case "Revert":
                    int kilometers = Integer.parseInt(data[2]);
                    if (carMap.get(carName).getMileage() - kilometers <= 10000) {
                        carMap.get(carName).setMileage(10000);
                    } else {
                        int oldMileage = carMap.get(carName).getMileage();
                        carMap.get(carName).setMileage(oldMileage - kilometers);
                        System.out.printf("%s mileage decreased by %d kilometers%n", carName, kilometers);
                    }
                    break;
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().getMileage(), entry.getValue().getFuel());
        }
    }
}
/*
You have just bought the latest and greatest computer game – Need for Seed III.
Pick your favorite cars and drive them all you want! We know that you can't wait to start playing.
On the first line of the standard input, you will receive an integer n – the number of cars that you can obtain.
On the next n lines, the cars themselves will follow with their mileage and fuel available, separated by "|" in the following format:
"{car}|{mileage}|{fuel}"
Then, you will be receiving different commands, each on a new line, separated by " : ", until the "Stop" command is given:
•	"Drive : {car} : {distance} : {fuel}":
o	You need to drive the given distance, and you will need the given fuel to do that. If the car doesn't have enough fuel, print: "Not enough fuel to make that ride"
o	If the car has the required fuel available in the tank, increase its mileage with the given distance, decrease its fuel with the given fuel, and print:
"{car} driven for {distance} kilometers. {fuel} liters of fuel consumed."
o	You like driving new cars only, so if a car's mileage reaches 100 000 km, remove it from the collection(s) and print: "Time to sell the {car}!"
•	"Refuel : {car} : {fuel}":
o	Refill the tank of your car.
o	Each tank can hold a maximum of 75 liters of fuel, so if the given amount of fuel is more than you can fit in the tank, take only what is required to fill it up.
o	Print a message in the following format: "{car} refueled with {fuel} liters"
•	"Revert : {car} : {kilometers}":
o	Decrease the mileage of the given car with the given kilometers and print the kilometers you have decreased it with in the following format:
"{car} mileage decreased by {amount reverted} kilometers"
o	If the mileage becomes less than 10 000km after it is decreased, just set it to 10 000km and
DO NOT print anything.
Upon receiving the "Stop" command, you need to print all cars in your possession in the following format:
"{car} -> Mileage: {mileage} kms, Fuel in the tank: {fuel} lt."
Input/Constraints
•	The mileage and fuel of the cars will be valid, 32-bit integers, and will never be negative.
•	The fuel and distance amounts in the commands will never be negative.
•	The car names in the commands will always be valid cars in your possession.
Output
•	All the output messages with the appropriate formats are described in the problem description.

 */
