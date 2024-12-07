//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // If statement
        if (y > x) {
            System.out.println("y > x");
        }

        // Else statement
        int time = 21;

        if (time < 18) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }

        // Else If statement
        if (time < 18) {
            System.out.println("Good day!");
        } else if (time > 18) {
            System.out.println("Good morning!");
        } else {
            System.out.println("Good night!");
        }

        // Short Hand if...else (Ternary Operator)
        String result = (time > 18) ? "Good day!" : "Good evening!";
        System.out.println(result);
    }
}