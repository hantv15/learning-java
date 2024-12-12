class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig makes a sound");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.animalSound();
    }
}