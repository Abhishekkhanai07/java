import java.util.*;

class SummerPlantsApp {
    private static Map<String, List<String>> plantDatabase = new HashMap<>();

    static {
        plantDatabase.put("belagavi", Arrays.asList("Tomato", "Bell Pepper", "Basil"));
        plantDatabase.put("sankeshwar", Arrays.asList("Okra", "Watermelon", "Corn"));
        plantDatabase.put("solapur", Arrays.asList("Mango", "Pineapple", "Papaya"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your location: ");
        String location = scanner.nextLine().trim();
        
        List<String> plants = plantDatabase.getOrDefault(location, Collections.emptyList());
        
        if (plants.isEmpty()) {
            System.out.println("No summer plants found for your area.");
        } else {
            System.out.println("Summer plants for " + location + ":");
            for (String plant : plants) {
                System.out.println("- " + plant);
            }
        }
        
        scanner.close();
    }
}
