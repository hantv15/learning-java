//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int x = 5;

    public static void main(String[] args) {
        // create an object
        Main myObj = new Main();
        System.out.println(myObj.x);

        // multiple objects
        Main myObj2 = new Main();
        Main myObj3 = new Main();

        System.out.println(myObj2.x);
        System.out.println(myObj3.x);

        // using multiple classes
        Second mySecond = new Second();

        System.out.println(mySecond.x);
    }
}