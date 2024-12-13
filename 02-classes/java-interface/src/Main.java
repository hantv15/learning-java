//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
interface Animal {
    public void animalSound();
    public void run();
}

class Pig implements Animal {
    public void animalSound() {
        System.out.println("The pig says: wee, wee");
    }

    @Override
    public void run() {
        System.out.println("Zzzz");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
        pig.run();
    }
}