import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Define a Car class
class Car {
    public String brand;
    public String model;
    public int year;

    public Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }
}

// Create a comparator
class SortByYear implements Comparator {
    public int compare(Object o1, Object o2) {
        Car a = (Car) o1;
        Car b = (Car) o2;

        if (a.year < b.year) return -1;
        if (a.year > b.year) return 1;

        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a list of cars
        ArrayList<Car> myCars = new ArrayList<Car>();
        myCars.add(new Car("Mercedes", "C200", 2025));
        myCars.add(new Car("BMW", "X7", 2024));
        myCars.add(new Car("Audi", "R8", 2022));
        // [Car@3cb5cdba, Car@56cbfb61, Car@1134affc]

        // Use a comparator to sort the cars
        Comparator myComparator = new SortByYear();
        Collections.sort(myCars, myComparator);

        for (Car c : myCars) {
            System.out.println(c.brand + " " + c.model + " " + c.year);
        }

        // Audi R8 2022
        // BMW X7 2024
        // Mercedes C200 2025


    }
}