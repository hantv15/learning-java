import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // LinkedList
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        // Adds an item to the beginning of the list
        cars.addFirst("Toyota");
        System.out.println(cars);

        // Add an item to the end of the list
        cars.addLast("Mercedes");
        System.out.println(cars);

        // Remove an item from the beginning of the list
        cars.removeFirst();
        System.out.println(cars);

        // Remove an item from the end of the list
        cars.removeLast();
        System.out.println(cars);

        // Get the item at the beginning of the list
        System.out.println(cars.getFirst());

        // Get the item at the end of the list
        System.out.println(cars.getLast());
    }
}