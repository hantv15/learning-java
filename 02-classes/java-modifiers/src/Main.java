//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final int x = 10;
    final double PI = 3.14;

    static void myStaticMethod() {
        System.out.println("My static method");
    }

    public void myPublicMethod() {
        System.out.println("My public method");
    }

    public static void main(String[] args) {
        // Final
        Main myObj = new Main();
        // myObj.x = 50; //// will generate an error
        //myObj.PI = 23; //// will generate an error
        System.out.println(myObj.x);

        // static
        myObj.myPublicMethod();
        myStaticMethod();
    }
}