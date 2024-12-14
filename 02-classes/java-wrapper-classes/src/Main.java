import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ArrayList<int> myNumbers = new ArrayList<int>() // Invalid
        ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid

        // Creating Wrapper Objects
        Integer myInt = 5;
        Double myDouble = 5.0;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // Using methods
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());
    }
}