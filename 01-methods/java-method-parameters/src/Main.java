//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void myMethod(String fName) {
        System.out.println(fName + " Refsnes");
    }

    static void priNameAge(String fName, int age) {
        System.out.println(fName + " is " + age);
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("You are older than 18 years");
        } else {
            System.out.println("You are old enough!");
        }
    }

    static int sumOperator(int a, int b) {
        return a +b;
    }

    public static void main(String[] args) {
        // Parameters and Arguments
        myMethod("Liam");
        myMethod("Gold");

        // Multiple Parameters
        priNameAge("Liam", 18);
        priNameAge("Gold", 18);

        // A method with if...else
        checkAge(17);

        // Return Values
        int result = sumOperator(17, 18);
        System.out.println(result);
    }
}