//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Widening Casting
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing Casting
        int intCast = (int) myDouble;
        System.out.println(intCast);

        // Real-Life Example
        // Make sure result is a floating-point

        int maxScore = 500;
        int useScore = 423;
        float percentage = (float) useScore / maxScore * 100.0F;

        System.out.println("User's percentage is " + percentage);

    }
}