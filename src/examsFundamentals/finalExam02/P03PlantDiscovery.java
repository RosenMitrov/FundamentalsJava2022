package examsFundamentals.finalExam02;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//created by R.M.
public class P03PlantDiscovery {
    static class Plant {
        private String plantName;
        private double avgRating;
        private int rarity;

        public Plant(String plantName, int rarity) {
            this.plantName = plantName;
            this.rarity = rarity;
        }

        public String getPlantName() {
            return plantName;
        }

        public void setPlantName(String plantName) {
            this.plantName = plantName;
        }

        public double getAvgRating() {
            return avgRating;
        }

        public void setAvgRating(double avgRating) {
            this.avgRating = avgRating;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Plant> plantMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("<->");
            String plant = data[0];
            int rarity = Integer.parseInt(data[1]);
            if (!plantMap.containsKey(plant)) {
                plantMap.put(plant, new Plant(plant, rarity));
            }
            plantMap.get(plant).setRarity(rarity);

        }
        String input = scanner.nextLine();

        Map<String, List<Double>> ratingsMap = new LinkedHashMap<>();
        while (!input.equals("Exhibition")) {
            String[] data = input.split(": ");
            String command = data[0];
            String[] tokens = data[1].split(" - ");
            String plants = tokens[0];

            switch (command) {
                case "Rate":
                    double rating = Double.parseDouble(tokens[1]);
                    if (plantMap.containsKey(plants)){
                        ratingsMap.putIfAbsent(plants, new ArrayList<>());
                        ratingsMap.get(plants).add(rating);
                    } else {
                        System.out.println("error");
                    }

                    break;
                case "Update":
                    int updateRarity = Integer.parseInt(tokens[1]);
                    if (plantMap.containsKey(plants)){

                        plantMap.get(plants).setRarity(updateRarity);
                    }else {
                        System.out.println("error");
                    }
                    break;
                case "Reset":
                    if (plantMap.containsKey(plants)){
                        ratingsMap.get(plants).clear();
                    } else {
                        System.out.println("error");
                    }
                    break;
                default:
                    System.out.println("error");
                    break;
            }
            input = scanner.nextLine();
        }


        for (Map.Entry<String, List<Double>> entry : ratingsMap.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                double asDouble = entry.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                plantMap.get(entry.getKey()).setAvgRating(asDouble);
            } else {
                plantMap.get(entry.getKey()).setAvgRating(0.00);
            }
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Plant> entry : plantMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue().getRarity(), entry.getValue().getAvgRating());
        }


    }
}
