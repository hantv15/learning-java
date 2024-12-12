// Built-in Packages//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Built-in Packages
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");

        String userName = scanner.nextLine();
        System.out.println("Username is: " + userName);
    }
}