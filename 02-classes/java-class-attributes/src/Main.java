//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int x = 5;
    int y = 3;
    final int z = 2;
    String fName = "John";
    String lName = "Jane";
    int age = 12;

    public static void main(String[] args) {
        // Class Attributes
        Main myObj = new Main();
        System.out.println(myObj.x);
        System.out.println(myObj.y);

        // Modify Attributes
        myObj.x = 24;
        System.out.println(myObj.x);

//        myObj.z = 11;  // final variable cannot change value

        // Multiple Objects
        Main myObj2 = new Main();
        Main myObj3 = new Main();

        myObj2.x = 11;
        System.out.println(myObj2.x);
        System.out.println(myObj3.x);

        System.out.println("Name: " + myObj.fName + " " + myObj.lName);
        System.out.println("Age: " + myObj.age);

    }
}