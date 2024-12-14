//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        // Exceptions - Try Catch
        try {
            int[] myNumbers = {1, 2, 3, 4, 5};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }

        // Finally
        try {
            int[] myNumbers = {1, 2, 3, 4, 5};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("The 'try catch' is finished");
        }

        // Throw keyword
        checkAge(17);
    }
}