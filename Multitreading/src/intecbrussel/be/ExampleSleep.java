package intecbrussel.be;

public class ExampleSleep {
    public static void main(String[] args) {
        try {
            Thread thread01 = new Thread(new MyThread("0", 10));
            Thread thread02 = new Thread(new MyThread("-", 100));

            thread01.start();
            thread02.start();

            Thread.sleep(200);
            thread01.interrupt();
            Thread.sleep(500);
            thread01.interrupt();
            Thread.sleep(500);
            thread01.interrupt();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}
