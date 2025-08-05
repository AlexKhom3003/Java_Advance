package intecbrussel.be;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //extends Thread
        //Vreer een subklas van Thread
        MyThread thread1 = new MyThread();

        //Implements runnable.
        //Pas een instance als een argument in Thread
        MyRunnable runnable1 = new MyRunnable();
        Thread thread2 = new Thread(runnable1);

        //thread1.setDaemon(true);
        //thread2.setDaemon(true);

        thread1.start();
        //thread1.join(3000)
        thread2.start();

    }
}
