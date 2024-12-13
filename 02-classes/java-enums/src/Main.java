//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
enum Level {
    LOW, MEDIUM, HIGH
}

public class Main {
    enum Order {
        FIRST, SECOND, THIRD
    }

    public static void main(String[] args) {
        // Enums
        Level myVar = Level.LOW;
        System.out.println(myVar);

        // Enum inside a class
        Order myOrd = Order.FIRST;
        System.out.println(myOrd);

        // Enum in a Switch Statement
        switch (myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

        // Loop Through an Enum
        for (Level item : Level.values()) {
            System.out.println(item);
        }
    }
}