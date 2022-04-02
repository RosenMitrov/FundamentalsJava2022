package mixed;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputData = scanner.nextLine().split("\\|");
            String car = inputData[0];
            int mileage = Integer.parseInt(inputData[1]);
            int fuel = Integer.parseInt(inputData[2]);

            if (!carMap.containsKey(car)) {
                carMap.put(car, new ArrayList<>());
                carMap.get(car).add(mileage);
                carMap.get(car).add(fuel);
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] inputData = input.split(" : ");
            String command = inputData[0];
            String keyCar = inputData[1];
            switch (command) {
                case "Drive":
                    int distance = Integer.parseInt(inputData[2]);
                    int fuel = Integer.parseInt(inputData[3]);
                    int currentMileage = carMap.get(keyCar).get(0);
                    int currentFuel = carMap.get(keyCar).get(1);

                    if (fuel > currentFuel) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carMap.get(keyCar).set(0, currentMileage + distance);
                        carMap.get(keyCar).set(1, currentFuel - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", keyCar, distance, fuel);

                    }
                    if (carMap.get(keyCar).get(0) >= 100000) {
                        carMap.remove(keyCar);
                        System.out.printf("Time to sell the %s!%n" , keyCar);
                    }
                    break;
                case "Refuel":
                    int refuel = Integer.parseInt(inputData[2]);

                    int oldFuel = Integer.parseInt(String.valueOf(carMap.get(keyCar).get(1)));
                    if (refuel + carMap.get(keyCar).get(1) > 75) {
                        carMap.get(keyCar).set(1, 75);
                        System.out.printf("%s refueled with %d liters%n", keyCar, 75 - oldFuel);//тук
                    } else {
                        int newFuel = oldFuel + refuel;
                        carMap.get(keyCar).set(1, newFuel);
                        System.out.printf("%s refueled with %d liters%n", keyCar, refuel);
                    }
                    break;
                case "Revert":
                    int km = Integer.parseInt(inputData[2]);
                    int currentKm = carMap.get(keyCar).get(0);
                    int newKM = currentKm - km;
///////////////////
                    if (newKM <= 10000) {
                        carMap.get(keyCar).set(0, 10000);
                    } else {
                        carMap.get(keyCar).set(0, newKM);
                        System.out.printf("%s mileage decreased by %d kilometers%n", keyCar, km);
                    }

                    break;
                default:
                    break;

            }
            input = scanner.nextLine();
        }

        carMap.entrySet().forEach(entry -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1)));
    }
}
