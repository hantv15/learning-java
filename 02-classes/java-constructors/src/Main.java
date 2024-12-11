//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int age;
    String fname;

    public Main(int y, String name) {
        age = y;
        fname = name;
    }
    public static void main(String[] args) {
        // Constructors
//        Main myObj = new Main();
//        System.out.println(myObj.x);

        // Constructors Parameters
        Main myObj = new Main(5, "Han");
        System.out.println(myObj.fname + " is " + myObj.age + " years old");
    }
}