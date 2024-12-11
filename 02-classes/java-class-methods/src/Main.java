//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();

        // Static vs. Public
        myStaticMethod();
        // myPublicMethod(); This would compile an error

        Main myObj = new Main();
        myObj.myPublicMethod();

        // Using Multiple Classes
        Second mySecondObj = new Second();
        mySecondObj.fullThrottle();
        mySecondObj.speed(299);

    }
}