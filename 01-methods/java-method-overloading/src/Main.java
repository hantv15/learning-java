//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    static double plusMethodInt(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(1, 2);
        double myNum2 = plusMethodDouble(1.2, 2.7);
        System.out.println(myNum1);
        System.out.println(myNum2);

        // Method Overloading
        int myNum3 = plusMethodInt(1, 2);
        double myNum4 = plusMethodDouble(1.2, 2.7);
        System.out.println(myNum3);
        System.out.println(myNum4);
    }
}