package fund06ObjectsAndClasses.moreExercises;

import java.util.*;

//created by R.M.
public class P03CarSalesman {

    static class Car {
        private String carModel;
        private Engine engine;
        private String weight;//optional
        private String color;//optional

        public Car(String carModel, Engine engine, String weight, String color) {
            this.carModel = carModel;
            this.engine = engine;
            this.weight = weight;
            this.color = color;
        }

        public String getCarModel() {
            return carModel;
        }

        public Engine getEngine() {
            return engine;
        }

        public String getWeight() {
            return weight;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return String.format("%s:%n" +
                    "%s" +
                    "  Weight: %s%n" +
                    "  Color: %s", getCarModel(), getEngine(), getWeight(), getColor());
        }
    }

    static class Engine {
        private String modelEngine;
        private String power;
        private String displacement;//optional
        private String efficiency;//optional

        public Engine(String modelEngine, String power, String displacement, String efficiency) {
            this.modelEngine = modelEngine;
            this.power = power;
            this.displacement = displacement;
            this.efficiency = efficiency;
        }

        public String getModelEngine() {
            return modelEngine;
        }

        public String getPower() {
            return power;
        }

        public String getDisplacement() {
            return displacement;
        }

        public String getEfficiency() {
            return efficiency;
        }

        @Override
        public String toString() {
            return String.format("    %s:%n" +
                    "    Power: %s%n" +
                    "    Displacement: %s%n" +
                    "    Efficiency: %s%n", getModelEngine(), getPower(), getDisplacement(), getEfficiency());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        //data for engines
        Map<String, Engine> engineMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            //"{Model} {Power} {Displacement} {Efficiency}
            String[] data = scanner.nextLine().split(" ");
            String engineModel = data[0];
            String power = data[1];
            String displacement = "n/a";
            String efficiency = "n/a";

            if (data.length == 3) {
                if (data[2].matches("\\d+")) {
                    displacement = data[2];
                } else {
                    efficiency = data[2];
                }
            } else if (data.length == 4) {

                if (data[2].matches("\\d+")) {
                    displacement = data[2];
                    efficiency = data[3];
                } else {
                    efficiency = data[2];
                    displacement = data[3];
                }
            }
            Engine currentEngine = new Engine(engineModel, power, displacement, efficiency);
            engineMap.put(engineModel, currentEngine);
        }

        int m = Integer.parseInt(scanner.nextLine());

        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            //"{Model} {Engine} {Weight} {Color}",
            String[] data = scanner.nextLine().split(" ");
            String carModel = data[0];
            String engine = data[1];
            String weight = "n/a";
            String color = "n/a";

            if (data.length == 3) {
                if (data[2].matches("\\d+")) {
                    weight = data[2];
                } else {
                    color = data[2];
                }
            } else if (data.length == 4) {
                if (data[2].matches("\\d+")) {
                    weight = data[2];
                    color = data[3];
                } else {
                    color = data[2];
                    weight = data[3];
                }
            }
            if (engineMap.containsKey(engine)) {
                Engine engineToAdd = engineMap.get(engine);
                Car currentCar = new Car(carModel, engineToAdd, weight, color);
                carList.add(currentCar);
            }
        }

        for (Car car : carList) {
            System.out.printf("%s%n", car.toString());
//            System.out.printf("%s:%n", car.getCarModel());
//            System.out.printf("  %s:%n", car.getEngine().getModelEngine());
//            System.out.printf("    Power: %s%n", car.getEngine().getPower());
//            System.out.printf("    Displacement: %s%n", car.getEngine().getDisplacement());
//            System.out.printf("    Efficiency: %s%n", car.getEngine().getEfficiency());
//            System.out.printf("  Weight: %s%n", car.getWeight());
//            System.out.printf("  Color: %s%n", car.getColor());
        }
    }
}
/*
3.	Car Salesman
Define two classes Car and Engine. A Car has a model, engine, weight, and color.
An Engine has a model, power, displacement, and efficiency. A Car’s weight and color and its Engine’s displacements and efficiency are optional.
On the first line, you will read a number N which will specify how many lines of engines you will receive,
on each of the next N lines you will receive information about an Engine in the following format "{Model} {Power} {Displacement} {Efficiency}".
After the lines with engines, on the next line, you will receive a number M – specifying the number of Cars that will follow,
on each of the next M lines information about a Car will follow in the following format "{Model} {Engine} {Weight} {Color}",
where the engine in the format will be the model of an existing Engine. When creating the object for a Car,
you should keep a reference to the real engine in it, instead of just the engine’s model, note that the optional properties might be missing from the formats.
Your task is to print each car (in the order you received them) and its information in the format defined below,
if any of the optional fields have not been given print "n/a" in its place instead:
{CarModel}:
  {EngineModel}:
    Power: {EnginePower}
    Displacement: {EngineDisplacement}
    Efficiency: {EngineEfficiency}
  Weight: {CarWeight}
  Color: {CarColor}

 */