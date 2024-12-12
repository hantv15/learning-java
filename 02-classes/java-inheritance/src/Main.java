class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}
// Inheritance
public class Main extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {
        Main myObj = new Main();

        myObj.honk();

        System.out.println(myObj.brand + " " + myObj.modelName);
    }
}