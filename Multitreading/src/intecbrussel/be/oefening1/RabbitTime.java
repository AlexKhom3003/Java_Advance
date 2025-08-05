package intecbrussel.be.oefening1;


import java.time.LocalDateTime;

public class RabbitTime {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Second " + i + "now: " + LocalDateTime.now());
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
