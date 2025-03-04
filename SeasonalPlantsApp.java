import java.util.*;

class SeasonalPlantsApp {
    private static Map<String, Map<String, List<String>>> plantDatabase = new HashMap<>();

    static {
       plantDatabase.put("Solapur", Map.of(
            "Summer", Arrays.asList("Jowar", "Bajra", "Groundnut"),
            "Winter", Arrays.asList("Wheat", "Chickpea", "Onion"),
            "Rainy", Arrays.asList("Soybean", "Paddy", "Turmeric")
        ));

        plantDatabase.put("Sankeshwar", Map.of(
            "Summer", Arrays.asList("Sugarcane", "Maize", "Tomato"),
            "Winter", Arrays.asList("Carrot", "Beetroot", "Cabbage"),
            "Rainy", Arrays.asList("Paddy", "Turmeric", "Green Gram")
        ));

        plantDatabase.put("Hukkeri", Map.of(
            "Summer", Arrays.asList("Maize", "Groundnut", "Chili"),
            "Winter", Arrays.asList("Wheat", "Garlic", "Potato"),
            "Rainy", Arrays.asList("Soybean", "Paddy", "Cotton")
        ));

        plantDatabase.put("Belagavi", Map.of(
            "Summer", Arrays.asList("Sugarcane", "Maize", "Sunflower"),
            "Winter", Arrays.asList("Wheat", "Chickpea", "Carrot"),
            "Rainy", Arrays.asList("Paddy", "Turmeric", "Green Gram")
        ));

        plantDatabase.put("Karnataka", Map.of(
            "Summer", Arrays.asList("Ragi", "Groundnut", "Sunflower"),
            "Winter", Arrays.asList("Wheat", "Carrot", "Potato"),
            "Rainy", Arrays.asList("Paddy", "Turmeric", "Sugarcane")
        ));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your location: ");
        String location = capitalize(scanner.nextLine().trim());
        System.out.print("Enter the season (Summer/Winter/Rainy): ");
        String season = capitalize(scanner.nextLine().trim());
        Map<String, List<String>> seasonPlants = plantDatabase.get(location);
        if (seasonPlants != null && seasonPlants.containsKey(season)) {
            System.out.println(season + " plants for " + location + ":");
            for (String plant : seasonPlants.get(season)) {
                System.out.println("- " + plant);
            }
        } else {
            System.out.println("No " + season.toLowerCase() + " plants found for your area.");
        }
        
        scanner.close();
    }

    private static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}
