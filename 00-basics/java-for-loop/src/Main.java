//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // Nested loops
        for (int i = 0; i < 5; i++) {
            System.out.println("Outer: " + i);

            //Inner loop
            for (int j = 1; j <= 5; j++) {
                System.out.println(" Inner: " + j);
            }
        }

        // For-ech loop
        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String car : cars) {
            System.out.println(car);
        }
    }
}