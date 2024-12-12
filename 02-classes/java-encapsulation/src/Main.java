//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
    public static void main(String[] args) {
        // Get and Set
        Main myObj = new Main();
        myObj.setName("John Doe");
        System.out.println(myObj.getName());
    }
}