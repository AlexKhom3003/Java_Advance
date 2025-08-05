package intecbrussel.be;

public class MultiThreaadingDemo implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
        } catch (Exception e) {
            System.out.println("Exception is caught.");
        }
    }
}
