import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // HashSet - Unique
        HashSet<String> cars = new HashSet<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Volvo");
        cars.add("BMW");
        System.out.println(cars);

        // Check if an Item Exists
        System.out.println(cars.contains("Volvo"));
        System.out.println(cars.contains("Mazda"));

        // Remove an Item
        cars.remove("Audi");
        System.out.println(cars);

        // Loop Through a HashSet
        for (String i : cars) {
            System.out.println(i);
        }
    }
}