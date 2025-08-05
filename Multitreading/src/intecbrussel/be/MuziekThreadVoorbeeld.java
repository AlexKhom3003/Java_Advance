package intecbrussel.be;

public class MuziekThreadVoorbeeld {
    public static void main(String[] args) {

        Thread muziekThread = new Thread(()->{
            try {
                while (true){
                    System.out.println("Muziek speelt... ");
                    Thread.sleep(1000);
                }
            }catch (InterruptedException e){
                System.out.println("Muziekthread is onderbroken. ");
            }
        });
        muziekThread.setDaemon(true);
        muziekThread.start();
        System.out.println("Winkel is open... ");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Winkel sluit... ");
    }
}
