package fund06ObjectsAndClasses.moreExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//created by R.M.
public class P02RawData {

    static class Car {
        private String model;
        private Engine engine;
        private Cargo cargo;
        private Tire tires;

        public Car(String model, Engine engine, Cargo cargo, Tire tires) {
            this.model = model;
            this.engine = engine;
            this.cargo = cargo;
            this.tires = tires;
        }

        public String getModel() {
            return model;
        }

        public Engine getEngine() {
            return engine;
        }

        public Cargo getCargo() {
            return cargo;
        }

        public Tire getTires() {
            return tires;
        }
    }


    static class Engine {
        private int engineSpeed;
        private int enginePower;

        public Engine(int engineSpeed, int enginePower) {
            this.engineSpeed = engineSpeed;
            this.enginePower = enginePower;
        }

        public int getEngineSpeed() {
            return engineSpeed;
        }

        public int getEnginePower() {
            return enginePower;
        }
    }

    static class Cargo {
        private int cargoWeight;
        private String cargoType;

        public Cargo(int cargoWeight, String cargoType) {
            this.cargoWeight = cargoWeight;
            this.cargoType = cargoType;
        }

        public int getCargoWeight() {
            return cargoWeight;
        }

        public String getCargoType() {
            return cargoType;
        }
    }

    static class Tire {
        private double pressureTire1;
        private int ageTire1;
        private double pressureTire2;
        private int ageTire2;
        private double pressureTire3;
        private int ageTire3;
        private double pressureTire4;
        private int ageTire4;

        public Tire(double pressureTire1, int ageTire1, double pressureTire2, int ageTire2, double pressureTire3, int ageTire3, double pressureTire4, int ageTire4) {
            this.pressureTire1 = pressureTire1;
            this.ageTire1 = ageTire1;
            this.pressureTire2 = pressureTire2;
            this.ageTire2 = ageTire2;
            this.pressureTire3 = pressureTire3;
            this.ageTire3 = ageTire3;
            this.pressureTire4 = pressureTire4;
            this.ageTire4 = ageTire4;
        }

        public double getPressureTire1() {
            return pressureTire1;
        }

        public int getAgeTire1() {
            return ageTire1;
        }

        public double getPressureTire2() {
            return pressureTire2;
        }

        public int getAgeTire2() {
            return ageTire2;
        }

        public double getPressureTire3() {
            return pressureTire3;
        }

        public int getAgeTire3() {
            return ageTire3;
        }

        public double getPressureTire4() {
            return pressureTire4;
        }

        public int getAgeTire4() {
            return ageTire4;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nCars = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < nCars; i++) {
            String[] data = scanner.nextLine().split(" ");
            String model = data[0];

            int speedEngine = Integer.parseInt(data[1]);
            int powerEngine = Integer.parseInt(data[2]);

            int weightCargo = Integer.parseInt(data[3]);
            String typeCargo = data[4];

            double pressureT1 = Double.parseDouble(data[5]);
            int ageT1 = Integer.parseInt(data[6]);
            double pressureT2 = Double.parseDouble(data[7]);
            int ageT2 = Integer.parseInt(data[8]);
            double pressureT3 = Double.parseDouble(data[9]);
            int ageT3 = Integer.parseInt(data[10]);
            double pressureT4 = Double.parseDouble(data[11]);
            int ageT4 = Integer.parseInt(data[12]);
            Engine engine = new Engine(speedEngine, powerEngine);
            Cargo cargo = new Cargo(weightCargo, typeCargo);
            Tire tire = new Tire(pressureT1, ageT1, pressureT2, ageT2, pressureT3, ageT3, pressureT4, ageT4);
            Car car = new Car(model, engine, cargo, tire);
            carList.add(car);

        }
        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            for (Car car : carList) {
                boolean isBadPressure =
                        (car.getTires().getPressureTire1() < 1)
                                || (car.getTires().getPressureTire2() < 1)
                                || (car.getTires().getPressureTire3() < 1)
                                || (car.getTires().getPressureTire4() < 1);
                if (isBadPressure) {
                    System.out.printf("%s%n", car.getModel());
                }
            }
        } else if (command.equals("flamable")) {
            for (Car car : carList) {
                boolean isGoodPowerEngine = car.getEngine().getEnginePower() > 250;
                if (isGoodPowerEngine) {
                    System.out.printf("%s%n", car.getModel());
                }
            }
        }
    }
}
/*
2.	Raw Data
You are the owner of a courier company and want to make a system for tracking your cars and their cargo.
Define a class Car that holds information about the model, engine, cargo, and a collection of exactly 4 tires.
The engine, cargo, and tire should be separate classes, create a constructor that receives all information about the Car and creates
and initializes its inner components (engine, cargo, and tires).
On the first line of input you will receive a number N - the number of cars you have,
on each of the next N lines you will receive information about a car in the format
"<Model> <EngineSpeed> <EnginePower> <CargoWeight> <CargoType> <Tire1Pressure> <Tire1Age> <Tire2Pressure> <Tire2Age> <Tire3Pressure> <Tire3Age> <Tire4Pressure> <Tire4Age>"
where the speed, power, weight and tire age are integers, tire pressure is a double.
After the N lines, you will receive a single line with one of 2 commands "fragile" or "flamable",
if the command is "fragile" print all cars whose Cargo Type is "fragile" with a tire whose pressure is  < 1 if the command is "flamable" print all cars whose Cargo Type is "flamable" and have Engine Power > 250. The cars should be printed in order of appearing in the input.

 */
