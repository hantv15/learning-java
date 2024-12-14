//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Iterator
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Honda");

        Iterator<String> it = cars.iterator();

        System.out.println(it.next());

        // Looping Through a Collection
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }

        // Removing Items from a Collection
        while(it.hasNext()) {
            String i = it.next();
            if (i != "BMW") {
                it.remove();
            }
        }

        System.out.println(cars);
    }
}