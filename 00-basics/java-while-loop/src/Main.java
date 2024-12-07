//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // While loop
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Do/While loop
        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 5);

        // Real-life examples
        int countdown = 3;
        while (countdown > 0) {
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!!");

        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("No Yatzy.");
            } else {
                System.out.println("Yatzy!");
            }
            dice = dice + 1;
        }
    }
}