//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        int x = 10;
        int y = 20;

        System.out.println(isFishTasty);
        System.out.println(isJavaFun);

        // Expression
        System.out.println(x > y);

        // Real life
        int myAge = 25;
        int votingAge = 18;

        System.out.println(myAge >= votingAge);

        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote!");
        }
    }
}