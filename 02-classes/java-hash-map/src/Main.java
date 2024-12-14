import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // HashMap
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add Items
        // Add keys and values
        capitalCities.put("England", "LonDon");
        capitalCities.put("France", "Paris");
        capitalCities.put("Germany", "Berlin");
        System.out.println(capitalCities);

        // Access an Item
        System.out.println(capitalCities.get("Germany"));

        // Remove an Item
        capitalCities.remove("England");
        System.out.println(capitalCities);

        // Remove an Item
        HashMap<String, String> cars = new HashMap<String, String>();
        cars.put("Toyota", "Vios");
        cars.put("Mazda", "CX-5");

        cars.clear();
        System.out.println(cars);

        // HashMap Size
        System.out.println("cars is size: " + capitalCities.size());

        // Loop Through a HashMap

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        System.out.println("\n");

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + ", value: " + capitalCities.get(i));
        }

        // Other Types
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        people.put("John", 1);
        people.put("Steve", 20);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + ", value: " + people.get(i));
        }
    }
}