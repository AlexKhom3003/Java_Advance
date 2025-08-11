package intecbrussel.be.Labwerk;

public class ThreadVoorbeeld {
    private int count = 0;

    public static void main(String[] args) {
        ThreadVoorbeeld voorbeeld = new ThreadVoorbeeld();

        InnerThread thread1 = new InnerThread(voorbeeld);
        InnerThread thread2 = new InnerThread(voorbeeld);
        InnerThread thread3 = new InnerThread(voorbeeld);

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Hallo vanaf de hoofdthread");

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }

        System.out.println("Final count = " + voorbeeld.getCount());
    }

    private static class InnerThread extends Thread {
        private final ThreadVoorbeeld voorbeeld;

        public InnerThread(ThreadVoorbeeld voorbeeld) {
            this.voorbeeld = voorbeeld;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }

            voorbeeld.incrementCount();

            System.out.println("Hallo vanaf thread " + this.getId() +
                    ", count is nu " + voorbeeld.getCount());
        }
    }

    public synchronized void incrementCount() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
