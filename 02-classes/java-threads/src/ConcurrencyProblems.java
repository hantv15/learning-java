public class ConcurrencyProblems extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        ConcurrencyProblems thread = new ConcurrencyProblems();
        thread.start();

        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }

        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    public void run() {
        amount++;
    }
}