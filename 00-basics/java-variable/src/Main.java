//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Variables
        String name = "John";
        System.out.println(name);

        // Assign the value later
        int myNum;
        myNum = 23;
        System.out.println(myNum);

        // Overwrite
        int secondNum = 24;
        secondNum = 15;
        System.out.println(secondNum);

        // Final Variables
        final int finalNum = 23;
        // finalNum = 12 // will generate an error: cannot assign a value to a final variable

        // Other Types
        int intNum = 24;
        float myFloatNum = 3.3f;
        char myChar = 'A'; // declaring char required single quote
        boolean myBool = true;
        String myText = "Hello World!";

        // Print Variables
        System.out.println("Hello " + name);
        System.out.println(name + " " + myText);

        // Real-life Examples
        // Student data
        String studentName = "John Doe";
        int studentID = 12;
        int studentAge = 19;
        float studentFee = 23.3f;
        char studentGrade = 'A';

        //Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        // Calculate the Area of a Rectangle
        // Create integer variables
        int length = 4;
        int width = 6;
        int area;

        // Calculate the area of a rectangle
        area = length * width;

        // Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of the rectangle is: " + area);
    }
}