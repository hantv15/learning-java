import java.util.ArrayList;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Collections;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Honda");
        System.out.println(cars);

        // Add Items
        ArrayList<String> bikes = new ArrayList<String>();
        bikes.add("Asama");
        bikes.add("BMX");
        System.out.println(bikes);

        // Add an item at a specified position
        bikes.add(0, "Thong Nhat");
        System.out.println(bikes);

        // Access an Item
        System.out.println(bikes.get(1));

        // Change an Item
        bikes.set(0, "Opel");
        System.out.println(bikes);

        // Remove an Item
        bikes.remove(0);
        System.out.println(bikes);
        // remove all elements use the clear() method
        // bikes.clear();

        // ArrayList Size
        System.out.println(bikes.size());

        // Loop Through an ArrayList
        for (int i = 0; i < bikes.size(); i++) {
            System.out.println(bikes.get(i));
        }

        for (String car : cars) {
            System.out.println(car);
        }

        // Other Types
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(25);
        for(int num : myNumbers) {
            System.out.println(num);
        }

        // Sort an ArrayList
        Collections.sort(cars);
        System.out.println(cars);

        Collections.sort(myNumbers);
        System.out.println(myNumbers);
    }
}