public class ThreadImplement implements Runnable {
    public void run() {
        System.out.println("This code is running in a thread");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This is code is outside of the thread");

        // result
        // This is code is outside of the thread
        // This code is running in a thread
    }
}
