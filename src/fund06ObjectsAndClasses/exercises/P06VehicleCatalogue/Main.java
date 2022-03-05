package fund06ObjectsAndClasses.exercises.P06VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static fund06ObjectsAndClasses.exercises.P06VehicleCatalogue.Vehicle.printDataOfVehicle;

//created by R.M.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehiclesList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] currentData = input.split(" ");
            String type = currentData[0];
            String model = currentData[1];
            String colour = currentData[2];
            String horsePower = currentData[3];
            Vehicle currentVehicle = new Vehicle(type, model, colour, horsePower);
            vehiclesList.add(currentVehicle);
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        while (!input.equals("Close the Catalogue")) {
            printDataOfVehicle(vehiclesList, input);
            input = scanner.nextLine();
        }
        List<Vehicle> carsList = new ArrayList<>();
        double totalHpCars = 0.00;
        List<Vehicle> trucksList = new ArrayList<>();
        double totalHpTrucks = 0.00;
        for (Vehicle vehicle : vehiclesList) {
            if (vehicle.getType().equals("car")) {
                carsList.add(vehicle);
                totalHpCars += Double.parseDouble(vehicle.getHorsePower());
            } else if (vehicle.getType().equals("truck")) {
                trucksList.add(vehicle);
                totalHpTrucks += Double.parseDouble(vehicle.getHorsePower());
            }
        }
        double avgHpCars = 0.00;
        if (!carsList.isEmpty()) {
            avgHpCars = totalHpCars / carsList.size();
        }
        double avgHpTrucks = 0.00;
        if (!trucksList.isEmpty()) {
            avgHpTrucks = totalHpTrucks / trucksList.size();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", avgHpCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", avgHpTrucks);
    }
}
/*
6.	Vehicle Catalogue
You have to make a catalogue for vehicles.
You will receive two types of vehicle - car or truck.
Until you receive the command "End" you will receive lines of input in the format:
{typeOfVehicle} {model} {color} {horsepower}

After the "End" command, you will start receiving models of vehicles.
Print for every received vehicle its data in the format:
Type: {typeOfVehicle}
Model: {modelOfVehicle}
Color: {colorOfVehicle}
Horsepower: {horsepowerOfVehicle}

When you receive the command "Close the Catalogue",
stop receiving input and print the average horsepower for the cars and for the trucks in the format:
"{typeOfVehicles} have average horsepower of {averageHorsepower}."

The average horsepower is calculated by dividing the sum of horsepower for all vehicles of the type by the total count of vehicles from the same type.
Format the answer to the 2nd decimal point.
Constraints
•	The type of vehicle will always be car or truck
•	You will not receive the same model twice
•	The received horsepower will be integer in the interval [1…1000]
•	You will receive at most 50 vehicles
•	Single whitespace will be used for separator

 */