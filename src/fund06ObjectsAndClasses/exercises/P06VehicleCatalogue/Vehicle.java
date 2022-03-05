package fund06ObjectsAndClasses.exercises.P06VehicleCatalogue;

import java.util.List;

//created by R.M.
public class Vehicle {
    private String type;
    private String model;
    private String colour;
    private String horsePower;

    public Vehicle(String type, String model, String colour, String horsePower) {
        this.type = type;
        this.model = model;
        this.colour = colour;
        this.horsePower = horsePower;
    }

    public String getType() {
        return this.type;
    }

    public String getModel() {
        return this.model;
    }

    public String getColour() {
        return this.colour;
    }

    public String getHorsePower() {
        return this.horsePower;
    }

    public static void printDataOfVehicle(List<Vehicle> vehiclesList, String input) {
        for (Vehicle vehicle : vehiclesList) {
            if (vehicle.getModel().equals(input)) {
                System.out.printf(
                        "Type: %s%n" +
                                "Model: %s%n" +
                                "Color: %s%n" +
                                "Horsepower: %s%n",
                        vehicle.getType().toUpperCase().charAt(0) + vehicle.getType().substring(1),//make the first letter Upper
                        vehicle.getModel(),
                        vehicle.getColour(),
                        vehicle.getHorsePower());
            }
        }
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