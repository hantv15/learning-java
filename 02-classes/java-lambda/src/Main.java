import java.util.ArrayList;
import java.util.function.Consumer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

interface StringFunction {
    String run(String str);
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.forEach((n) -> { System.out.println(n); });
        // 1
        // 2
        // 3

        // Use Consumer interface to store a lambda express
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Honda");
        Consumer<String> method = (n) -> { System.out.println(n); };
        cars.forEach(method);
        // BMW
        // Audi
        // Honda

        //
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim); // Hello!
        printFormatted("Hello", ask); // Hello?
    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}