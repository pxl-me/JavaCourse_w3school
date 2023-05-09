package HashMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Create a HashMap object
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Ukraine", "Kyiv");
        capitalCities.put("USA", "Washington DC");

        // Print keys and values
        // System.out.println(capitalCities);
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

        System.out.println(capitalCities.get("Ukraine"));

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }



    }
}
