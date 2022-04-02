package mixed;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03NeedForSpeed {
    static class Car {
        private String car;
        private int mileage;
        private int fuel;

        public Car(String car, int mileage, int fuel) {
            this.car = car;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getCar() {
            return car;
        }

        public void setCar(String car) {
            this.car = car;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
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
            String[] data = scanner.nextLine().split("\\|");
            String car = data[0];
            int mileage = Integer.parseInt(data[1]);
            int fuel = Integer.parseInt(data[2]);
            Car currentCar = new Car(car, mileage, fuel);
            carMap.put(car, currentCar);
        }

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] data = input.split(" : ");
            String command = data[0];
            String carName = data[1];
            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(data[2]);
                    int fuel = Integer.parseInt(data[3]);
                    printTheResultOfDriven(carMap, carName, distance, fuel);
                    break;
                case "Refuel":
                    fuel = Integer.parseInt(data[2]);
                    printResultOfRefuel(carMap, carName, fuel);
                    break;
                case "Revert":
                    distance = Integer.parseInt(data[2]);
                    printResultOfRevert(carMap, carName, distance);
                    break;
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Car> entry : carMap.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().getMileage(), entry.getValue().getFuel());
        }
    }

    private static void printTheResultOfDriven(Map<String, Car> carMap, String carName, int distance, int fuel) {
        Car car = carMap.get(carName);
        int currentFuel = car.getFuel();
        int currentMileage = car.getMileage();
        if (currentFuel > fuel) {
            car.setFuel(currentFuel - fuel);
            car.setMileage(currentMileage + distance);
            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", carName, distance, fuel);
        } else {
            System.out.println("Not enough fuel to make that ride");
        }
        currentMileage = car.getMileage();
        if (currentMileage >= 100000) {
            carMap.remove(carName);
            System.out.printf("Time to sell the %s!%n", carName);
        }
    }

    private static void printResultOfRefuel(Map<String, Car> carMap, String carName, int fuel) {
        Car car = carMap.get(carName);
        int oldFuel = car.getFuel();
        int newFuel = Math.min(oldFuel + fuel, 75);
        car.setFuel(newFuel);
        System.out.printf("%s refueled with %d liters%n", carName, newFuel - oldFuel);
    }

    private static void printResultOfRevert(Map<String, Car> carMap, String carName, int distance) {
        Car car = carMap.get(carName);
        int mileage = car.getMileage();
        int newMileage = mileage - distance;
        if (newMileage >= 10000) {
            car.setMileage(newMileage);
            System.out.printf("%s mileage decreased by %d kilometers%n", carName, mileage - newMileage);
        } else {
            newMileage = 10000;
            car.setMileage(newMileage);
        }
    }
}
